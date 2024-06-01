package com.monocept.model;

import java.util.Scanner;

public class Employee {
	private	int empId;
	private	String empName;
	private	double salary;
	
	public	void intilizeEmp(int id,String name,double sal)
	{
		
		empId=id;
		
		empName=name;
		
		salary=sal;
	}
public void displayDetails() 
{
	System.out.println("Employee Id-"+empId);
	System.out.println("Employee Name- "+empName);
	System.out.println("Salary- "+salary);
}
	
}