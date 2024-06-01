package com.monocept.forlooping;

import java.util.Scanner;

public class forloopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime numbers:");
		System.out.println("range Start:");
		Scanner scanner=new Scanner(System.in);
		int start=scanner.nextInt();
		System.out.println("range end:");
		int end=scanner.nextInt();
        for (int i = start; i <= end; i++) 
        {
            if (isPrime(i)) 
            {
            	for(int m=1;m<=5;m++)
            	{
            		for(int n=1;n<=m;n++)
            		{
            			 System.out.print(i + " ");
            			
            		}
            		System.out.println();
            		
            		
            	}
               
            }
        }
    }

    public static boolean isPrime(int i) {
        if (i <= 1) 
        {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++)
        {
           if (i % j == 0) 
            {
                return false;
            }
        }
        return true;}

}
