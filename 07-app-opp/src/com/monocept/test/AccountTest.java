package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1=new Account();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr Account 1 details -");
		System.out.println("Enetr Account Number- ");
		int accountNumber=scanner.nextInt();
		System.out.println("choose Account Type 0.Saving  1.current: ");
		int accountType=scanner.nextInt();
		System.out.println("Enetr Account holder Name: ");
		String accountHolderName=scanner.next();
		System.out.println("Enetr Balance- ");
		double balance=scanner.nextInt();
		account1.intializeDetails(accountNumber,accountType, accountHolderName,balance);
		account1.displayDeatils();
		
		
		
		Account account2=new Account();
		
		System.out.println("Enetr Account 1 details -");
		System.out.println("Enetr Account Number- ");
		 accountNumber=scanner.nextInt();
		System.out.println("choose Account Type 0.Saving  1.current: ");
	 accountType=scanner.nextInt();
		System.out.println("Enetr Account holder Name: ");
		 accountHolderName=scanner.next();
		System.out.println("Enetr Balance- ");
	 balance=scanner.nextInt();
		account2.intializeDetails(accountNumber,accountType, accountHolderName,balance);
		account2.displayDeatils();

	}

}
