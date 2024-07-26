package com.monocept.observer.model;

public class SmsNotifier implements INotifier {
    private static SmsNotifier instance;

    private SmsNotifier() {}

    public static SmsNotifier getInstance() {
        if (instance == null) {
            instance = new SmsNotifier();
        }
        return instance;
    }

    @Override
    public void notifyUser(Account account) {
        System.out.println("SMS Notification: Account balance updated. New balance: " + account.getBalance());
    }
}
