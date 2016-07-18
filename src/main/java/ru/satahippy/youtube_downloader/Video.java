package ru.satahippy.youtube_downloader;

public class Video {

    private String title;

    private String url;

    private Format format;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public String getFilename() {
        return title + "." + format.getExtension();
    }
}
