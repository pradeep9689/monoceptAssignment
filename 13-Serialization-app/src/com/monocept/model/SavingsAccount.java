package com.monocept.model;

public class SavingsAccount extends Account {
    private double minBalance;

    public SavingsAccount(int accno, String name, double balance, double minBalance) {
        super(accno, name, balance);
        this.minBalance = minBalance;
    }

    
    public void debit(double amount) {
        if (getBalance() - amount >= minBalance) {
            setBalance(getBalance() - amount);
            System.out.println("Debited " + amount + ". New balance is " + getBalance());
            return;
        }
        System.out.println("Cannot go below minimum balance.");
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }


   }