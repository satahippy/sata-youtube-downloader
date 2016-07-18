package ru.satahippy.youtube_downloader;

import java.util.HashMap;
import java.util.Map;

public class Formats {

    private Map<String, Format> formats = new HashMap<>();

    {
        formats.put("5", new Format("flv", 400, 240, "mp3", "h263"));
        formats.put("6", new Format("flv", 450, 270, "mp3", "h263"));
        formats.put("13", new Format("3gp", null, null, "aac", "mp4v"));
        formats.put("17", new Format("3gp", 176, 144, "aac", "mp4v"));
        formats.put("18", new Format("mp4", 640, 360, "aac", "h264"));
        formats.put("22", new Format("mp4", 1280, 720, "aac", "h264"));
        formats.put("34", new Format("flv", 640, 360, "aac", "h264"));
        formats.put("35", new Format("flv", 854, 480, "aac", "h264"));
        formats.put("36", new Format("3gp", 320, null, "aac", "mp4v"));
        formats.put("37", new Format("mp4", 1920, 1080, "aac", "h264"));
        formats.put("38", new Format("mp4", 4096, 3072, "aac", "h264"));
        formats.put("43", new Format("webm", 640, 360, "vorbis", "vp8"));
        formats.put("44", new Format("webm", 854, 480, "vorbis", "vp8"));
        formats.put("45", new Format("webm", 1280, 720, "vorbis", "vp8"));
        formats.put("46", new Format("webm", 1920, 1080, "vorbis", "vp8"));
        formats.put("59", new Format("mp4", 854, 480, "aac", "h264"));
        formats.put("78", new Format("mp4", 854, 480, "aac", "h264"));
        formats.put("82", new Format("mp4", null, 360, "aac", "h264"));
        formats.put("83", new Format("mp4", null, 480, "aac", "h264"));
        formats.put("84", new Format("mp4", null, 720, "aac", "h264"));
        formats.put("85", new Format("mp4", null, 1080, "aac", "h264"));
        formats.put("91", new Format("mp4", null, 144, "aac", "h264"));
        formats.put("92", new Format("mp4", null, 240, "aac", "h264"));
        formats.put("93", new Format("mp4", null, 360, "aac", "h264"));
        formats.put("94", new Format("mp4", null, 480, "aac", "h264"));
        formats.put("95", new Format("mp4", null, 720, "aac", "h264"));
        formats.put("96", new Format("mp4", null, 1080, "aac", "h264"));
        formats.put("100", new Format("webm", null, 360, "vorbis", "vp8"));
        formats.put("101", new Format("webm", null, 480, "vorbis", "vp8"));
        formats.put("102", new Format("webm", null, 720, "vorbis", "vp8"));
        formats.put("132", new Format("mp4", null, 240, "aac", "h264"));
        formats.put("133", new Format("mp4", null, 240, null, "h264"));
        formats.put("134", new Format("mp4", null, 360, null, "h264"));
        formats.put("135", new Format("mp4", null, 480, null, "h264"));
        formats.put("136", new Format("mp4", null, 720, null, "h264"));
        formats.put("137", new Format("mp4", null, 1080, null, "h264"));
        formats.put("138", new Format("mp4", null, null, null, "h264"));
        formats.put("139", new Format("m4a", null, null, "aac", null));
        formats.put("140", new Format("m4a", null, null, "aac", null));
        formats.put("141", new Format("m4a", null, null, "aac", null));
        formats.put("151", new Format("mp4", null, 72, "aac", "h264"));
        formats.put("160", new Format("mp4", null, 144, null, "h264"));
        formats.put("167", new Format("webm", 640, 360, null, "vp8"));
        formats.put("168", new Format("webm", 854, 480, null, "vp8"));
        formats.put("169", new Format("webm", 1280, 720, null, "vp8"));
        formats.put("170", new Format("webm", 1920, 1080, null, "vp8"));
        formats.put("171", new Format("webm", null, null, "vorbis", null));
        formats.put("172", new Format("webm", null, null, "vorbis", null));
        formats.put("218", new Format("webm", 854, 480, null, "vp8"));
        formats.put("219", new Format("webm", 854, 480, null, "vp8"));
        formats.put("242", new Format("webm", null, 240, null, "vp9"));
        formats.put("243", new Format("webm", null, 360, null, "vp9"));
        formats.put("244", new Format("webm", null, 480, null, "vp9"));
        formats.put("245", new Format("webm", null, 480, null, "vp9"));
        formats.put("246", new Format("webm", null, 480, null, "vp9"));
        formats.put("247", new Format("webm", null, 720, null, "vp9"));
        formats.put("248", new Format("webm", null, 1080, null, "vp9"));
        formats.put("249", new Format("webm", null, null, "opus", null));
        formats.put("250", new Format("webm", null, null, "opus", null));
        formats.put("251", new Format("webm", null, null, "opus", null));
        formats.put("256", new Format("m4a", null, null, "aac", null));
        formats.put("258", new Format("m4a", null, null, "aac", null));
        formats.put("264", new Format("mp4", null, 1440, null, "h264"));
        formats.put("266", new Format("mp4", null, 2160, null, "h264"));
        formats.put("271", new Format("webm", null, 1440, null, "vp9"));
        formats.put("272", new Format("webm", null, 2160, null, "vp9"));
        formats.put("278", new Format("webm", null, 144, null, "vp9"));
        formats.put("298", new Format("mp4", null, 720, null, "h264"));
        formats.put("299", new Format("mp4", null, 1080, null, "h264"));
        formats.put("302", new Format("webm", null, 720, null, "vp9"));
        formats.put("303", new Format("webm", null, 1080, null, "vp9"));
        formats.put("308", new Format("webm", null, 1440, null, "vp9"));
        formats.put("313", new Format("webm", null, 2160, null, "vp9"));
        formats.put("315", new Format("webm", null, 2160, null, "vp9"));
    }

    public Format get(String itag) {
        return formats.get(itag);
    }
}
