package ru.satahippy.youtube_downloader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.*;
import java.util.stream.Collectors;

public class Downloader {

    private static Formats formats = new Formats();

    public List<Video> videos(String url) throws IOException {
        Map<String, Object> data = getJsonData(url);
        Map<String, Object> args = (Map<String, Object>) data.get("args");

        List<Video> videos = parseVideoStreamData((String) args.get("url_encoded_fmt_stream_map"));
        String title = (String) args.get("title");

        videos.forEach(video -> video.setTitle(title));
        return videos;
    }
    
    public InputStream download(Video video) throws IOException {
        URL videoUrl = new URL(video.getUrl());
        return videoUrl.openStream();
    }

    public void download(Video video, OutputStream out) throws IOException {
        try (InputStream in = download(video)) {
            copy(in, out);
        }
    }

    private Map<String, Object> getJsonData(String url) throws IOException {
        URL videoPageUrl = new URL(url);

        try (
            BufferedReader in = new BufferedReader(new InputStreamReader(videoPageUrl.openStream()));
        ) {
            String line;
            while ((line = in.readLine()) != null)
            {
                int jsonDataStartIndex;

                if((jsonDataStartIndex = line.indexOf("ytplayer.config")) != -1)
                {
                    jsonDataStartIndex = line.indexOf("=", jsonDataStartIndex) + 1;
                    String jsonData = line.substring(jsonDataStartIndex).trim();

                    ObjectMapper mapper = new ObjectMapper();
                    return mapper.readValue(jsonData, new TypeReference<Map<String, Object>>(){});
                }
            }
        }

        throw new ParsingVideoDataException("Video data not found");
    }

    private List<Video> parseVideoStreamData(String videosStreamDataString) throws IOException {
        List<Video> videos = new ArrayList<>();

        for (Map<String, String> videoParameters : getVideosParametersFromStreamString(videosStreamDataString)) {
            String itag = videoParameters.get("itag");
            String url = URLDecoder.decode(videoParameters.get("url"), "UTF-8");
            Format format = formats.get(itag);

            if (format == null) {
                continue;
            }

            Video video = new Video();
            video.setUrl(url);
            video.setFormat(format);
            videos.add(video);
        }
        return videos;
    }

    private Collection<Map<String, String>> getVideosParametersFromStreamString(String videosStreamDataString) {
        return Arrays.stream(videosStreamDataString.split(","))
            .map(videosStreamData -> videosStreamData.split("&"))
            .map(
                videosStreamParameters -> Arrays.stream(videosStreamParameters)
                    .map(videosStreamParameter -> videosStreamParameter.split("="))
                    .collect(Collectors.toMap(
                        videosStreamParameterParts -> videosStreamParameterParts[0],
                        videosStreamParameterParts -> videosStreamParameterParts[1]
                    ))
            )
            .collect(Collectors.toSet());
    }

    private void copy(InputStream src, OutputStream dest) throws IOException {
        final ReadableByteChannel srcChannel = Channels.newChannel(src);
        final WritableByteChannel destChannel = Channels.newChannel(dest);
        final ByteBuffer buffer = ByteBuffer.allocateDirect(16 * 1024);

        while(srcChannel.read(buffer) != -1) {
            buffer.flip();
            destChannel.write(buffer);
            buffer.compact();
        }

        buffer.flip();

        while(buffer.hasRemaining()) {
            destChannel.write(buffer);
        }
    }
}
