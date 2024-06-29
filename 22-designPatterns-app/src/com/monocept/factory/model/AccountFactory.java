package com.monocept.factory.model;

public class AccountFactory {
	  public static IAccount createAccount(String accountType, String accNo, String accName, double balance) {
	        if ("Saving".equals(accountType)) {
	            return new SavingAccount(accNo, accName, balance);
	        }
	        if ("Current".equals(accountType)) {
	            return new CurrentAccount(accNo, balance);
	        }
	        throw new IllegalArgumentException("Unknown account type");
	    }
	

}
