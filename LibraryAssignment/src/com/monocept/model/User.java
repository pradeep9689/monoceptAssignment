package com.monocept.model;

import com.monocept.interfaces.Borrowable;

public class User {
    private String name;
    private String userId;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public void borrowBook(Borrowable item) {
        item.borrowBook(this);
    }

    public void returnBook(Borrowable item) {
        item.returnBook(this);
    }
}
