package com.monocept.factory.model;

public class SavingAccount implements IAccount {
    private String accNo;
    private String accName;
    private double balance;

    public SavingAccount(String accNo, String accName, double balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;
    }
    

    public String getAccNo() {
		return accNo;
	}


	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}


	public String getAccName() {
		return accName;
	}


	public void setAccName(String accName) {
		this.accName = accName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
    public void credit(double amount) {
        balance += amount;
        System.out.println("Amount credited: " + amount + ". New balance: " + balance);
    }

    @Override
    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount debited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}