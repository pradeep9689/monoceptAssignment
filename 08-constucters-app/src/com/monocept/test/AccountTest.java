package com.monocept.test;

import com.monocept.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account1=new Account();
		System.out.println("Account 1:");
		System.out.println("("+account1.getaccNo()+", "+account1.getName()+","+account1.getBal()+")"); 
		account1.setAccNo(1987870);
		account1.setAccName("Pradeep");
		account1.setAccBalance(200000);
		System.out.println("("+account1.getaccNo()+", "+account1.getName()+","+account1.getBal()+")");
		
		Account account2=new Account(916253,"Atish",80000);
		System.out.println("Account 2:");
		System.out.println("("+account2.getaccNo()+", "+account2.getName()+","+account2.getBal()+")");


	}

}
