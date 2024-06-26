package com.monocept.model;

import com.monocept.interfaces.Borrowable;

public class BorrowService {
	 public void borrowBook(Borrowable item, User user) {
	        item.borrowBook(user);
	    }

	    public void returnBook(Borrowable item, User user) {
	        item.returnBook(user);
	    }
	}