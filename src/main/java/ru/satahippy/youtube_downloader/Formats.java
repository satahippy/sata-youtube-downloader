package ru.satahippy.youtube_downloader;

import java.util.HashMap;
import java.util.Map;

public class Formats {

    private Map<String, Format> formats = new HashMap<>();

    {
        formats.put("18", new Format("mp4", 640, 360, "aac", "h264"));
        formats.put("22", new Format("mp4", 1280, 720, "aac", "h264"));
        formats.put("135", new Format("mp4", null, 480, null, "h264"));
    }

    public Format get(String itag) {
        return formats.get(itag);
    }
}
