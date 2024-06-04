package com.monocept.model;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accno, String name, double balance, double overdraftLimit) {
        super(accno, name, balance);
        this.overdraftLimit = overdraftLimit;
    }

   
    public void debit(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Debited " + amount + ". New balance is " + getBalance());
            return;
        }
        System.out.println("Exceeded overdraft limit.");
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }


	
   
    
}