package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1=new Employee();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr Employee1 details -");
		
		System.out.println("Enetr Employee ID- ");
		int empId=scanner.nextInt();
		System.out.println("Enetr Employee Name- ");
		String empName=scanner.next();
		System.out.println("Enetr Employee Salary-");
		double salary=scanner.nextInt();
		
		employee1.intilizeEmp(empId,empName,salary);
		employee1.displayDetails();
		
		Employee employee2=new Employee();
	System.out.println("Enetr Employee 2 details ");
		
		System.out.println("Enetr Employee ID -");
		 empId=scanner.nextInt();
		System.out.println("Enetr Employee Name- ");
	empName=scanner.next();
		System.out.println("Enetr Employee Salary-");
	salary=scanner.nextInt();
		
		employee2.intilizeEmp(empId,empName,salary);
		employee2.displayDetails();

	}

}
