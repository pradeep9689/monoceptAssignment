package com.monocept.observer.model;

public class EmailNotifier implements INotifier {
    @Override
    public void notifyUser(Account account) {
        System.out.println("Email Notification: Account " + account.getAccountNumber() +
                " balance is " + account.getBalance());
    }
}
