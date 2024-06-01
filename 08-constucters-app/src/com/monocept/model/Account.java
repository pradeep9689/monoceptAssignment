package com.monocept.model;

public class Account {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	
	
	public Account()
	{
		 accountNumber=0;
		 accountHolderName="";
		 balance=0.0;
	}
	
	public Account(int accountNumber,String accountHolderNmae,double balance) 
	{
		 this.accountNumber=accountNumber;
		 this.accountHolderName=accountHolderNmae;
		 this.balance=balance;
	}
	
	public void setAccNo(int accountNumber) 
	{
		this.accountNumber= accountNumber;
	}
	public void setAccName(String accountHolderName) 
	{
		this.accountHolderName= accountHolderName;
	}
	public void setAccBalance(double balance) 
	{
		this.balance=balance ;
	}
	
	public int getaccNo() 
	{
		return accountNumber;
	}
	public String getName() 
	{
		return accountHolderName;
	}
	public double getBal() 
	{
		return balance;
	}

}
