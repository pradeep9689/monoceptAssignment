package com.monocept.model;

public class Account {
private int accountNumber;
private int accountType;
String accType;
private String accountHolderName;
private double balance;

public void intializeDetails(int accountNumber1,int accountType1,String accountHolderName1,double balance1) {
	
	 accountNumber=accountNumber1;
	accountType=accountType1;
	if(accountType==0) {
		accType="saving";
	}
	else {
		accType="cuurent";
	}
	 accountHolderName=accountHolderName1;
	 balance=balance1;
	
}
public void displayDeatils() {
	System.out.println("Account Number: "+accountNumber);
	
	System.out.println("Account Type: "+accType);
	System.out.println("Account Holder Name: "+accountHolderName);
	System.out.println("balance: "+balance);
}

}
