package com.monocept.test;

import java.util.List;

import java.util.ListIterator;
import java.util.Scanner;

import com.monocept.model.Employee;

import com.monocept.model.EmployeeCompare;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Employee>employees=new ArrayList<Employee>();
System.out.println("how many Employees");
Scanner scanner=new Scanner(System.in);
int n=scanner.nextInt();	
for(int i=0;i<n;i++) {
	System.out.println("enter Id");
	int id=scanner.nextInt();
	System.out.println("enter Nmae");
	String name=scanner.next();
	System.out.println("enter salary");
	double salary=scanner.nextDouble();
	employees.add(new Employee(id,name,salary));
	

}
Collections.sort(employees,new EmployeeCompare.SortByName());
System.out.println(employees);
Collections.sort(employees,new EmployeeCompare.SortBySalary());
System.out.println(employees);
}


}
