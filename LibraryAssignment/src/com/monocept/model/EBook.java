package com.monocept.model;

public class EBook extends Book {
    private String downloadLink;

    public EBook(String title, String author, String downloadLink) {
        super(title, author);
        this.downloadLink = downloadLink;
    }

    public String getDownloadLink() {
        return downloadLink;
    }
}