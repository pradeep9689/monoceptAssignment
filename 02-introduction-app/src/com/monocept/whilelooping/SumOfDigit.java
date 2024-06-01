package com.monocept.whilelooping;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, digit, sum = 0;  
		Scanner scanner = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		number = scanner.nextInt();  
		while(number > 0)  
		{  
		    
		digit = number % 10;  
		
		sum = sum + digit;  
		 
		number = number / 10;  
		}  
	
		System.out.println(sum);  
	}

}
