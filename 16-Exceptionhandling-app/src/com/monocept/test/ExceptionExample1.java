package com.monocept.test;

import java.util.Scanner;

public class ExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
		try {
			
			int number1=Integer.parseInt(args[0]);
			
			int number2=Integer.parseInt(args[1]);
			double div=calculate(number1,number2);
			System.out.println(div);
		}
		catch(ArithmeticException e) {
			System.out.println("divide by zero not possible");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("enter valid inputs");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
		System.out.println("finally block excutaed");}
	
		}
private static double calculate(int number1,int number2) {
	double div1=0;
	try{
	div1= number1/number2;
	}
	catch(ArithmeticException e)
{
		System.out.println("cant divisible by zero");}
	return div1;
}

}
