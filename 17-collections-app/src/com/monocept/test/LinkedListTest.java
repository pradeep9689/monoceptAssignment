package com.monocept.test;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import com.monocept.model.Employee;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> list=new LinkedList<Employee>();
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
			list.push(new Employee(id,name,salary));

	}
		
		ListIterator iter=list.listIterator(0);
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
}
}