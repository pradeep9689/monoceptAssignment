package com.monocept.test;

import com.monocept.model.Book;
import com.monocept.model.BorrowService;
import com.monocept.model.CatalogService;
import com.monocept.model.EBook;
import com.monocept.model.User;

public class LibraryManagementSystemTest {

	public static void main(String[] args) {
		  
        Book book1 = new Book("Gitanjali", "Rabindranath Tagore");
        User user1 = new User("Pradeep", "U123");
        EBook eBook1=new EBook("Java","Akash","www.google.com");

        BorrowService borrowService = new BorrowService();
        CatalogService catalogService = new CatalogService();

        book1.catalogBook(catalogService);
        eBook1.catalogBook(catalogService);

        catalogService.displayCatalog();

        borrowService.borrowBook(book1, user1);
        borrowService.borrowBook(eBook1, user1);
        
        borrowService.returnBook(book1, user1);

      
        catalogService.displayCatalog();
    }


	

}
