package com.monocept.model;

public class Student {
private	int rollNumber;
private	String name;
private	int age;
	
public	void intilizeStudent() {
		rollNumber=123;
		name="Pradeep";
		age=24;
		
	}
public void displayStudent() {
	System.out.println("rollnumber"+rollNumber);
	System.out.println("Name-"+name);
	System.out.println("Age"+age);
}
}
