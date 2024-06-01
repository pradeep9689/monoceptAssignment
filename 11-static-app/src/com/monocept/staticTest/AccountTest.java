package com.monocept.staticTest;

import com.monocept.staticModel.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account(123,"Pradeep",2000);
		System.out.println(account1);
        Account account2 = new Account(124, "satish", 1500);
        System.out.println(account2);
        System.out.println();
        

        System.out.println("Number of accounts created: " + Account.getAccountCount());
		

	}

}
