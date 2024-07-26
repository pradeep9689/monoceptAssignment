package com.monocept.structural.facade.test;

import java.util.Scanner;

import com.monocept.structural.facade.model.HotelReception;

public class HotelTest {

	public static void main(String[] args) {
		  HotelReception reception = new HotelReception();
		  
		
		  Scanner scanner=new Scanner(System.in);
		  while(true) {
		  System.out.println("Press 1 for Indian Menu");
		  System.out.println("Press 2 for Italian Menu");
		  System.out.println("Press 3 exit");

		  int choice=scanner.nextInt();
		
			  switch(choice) {
			  case 1:
				  reception.getIndianMenu(); 
				  break;
			  case 2:
				  reception.getItalianMenu(); 
				  break;
				  
			  case 3:
				  System.out.println("thank you");

				  System.exit(0);
				  
				default : System.out.println("Wrong input");
				  
			  }
		  }

	        
	        
	    }
	}