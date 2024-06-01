package com.monocept.arraysEg;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		 
		  int n = scanner.nextInt();
		int [] array = new int [n];
		
		
		 for (int i = 0; i < n; i++) 
	        {
	            System.out.print("Element " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }

          
        int max = array[0];  
        
        for (int i = 0; i < array.length; i++) {  
            
           if(array[i] > max)  
               max = array[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  

	}

}
