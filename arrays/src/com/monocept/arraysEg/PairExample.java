package com.monocept.arraysEg;
import java.util.Arrays;
import java.util.Scanner;


public class PairExample { 

    static boolean chkPair(int A[], int size, int x)
    {
        for (int i = 0; i < (size - 1); i++) {
            for (int j = (i + 1); j < size; j++) {
                if (A[i] + A[j] == x) {
                    return true;
                }
            }
        }

        return false;
    }
	 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=scanner.nextInt();
		
		int array[]=new int[n];
		
		System.out.println("enter elements");
		
		for(int i=0;i<n;i++) 
		{
			array[i]=scanner.nextInt();
		} 
		
		int size = array.length;
		
		sort(array,size);
		int sum=0;
		for(int i=0;i<n;i++)
		{
	sum+=array[i];
		}
		int avg=sum/size;
	
	       

	        if (chkPair(array, size, avg)) {
	            System.out.println("true");
	        }
	        else {
	            System.out.println("false");
	        }

			}


	private static void sort(int[] a, int n) {
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
		
		
	}


}	