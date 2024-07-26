package com.monocept.model;

public class Account {
	private int accno;
    private String name;
    private double balance;

    public Account(int accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    public int getAccno() {
        return accno;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accno=" + accno +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }


}
