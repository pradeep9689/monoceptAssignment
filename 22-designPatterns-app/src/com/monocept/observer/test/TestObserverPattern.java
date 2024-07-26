package com.monocept.observer.test;

import com.monocept.observer.model.Account;
import com.monocept.observer.model.EmailNotifier;
import com.monocept.observer.model.INotifier;
import com.monocept.observer.model.NotifierAlreadyExistsException;
import com.monocept.observer.model.NotifierNotFoundException;
import com.monocept.observer.model.SmsNotifier;

public class TestObserverPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account singletonAccount = Account.getInstance(); singletonAccount.initialize(1, "pradeep", 10000);		
	
		EmailNotifier emailNotifier = EmailNotifier.getInstance();
		SmsNotifier smsNotifier = SmsNotifier.getInstance();

        try {
            singletonAccount.registerNotification(emailNotifier);
            singletonAccount.registerNotification(smsNotifier);
           
            
            singletonAccount.registerNotification(emailNotifier); 

        } catch (NotifierAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        
        
        Account account1 = new Account();
        account1.initialize(12345, "John Doe", 1000.0);
        try {
            account1.registerNotification(emailNotifier);
            account1.registerNotification(smsNotifier);
           
        } catch (NotifierAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        Account account2 = new Account();
        account2.initialize(67890, "Jane Smith", 2000.0);
        try {
            account2.registerNotification(emailNotifier);
            account2.registerNotification(smsNotifier);
        
        } catch (NotifierAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        account1.deposit(500); 
        account1.withdraw(200); 
     
        account2.deposit(1000); 
        account2.withdraw(300); 

        
        try {
            account1.removeNotification(smsNotifier);
            account1.removeNotification(smsNotifier); 
        } catch (NotifierNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}