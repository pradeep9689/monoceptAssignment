package com.monocept.observer.test;

import com.monocept.observer.model.Account;
import com.monocept.observer.model.EmailNotifier;
import com.monocept.observer.model.INotifier;
import com.monocept.observer.model.SmsNotifier;

public class TestObserverPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Account account = new Account(12345, "Pradeep", 1000.0);
	        INotifier emailNotifier = new EmailNotifier();
	        INotifier smsNotifier = new SmsNotifier();

	        account.registerNotifier(emailNotifier);
	        account.registerNotifier(smsNotifier);

	        account.deposit(500);
	        account.withdraw(200);
	        
	       try {
			Account account2=(Account)account.clone();
			account2.deposit(300);
			account2.withdraw(700);
			 account2.registerNotifier(emailNotifier);
		        account2.registerNotifier(smsNotifier);
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
	       
	    }
	
	}


