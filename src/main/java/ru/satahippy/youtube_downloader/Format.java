package ru.satahippy.youtube_downloader;

public class Format {

    private String extension;

    private Integer width;

    private Integer height;

    private String acodec;

    private String vcodec;

    public Format(String extension, Integer width, Integer height, String acodec, String vcodec) {
        this.extension = extension;
        this.width = width;
        this.height = height;
        this.acodec = acodec;
        this.vcodec = vcodec;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getAcodec() {
        return acodec;
    }

    public void setAcodec(String acodec) {
        this.acodec = acodec;
    }

    public String getVcodec() {
        return vcodec;
    }

    public void setVcodec(String vcodec) {
        this.vcodec = vcodec;
    }
}
