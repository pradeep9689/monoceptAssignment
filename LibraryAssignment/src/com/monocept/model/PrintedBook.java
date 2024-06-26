package com.monocept.model;

public class PrintedBook extends Book {
    private String libraryShelfLocation;

    public PrintedBook(String title, String author, String libraryShelfLocation) {
        super(title, author);
        this.libraryShelfLocation = libraryShelfLocation;
    }

    public String getLibraryShelfLocation() {
        return libraryShelfLocation;
    }
}
