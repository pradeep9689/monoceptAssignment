package com.monocept.arraysEg;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

 System.out.print("Enter the number of elements in the array: ");
 
  int n = scanner.nextInt();
  
		  int[] array = new int[n];
		  
		        System.out.println("Enter the elements of the array:");
		        
		        for (int i = 0; i < n; i++) 
		        {
		            System.out.print("Element " + (i + 1) + ": ");
		            array[i] = scanner.nextInt();
		        }

		      
		        int sum = 0;
		        for (int i = 0; i < array.length; i++) {
		            sum += array[i];
		        }

		      
		        System.out.println("Sum of all the elements of the array: " + sum);

		        scanner.close();
		    
		

	}

}
