package ru.satahippy.youtube_downloader;

import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.util.List;

import static org.junit.Assert.*;

public class DownloaderTest {

    private String videoUrl = "https://www.youtube.com/watch?v=IZKv4qbRnIk";

    private Downloader downloader;

    @Before
    public void setup() {
        downloader = new Downloader();
    }

    @org.junit.Test
    public void testVideos() throws Exception {
        List<Video> videos = downloader.videos(videoUrl);

        assertEquals(4, videos.size());
        videos.forEach(video -> assertEquals("SampleVideo", video.getTitle()));
    }

    @org.junit.Test
    public void testDownloadToOutputStream() throws Exception {
        List<Video> videos = downloader.videos(videoUrl);
        assertNotEquals(0, videos.size());

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        downloader.download(videos.get(0), out);
        assertNotEquals(0, out.size());
    }

}