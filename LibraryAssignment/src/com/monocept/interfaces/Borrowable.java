package com.monocept.interfaces;

import com.monocept.model.User;

public interface Borrowable {
	 void borrowBook(User user);
	    void returnBook(User user);

}
