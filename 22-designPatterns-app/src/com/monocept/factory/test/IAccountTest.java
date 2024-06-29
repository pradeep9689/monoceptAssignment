package com.monocept.factory.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.monocept.factory.model.AccountFactory;
import com.monocept.factory.model.IAccount;

public class IAccountTest {

	private static final Scanner scanner = new Scanner(System.in);
    private static final int MAX_ACCOUNTS = 100;
    private static final IAccount[] accounts = new IAccount[MAX_ACCOUNTS];
    private static int accountCount = 0;

    public static void main(String[] args) {
        while (true) {
            printMenu();
            String choice = scanner.nextLine();
            if (choice.equals("5")) {
                System.out.println("Exiting...");
                break;
            }
            handleChoice(choice);
        }
    }

    private static void printMenu() {
        System.out.println("\n1. Create Saving Account");
        System.out.println("2. Create Current Account");
        System.out.println("3. Credit Account");
        System.out.println("4. Debit Account");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void handleChoice(String choice) {
        switch (choice) {
            case "1":
                createSavingAccount();
                break;
            case "2":
                createCurrentAccount();
                break;
            case "3":
                creditAccount();
                break;
            case "4":
                debitAccount();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void createSavingAccount() {
        if (accountCount >= MAX_ACCOUNTS) {
            System.out.println("Account limit reached. Cannot create more accounts.");
            return;
        }
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();
        System.out.print("Enter Account Name: ");
        String accName = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = Double.parseDouble(scanner.nextLine());
        accounts[accountCount++] = AccountFactory.createAccount("Saving", accNo, accName, balance);
        System.out.println("Saving Account Created Successfully.");
    }

    private static void createCurrentAccount() {
        if (accountCount >= MAX_ACCOUNTS) {
            System.out.println("Account limit reached. Cannot create more accounts.");
            return;
        }
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();
        System.out.print("Enter Overdraft Limit: ");
        double overDraftLimit = Double.parseDouble(scanner.nextLine());
        accounts[accountCount++] = AccountFactory.createAccount("Current", accNo, null, overDraftLimit);
        System.out.println("Current Account Created Successfully.");
    }

    private static void creditAccount() {
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();
        System.out.print("Enter Amount to Credit: ");
        double amount = Double.parseDouble(scanner.nextLine());
        IAccount account = findAccountByNumber(accNo);
        if (account != null) {
            account.credit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void debitAccount() {
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();
        System.out.print("Enter Amount to Debit: ");
        double amount = Double.parseDouble(scanner.nextLine());
        IAccount account = findAccountByNumber(accNo);
        if (account != null) {
            account.debit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static IAccount findAccountByNumber(String accNo) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccNo().equals(accNo)) {
                return accounts[i];
            }
        }
        return null;
    }
}