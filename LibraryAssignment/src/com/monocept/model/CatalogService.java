package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class CatalogService {
    private List<Book> catalog;

    public CatalogService() {
        this.catalog = new ArrayList<>();
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void displayCatalog() {
        System.out.println("Catalog Contents:");
        for (Book book : catalog) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

