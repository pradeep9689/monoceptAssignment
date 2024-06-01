package com.monocept.arraysEg;

import java.util.Arrays;
import java.util.Scanner;

public class SqureOfArray {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the number of elements in the array: ");

		 int n = scanner.nextInt();
		 int[] array = new int[n];
		 for (int i = 0; i < n; i++) 
	        {
	           System.out.print("Element " + (i + 1) + ": ");
	           array[i] = scanner.nextInt();
	        }
		 
		 System.out.println("Before sort ");
	        for (int i = 0; i < n; i++)
	            System.out.print(array[i] + " ");
	 

	       sortSquares(array);
	      
	        
	        System.out.println("\nAfter squre and sort ");
	        
	        for (int i = 0; i < n; i++) 
	        {
	            System.out.print(array[i] + " ");
	            }
	}
		

	
	
	    
	 	public static void sortSquares(int array[]) {
	            int n = array.length;
	            int[] result = new int[n];
	            int left = 0, right = n - 1;
	            int pos = n - 1;

	           
	            while (left <= right) 
	            {
	             int leftSquare = array[left] * array[left];
	             int rightSquare = array[right] * array[right];
	                if (leftSquare > rightSquare)
	                {
	                    result[pos] = leftSquare;
	                    left++;
	                } else {
	                    result[pos] = rightSquare;
	                    right--;
	                }
	                pos--;
	            }

	          
	            for (int i = 0; i < n; i++) {
	                array[i] = result[i];
	            }
	        
		

}}
