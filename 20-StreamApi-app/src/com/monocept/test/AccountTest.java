package com.monocept.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.monocept.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> accounts = Arrays.asList(
                new Account(101, "Jayash", 14500.0),
                new Account(102, "Nagesh", 5300.0),
                new Account(103, "prateek", 7200.0),
                new Account(104, "suyash", 4700.0),
                new Account(105, "manvendra", 1200.0),
                new Account(106, "akash", 2000.0)
        );
		

       
        Account minBalanceAccount = accounts.stream()
                .min((a1, a2) -> Double.compare(a1.getBalance(), a2.getBalance()))
                .orElseThrow(() -> new RuntimeException("No accounts found"));
        System.out.println("Account with minimum balance: " + minBalanceAccount);
        

      
        Account maxBalanceAccount = accounts.stream()
                .max((a1, a2) -> Double.compare(a1.getBalance(), a2.getBalance()))
                .orElseThrow(() -> new RuntimeException("No accounts found"));
        System.out.println("Account with maximum balance: " + maxBalanceAccount);

     
        List<String> namesGreaterThan6Chars = accounts.stream()
                .filter(account -> account.getName().length() > 6)
                .map(Account::getName)
                .collect(Collectors.toList()); 
        System.out.println("Names greater than 6 characters: " + namesGreaterThan6Chars);

        
        double totalBalance = accounts.stream()
                .mapToDouble(Account::getBalance)
                .sum();
        System.out.println("Total balance of all accounts: " + totalBalance);
    }
}