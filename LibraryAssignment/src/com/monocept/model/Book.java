package com.monocept.model;

import com.monocept.interfaces.Borrowable;
import com.monocept.interfaces.Catalogable;

public class Book implements Borrowable, Catalogable {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

	@Override
	public void catalogBook(CatalogService catalogService) {
		
		 catalogService.addBook(this);
	        System.out.println("Cataloged: " + title);
		
	}

	@Override
	public void borrowBook(User user) {
		  if (!isBorrowed) {
	            setBorrowed(true);
	            
	            System.out.println(user.getName() + " borrowed " + title);
	        }
		
	}

	@Override
	public void returnBook(User user) {
		 if (isBorrowed) {
	            setBorrowed(false);
	          
	            System.out.println(user.getName() + " returned " + title);
	        }
		
	}
}
