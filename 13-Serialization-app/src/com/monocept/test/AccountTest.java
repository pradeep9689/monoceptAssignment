package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.monocept.model.Account;

import com.monocept.model.CurrentAccount;
import com.monocept.model.SavingsAccount;

public class AccountTest {
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
    	
         SavingsAccount savingsAccount=null;
        CurrentAccount currentAccount=null;
        
        
        public void run() {
            while (true) {
                System.out.println("\nSelect Account Type :");
                System.out.println("1. Savings");
                System.out.println("2. Current");
                System.out.println("3. Exit");
                System.out.print("Enter Your Choice: ");
                Scanner scanner;
				int accountTypeChoice = scanner.nextInt();

                if (accountTypeChoice == 1) {
                    System.out.println("You chose Savings Account.");
                    optionSavingsAccount();
                    continue;
                }
                if (accountTypeChoice == 2) {
                    System.out.println("You chose Current Account.");
                    optionCurrentAccount();
                    continue;
                }
                if (accountTypeChoice == 3) {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                System.out.println("Invalid choice. Please try again.");
            }
        }

        private void optionSavingsAccount() {
            while (true) {
                System.out.println("\nSelect Operation :");
                System.out.println("1. Create Account");
                System.out.println("2. Display Account Details");
                System.out.println("3. Credit into Account");
                System.out.println("4. Debit from Account");
               
                System.out.println("5. Exit");
                System.out.print("Enter Your Choice: ");
                Scanner scanner;
				int savingsOperationChoice = scanner.nextInt();

                
				if (savingsOperationChoice == 1) {
                	savingsAccount = createSavingsAccount();
                    System.out.println("Your Account is created.");
                    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("savingsAccount.txt"))) {
                        out.writeObject(savingsAccount);
                        System.out.println("\nSaving Account details are stored into SavingAccount.txt");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    continue;
                }
                if (savingsOperationChoice == 2) {
                    if (savingsAccount == null) {
                        System.out.println("Savings Account not created yet.");
                        continue;
                    }
                    try (ObjectInputStream objectinputstream = new ObjectInputStream(new FileInputStream("savingsAccount.txt"))) {
                    	SavingsAccount  savingaccount = (SavingsAccount) objectinputstream.readObject();
                        System.out.println("Account Number: "+savingaccount.getAccno());
                        System.out.println("Account Holder Name: "+savingaccount.getName());
                        System.out.println("Cuurent Balance: "+savingaccount.getBalance());
                        System.out.println("Maintain Minimum Balanace: "+savingaccount.getMinBalance());
                       
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    continue;
                }
                if (savingsOperationChoice == 3) {
                    if (savingsAccount == null) {
                        System.out.println("Savings Account not created yet.");
                        continue;
                    }
                    creditAccount(savingsAccount);
                    continue;
                }
                if (savingsOperationChoice == 4) {
                    if (savingsAccount == null) {
                        System.out.println("Savings Account not created yet.");
                        continue;
                    }
                    debitAccount(savingsAccount);
                    continue;
                }
               
                
                if (savingsOperationChoice == 5) {
                    break;
                }
                System.out.println("Invalid choice. Please try again.");
            }
        }

        private void optionCurrentAccount() {
            while (true) {
                System.out.println("\nSelect Operation :");
                System.out.println("1. Create Account");
                System.out.println("2. Display Account Details");
                System.out.println("3. Credit into Account");
                System.out.println("4. Debit from Account");
               
                System.out.println("5. Exit");
                System.out.print("Enter Your Choice: ");
                Scanner scanner;
				int currentOperationChoice = scanner.nextInt();

                
				if (currentOperationChoice == 1) {
                    currentAccount = createCurrentAccount();
                    System.out.println("Your Account is created.");
                    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("currentAccount.txt"))) {
                        out.writeObject(currentAccount);
                        System.out.println("\nCurrent Account details are stored into currentAccount.txt");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    continue;
                }
                if (currentOperationChoice == 2) {
                    if (currentAccount == null) {
                        System.out.println("Current Account not created yet.");
                        continue;
                    }
                    try (ObjectInputStream objectinputstream = new ObjectInputStream(new FileInputStream("currentAccount.txt"))) {
                    	CurrentAccount  currentaccount = (CurrentAccount) objectinputstream.readObject();
                        System.out.println("Account Number: "+currentaccount.getAccno());
                        System.out.println("Account Holder Name: "+currentaccount.getName());
                        System.out.println("Cuurent Balance: "+currentaccount.getBalance());
                        System.out.println("OverDraftLimit: "+currentaccount.getOverdraftLimit());
                       
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();}


                    continue;
                }
                if (currentOperationChoice == 3) {
                    if (currentAccount == null) {
                        System.out.println("Current Account not created yet.");
                        continue;
                    }
                    creditAccount(currentAccount);
                    continue;
                }
                if (currentOperationChoice == 4) {
                    if (currentAccount == null) {
                        System.out.println("Current Account not created yet.");
                        continue;
                    }
                    debitAccount(currentAccount);
                    continue;
                }
               
                if (currentOperationChoice == 5) {
                    break;
                }
                System.out.println("Invalid choice. Please try again.");
            }
        }

        private CurrentAccount createCurrentAccount() {
            System.out.println("You selected creating new account.");
            System.out.print("Enter Account Number: ");
            Scanner scanner;
			int accno = scanner.nextInt();
            scanner.nextLine();  
            System.out.print("Enter Account Holder Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Opening Balance: ");
            double balance = scanner.nextDouble();
            System.out.print("Enter Overdraft Limit: ");
            double overdraftLimit = scanner.nextDouble();
            return new CurrentAccount(accno, name, balance, overdraftLimit);
        }

        private SavingsAccount createSavingsAccount() {
            System.out.println("You selected creating new account.");
            System.out.print("Enter Account Number: ");
            Scanner scanner;
			int accno = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter Account Holder Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Opening Balance: ");
            double balance = scanner.nextDouble();
            System.out.print("Enter Minimum Balance: ");
            double minBalance = scanner.nextDouble();
            return new SavingsAccount(accno, name, balance, minBalance);
        }

        private void creditAccount(Account account) {
            System.out.println("You selected crediting into account.");
            System.out.print("Enter Amount to credit: ");
            Scanner scanner;
			double amount = scanner.nextDouble();
            account.credit(amount);
        }

        private void debitAccount(Account account) {
            System.out.println("You selected debiting from account.");
            System.out.print("Enter Amount to debit: ");
            Scanner scanner;
			double amount = scanner.nextDouble();
            account.debit(amount);
        }
    }
