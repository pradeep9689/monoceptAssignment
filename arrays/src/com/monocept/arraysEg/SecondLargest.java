package com.monocept.arraysEg;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter array size");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		int[] array = new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
			
		}
		System.out.println(getSecondLargest(array, n));
		

	}
	public static int getSecondLargest(int[] a,int n){  
		int temp;  
		for (int i = 0; i < n; i++)   
        {  
		         
		            for (int j = i+n; j < n; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  }
		        
		       return a[n-2];  
		}  

}
