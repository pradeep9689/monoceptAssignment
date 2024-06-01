package com.monocept.switchcase;

import java.util.Scanner;

public class exSwitchCase {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
	System.out.println("1 for weekProgram,2 for season");
		int number=scanner.nextInt();
		
		switch(number) {
		case 1:
		System.out.println("enter day Number");
		
		int dayNumber=scanner.nextInt();
		
		
		switch(dayNumber) {
		case 1: System.out.println("Monday"); break;
        case 2: System.out.println("Tuesday"); break;
        case 3: System.out.println ("Wednesday"); break;
        case 4:System.out.println("Thursday"); break;
        case 5:System.out.println ("Friday"); break;
        case 6:System.out.println ("Saturday"); break;
        case 7: System.out.println ("Sunday"); break;
        default:System.out.println ("Invalid day range");
		}break;
		
		
		
		case 2:
		System.out.println("enter Month Number");
		
		int month=scanner.nextInt();
		 switch (month) {
	        case 12:
	        case 1:
	        case 2:
	            System.out.println("WINTER");
	            break;
	        case 3:
	        case 4:
	        case 5:
	            System.out.println("SUMMER");
	            break;
	        case 6:
	        case 7:
	        case 8:
	            System.out.println("Rainy");
	            break;
	        case 9:
	        case 10:
	        case 11:
	            System.out.println("AUTUMN");
	            break;
	        default:System.out.println("Invalid Month number");
            break;
		 }break;
		 default:System.out.println("Invalid input number");

	}scanner.close();

}}
