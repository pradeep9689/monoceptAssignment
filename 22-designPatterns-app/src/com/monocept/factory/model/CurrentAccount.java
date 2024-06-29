package com.monocept.factory.model;

public class CurrentAccount implements IAccount {
    private String accNo;
    private double overDraftLimit;
    private double balance;

    public CurrentAccount(String accNo, double overDraftLimit) {
        this.accNo = accNo;
        this.overDraftLimit = overDraftLimit;
        this.balance = 0;
    }
    

    public String getAccNo() {
		return accNo;
	}


	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}


	public double getOverDraftLimit() {
		return overDraftLimit;
	}


	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
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
        if (amount <= balance + overDraftLimit) {
            balance -= amount;
             System.out.println("Amount debited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}