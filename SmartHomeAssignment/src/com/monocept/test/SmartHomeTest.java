package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Light;
import com.monocept.model.SecurityCamera;
import com.monocept.model.SmartHome;
import com.monocept.model.Thermostat;

import java.util.Scanner;

public class SmartHomeTest {
    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome();
        
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            System.out.println("\nSmart Home Management System");
            System.out.println("1. Add Device");
            System.out.println("2. Control Device");
            System.out.println("3. List All Devices");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
		           switch (choice) {
		                case 1:
		                	 
                	        System.out.println("\nChoose device type to add:");
                	        System.out.println("1. Light");
                	        System.out.println("2. Thermostat");
                	        System.out.println("3. Security Camera");
                	        System.out.print("Enter your choice: ");
                	        int choice2 = scanner.nextInt();
                	        scanner.nextLine(); 

                	        System.out.print("Enter device ID: ");
                	        String deviceID = scanner.nextLine();
                	        System.out.print("Enter device name: ");
                	        String name = scanner.nextLine();

	                	        switch (choice2) {
	                	            case 1:
	                	                smartHome.addDevice(new Light(deviceID, name));
	                	                break;
	                	            case 2:
	                	                System.out.print("Enter initial temperature: ");
	                	                double temperature = scanner.nextDouble();
	                	                smartHome.addDevice(new Thermostat(deviceID, name, temperature));
	                	                break;
	                	            case 3:
	                	                smartHome.addDevice(new SecurityCamera(deviceID, name));
	                	                break;
	                	            default:
	                	                System.out.println("Invalid choice.");
	                	        }
                	         break;
                           case 2:
                	 
                	        System.out.print("Enter device ID to control: ");
                	        String deviceID1 = scanner.nextLine();
                	        System.out.println("1. Turn On");
                	        System.out.println("2. Turn Off");
                	        System.out.print("Enter your choice: ");
                	        int choice1 = scanner.nextInt();
                	        boolean turnOn = choice1 == 1;
                	        smartHome.controlDevice(deviceID1, turnOn);
                	        break;
                           case 3:
			                    smartHome.listAllDevices();
			                    break;
			                case 4:
			                    System.out.println("ThankYou");
			                    scanner.close();
			                    System.exit(0);
			                default:
			                    System.out.println("Invalid choice. Please try again.");
			            }
       }
   }
}
                	    

			                   
			               
   
    
   