package com.monocept.model;

import com.monocept.Exceptions.InsufficientFundsException;
import com.monocept.Exceptions.NegativeAmountException;

public class BankAccount {
	private int accountNumber;
	private String accountName;
	private double balance;
	public BankAccount(int accountNumber, String accountName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount<0)
			throw new NegativeAmountException();
		System.out.println(balance+=amount);
	}
	public void withdrwal(double amount) {
		if(amount>this.balance)
			throw new  InsufficientFundsException();
		System.out.println(balance-=amount);
	}

}
