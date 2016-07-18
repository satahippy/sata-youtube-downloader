package ru.satahippy.youtube_downloader;


import java.io.*;
import java.util.*;

public class Example {

    private static Downloader downloader = new Downloader();

    public static void main(String[] args) throws IOException {
        Collection<Video> videos = downloader.videos("https://www.youtube.com/watch?v=4ymFc5zIX8A");
        for (Video video : videos) {
            try (
                OutputStream out = new BufferedOutputStream(new FileOutputStream(video.getFilename()));
            ) {
                downloader.download(video, out);
            }
        }
    }
}
