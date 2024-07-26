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
    public void setName(String name) {
 		this.name = name;
 	}

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
		this.userId = userId;
	}

    public void borrowBook(Borrowable item) {
        item.borrowBook(this);
    }

 

	public void returnBook(Borrowable item) {
        item.returnBook(this);
    }
}
