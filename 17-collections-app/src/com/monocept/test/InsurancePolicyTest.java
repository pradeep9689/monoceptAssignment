package com.monocept.test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

import com.monocept.model.CompareClass;
import com.monocept.model.InsurancePolicy;

public class InsurancePolicyTest {
	
	public static void main(String[] args) throws ParseException {
		 ArrayList<InsurancePolicy> policies = new ArrayList<>();
		 Scanner scanner = new Scanner(System.in);
	       
	        boolean a=false;

	        
	        int n;

	        System.out.print("Enter the number of policies: ");
	        n = scanner.nextInt();
	        scanner.nextLine(); 
	        
	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter details for policy " + (i + 1));
	            System.out.print("Policy Number: ");
	            int policyNumber = scanner.nextInt();
	            scanner.nextLine();
	            System.out.print("Policy Holder Name: ");
	            String policyHolderName = scanner.nextLine();
	            System.out.print("Policy Amount: ");
	            double policyAmount = scanner.nextDouble();
	            scanner.nextLine(); 
	            System.out.print("Policy Creation Date (yyyy-MM-dd): ");
	            String policyCreationDate = scanner.nextLine();
	            
	            policies.add(new InsurancePolicy(policyNumber, policyHolderName, policyAmount, policyCreationDate));
	        }
	        int choice;
	        while(!a) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Sort by Name");
	            System.out.println("2. Sort by Amount");
	            System.out.println("3. Sort by Policy Number");
	            System.out.println("4. Sort by Policy Date");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); 
	            
	            switch (choice) {
	                case 1:
	                    Collections.sort(policies,new CompareClass.SortByName()); 
	                    System.out.println("Sorted by Name:"+policies);
	                    break;
	                case 2:
	                    Collections.sort(policies,new CompareClass.SortByAmount());
	                    System.out.println("Sorted by Amount:"+policies);
	                    break;
	               
	                case 3:
	                    Collections.sort(policies,new CompareClass.SortByNumber()); 
	               
	                    System.out.println("Sorted by Policy Number:"+policies);
	                    break;
	                case 4:
	                    Collections.sort(policies,new CompareClass.SortByDate());
	                    System.out.println("Sorted by Creation Date:"+policies);
	                    break;
	                case 5:
	                    System.out.println("Exited");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	            
	         
	        } 
	        
	        scanner.close();
	    }
	

	

}
