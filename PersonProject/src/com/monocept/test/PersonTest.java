package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.ArrayListDemo;
import com.monocept.model.Person;

public class PersonTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayListDemo demo = new ArrayListDemo();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a Person");
            System.out.println("2. Add a Person at the Beginning");
            System.out.println("3. Add a Person at the End");
            System.out.println("4. Insert a Person at a Specific Position");
            System.out.println("5. Get a Person at a Specific Position");
            System.out.println("6. Get the First Person");
            System.out.println("7. Get the Last Person");
            System.out.println("8. Update a Person at a Specific Position");
            System.out.println("9. Remove the First Person");
            System.out.println("10. Remove a Person at a Specific Position");
            System.out.println("11. Check if a Person Exists");
            System.out.println("12. Get the Index of a Person");
            System.out.println("13. Print All Persons");
            System.out.println("14. Clear the List");
            System.out.println("15. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.println("Enter details for the Person:");
                    demo.addPerson(createPerson(scanner));
                    break;
                case 2:
                    System.out.println("Enter details for the Person to add to the beginning:");
                    demo.addPersonAtBeginning(createPerson(scanner));
                    break;
                case 3:
                    System.out.println("Enter details for the Person to add to the end:");
                    demo.addPersonAtEnd(createPerson(scanner));
                    break;
                case 4:
                    System.out.print("Enter the position to insert the Person: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.println("Enter details for the Person to insert:");
                    demo.insertPersonAt(index, createPerson(scanner));
                    break;
                case 5:
                    System.out.print("Enter the position to get the Person: ");
                    index = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.println(demo.getPersonAt(index));
                    break;
                case 6:
                    System.out.println(demo.getFirstPerson());
                    break;
                case 7:
                    System.out.println(demo.getLastPerson());
                    break;
                case 8:
                    System.out.print("Enter the position to update the Person: ");
                    index = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.println("Enter new details for the Person:");
                    demo.updatePersonAt(index, createPerson(scanner));
                    break;
                case 9:
                    demo.removeFirstPerson();
                    System.out.println("First person removed.");
                    break;
                case 10:
                    System.out.print("Enter the position to remove the Person: ");
                    index = scanner.nextInt();
                    scanner.nextLine();  
                    demo.removePersonAt(index);
                    System.out.println("Person removed at position " + index);
                    break;
                case 11:
                    System.out.println("Enter details of the Person to check:");
                    Person searchPerson = createPerson(scanner);
                    boolean exists = demo.containsPerson(searchPerson);
                    System.out.println("Does the person exist? " + exists);
                    break;
                case 12:
                    System.out.println("Enter details of the Person to get index:");
                    searchPerson = createPerson(scanner);
                    int idx = demo.indexOfPerson(searchPerson);
                    System.out.println("Index of the person: " + idx);
                    break;
                case 13:
                    System.out.println("All Persons in the list:");
                    demo.printPersonList();
                    break;
                case 14:
                    demo.clearList();
                    System.out.println("List cleared.");
                    break;
                case 15:
                    System.out.println("ThankYou");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

   
    public static Person createPerson(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Address: ");
        String address = scanner.nextLine();
        return new Person(name, age, address);
    }
}
