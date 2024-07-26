package com.monocept.observer.model;

public class EmailNotifier implements INotifier {
    private static EmailNotifier instance;

    private EmailNotifier() {}

    public static EmailNotifier getInstance() {
        if (instance == null) {
            instance = new EmailNotifier();
        }
        return instance;
    }

    @Override
    public void notifyUser(Account account) {
        System.out.println("Email Notification: Account balance updated. New balance: " + account.getBalance());
    }
}
