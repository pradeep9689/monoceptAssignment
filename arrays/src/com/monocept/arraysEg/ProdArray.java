package com.monocept.arraysEg;

import java.util.Scanner;

public class ProdArray {
	void productArray(int arr[], int n) 
    { 
  
       
        if (n == 1) { 
            System.out.print(0); 
            return; 
        } 
       
        int left[] = new int[n]; 
        int right[] = new int[n]; 
        int prod[] = new int[n]; 
  
        int i, j; 
  
     
        left[0] = 1; 
  
       
        right[n - 1] = 1; 
  
      
        for (i = 1; i < n; i++) 
            left[i] = arr[i - 1] * left[i - 1]; 
  
       
        for (j = n - 2; j >= 0; j--) 
            right[j] = arr[j + 1] * right[j + 1]; 
  
        for (i = 0; i < n; i++) 
            prod[i] = left[i] * right[i]; 
  
       
        for (i = 0; i < n; i++) 
            System.out.print(prod[i] + " "); 
  
        return; 
    }

	public static void main(String[] args) {
		 ProdArray pa = new  ProdArray(); 
		 System.out.println("Enter array size");
			Scanner scanner=new Scanner(System.in);
			int n=scanner.nextInt();
			
			int[] array = new int[n];
			System.out.println("enter elements");
			for(int i=0;i<n;i++) {
				array[i]=scanner.nextInt();
				
			} 
	        int size = array.length; 
	        System.out.println("The product array is : "); 
	        pa.productArray(array, size); 

	}

}
