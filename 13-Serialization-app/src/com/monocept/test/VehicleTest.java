package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.monocept.model.Car;

public class VehicleTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cars: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for car " + (i + 1) + ":");
            System.out.print("Enter company name: ");
            String companyName = scanner.nextLine();
            System.out.print("Enter mileage: ");
            double mileage = scanner.nextDouble();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); 
            cars[i] = new Car(companyName, mileage, price);
        }

        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cars.txt"))) {
            out.writeObject(cars);
            System.out.println("\nCar details are stored into cars.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        try (ObjectInputStream objectinputstream = new ObjectInputStream(new FileInputStream("cars.txt"))) {
            Car[] deserializedCars = (Car[]) objectinputstream.readObject();
            System.out.println("\nDetails of deserialized cars:");
            for (int i = 0; i < deserializedCars.length; i++) {
                System.out.println("\nCar " + (i + 1) + ":");
                deserializedCars[i].display();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}