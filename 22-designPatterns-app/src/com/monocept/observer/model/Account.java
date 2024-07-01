package com.monocept.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Account implements Cloneable{

	    private int accountNumber;
	    private String name;
	    private double balance;
	    private List<INotifier> notifiers;

	    public Account(int accountNumber, String name, double balance) {
	        this.accountNumber = accountNumber;
	        this.name = name;
	        this.balance = balance;
	        this.notifiers = new ArrayList<>();
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            notifyAllNotifiers();
	        } else {
	            System.out.println("Insufficient funds");
	        }
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        notifyAllNotifiers();
	    }

	    public void registerNotifier(INotifier notifier) {
	        notifiers.add(notifier);
	    }

	    private void notifyAllNotifiers() {
	        for (INotifier notifier : notifiers) {
	            notifier.notifyUser(this);
	        }
	    }

	   
	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getBalance() {
	        return balance;
	    }

		@Override
		public Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
	    
	}