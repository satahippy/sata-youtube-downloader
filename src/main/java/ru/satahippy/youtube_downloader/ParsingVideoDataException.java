package ru.satahippy.youtube_downloader;

public class ParsingVideoDataException extends RuntimeException {

    public ParsingVideoDataException(String message) {
        super(message);
    }

    public ParsingVideoDataException(String message, Throwable cause) {
        super(message, cause);
    }
}