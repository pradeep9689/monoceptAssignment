package com.monocept.observer.model;

public class SmsNotifier implements INotifier {
    @Override
    public void notifyUser(Account account) {
        System.out.println("SMS Notification: Account " + account.getAccountNumber() +
                " balance is " + account.getBalance());
    }
}
