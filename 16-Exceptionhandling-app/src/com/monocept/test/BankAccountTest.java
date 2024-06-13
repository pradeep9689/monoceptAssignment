package com.monocept.test;

import com.monocept.model.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		try {
		BankAccount bankaccount1=new BankAccount(1223,"pradeep",1000);
		bankaccount1.deposit(-100);
		bankaccount1.withdrwal(10000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
