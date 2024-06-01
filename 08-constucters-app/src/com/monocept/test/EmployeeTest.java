package com.monocept.test;

import com.monocept.model.Empoyee;
import com.monocept.model.Point;

public class EmployeeTest {

	public static void main(String[] args) {
		Empoyee employee1=new Empoyee();
		System.out.println("Emp 1:");
		System.out.println("("+employee1.getId()+", "+employee1.getName()+","+employee1.getsalary()+")"); 
		employee1.setEmpId(10);
		employee1.setName("Pradeep");
		employee1.setSalary(20000);
		System.out.println("("+employee1.getId()+", "+employee1.getName()+","+employee1.getsalary()+")");
		
		Empoyee employee2=new Empoyee(20,"Satish",30000);
		System.out.println("Emp 2:");
		System.out.println("("+ employee2.getId()+", "+employee2.getName()+","+employee2.getsalary()+")");


	}

}
