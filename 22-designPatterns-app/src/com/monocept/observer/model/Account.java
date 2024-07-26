package com.monocept.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;
    private List<INotifier> notifications = new ArrayList<>();

    private static Account instance;

    public Account() {}

    public static Account getInstance() {
        if (instance == null) {
            instance = new Account();
        }
        return instance;
    }

    public void initialize(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
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

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            notifyAllUsers();
        }
    }

    public void deposit(double amount) {
        balance += amount;
        notifyAllUsers();
    }

    public void registerNotification(INotifier notifier) throws NotifierAlreadyExistsException {
        if (notifications.contains(notifier)) {
            throw new NotifierAlreadyExistsException("Notifier is already registered.");
        }
        notifications.add(notifier);
    }

    public void removeNotification(INotifier notifier) throws NotifierNotFoundException {
        if (!notifications.contains(notifier)) {
            throw new NotifierNotFoundException("Notifier is not registered.");
        }
        notifications.remove(notifier);
    }

    private void notifyAllUsers() {
        for (INotifier notifier : notifications) {
            notifier.notifyUser(this);
        }
    
    }}