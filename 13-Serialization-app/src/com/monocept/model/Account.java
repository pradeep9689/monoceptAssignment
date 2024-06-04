package com.monocept.model;

import java.io.Serializable;

public class Account implements Serializable{

private int accno;
private String name;
private double balance;

public Account(int accno, String name, double balance) {
    this.accno = accno;
    this.name = name;
    this.balance = balance;
}

public void credit(double amount) {
    this.balance += amount;
    System.out.println("Credited " + amount + ". New balance is " + balance);
}

public void debit(double amount) {
    if (balance >= amount) {
        balance -= amount;
        System.out.println("Debited " + amount + ". New balance is " + balance);
        return;
    }
    System.out.println("Insufficient balance.");
}

public int getAccno() {
    return accno;
}

public void setAccno(int accno) {
    this.accno = accno;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public double getBalance() {
    return balance;
}

public void setBalance(double balance) {
    this.balance = balance;
}




}