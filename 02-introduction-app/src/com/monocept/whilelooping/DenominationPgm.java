package com.monocept.whilelooping;

import java.util.Scanner;

public class DenominationPgm {
	 
	    public static void atmNotes(int amount) {
	        int[] denominations = {2000, 500, 200, 100};
	        int[] notesCount = new int[denominations.length];
	        
	        for (int i = 0; i < denominations.length; i++) {
	            notesCount[i] = amount / denominations[i];
	            amount %= denominations[i];
	        }
	        
	        System.out.println("Denomination  :  Notes");
	        for (int i = 0; i < denominations.length; i++) {
	            System.out.println(denominations[i] + "/- :  " + notesCount[i]);
	        }
	    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int amount;
        do {
            System.out.print("Enter the amount (multiple of 100 and not exceeding 50000): ");
            amount = scanner.nextInt();
            if (amount % 100 != 0 || amount > 50000) {
                System.out.println("Amount must be a multiple of 100 and not exceed 50000.");
            }
        } while (amount % 100 != 0 || amount > 50000);
        scanner.close();

        atmNotes(amount);

	}

}