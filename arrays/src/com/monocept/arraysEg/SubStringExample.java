package com.monocept.arraysEg;

import java.util.Scanner;

public class SubStringExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        if (isSubstring(str1, str2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();

	}
	  public static boolean isSubstring(String str1, String str2) {
	        int m = str1.length();
	        int n = str2.length();

	        
	        if (n > m) {
	            return false;
	        }

	        
	        for (int i = 0; i <= m - n; i++) {
	            int j;
	           
	            for (j = 0; j < n; j++) {
	                if (str1.charAt(i + j) != str2.charAt(j)) {
	                    break;
	                }
	            }
	            if (j == n) {
	                return true; 
	            }
	        }

	        return false; 
	    }

}