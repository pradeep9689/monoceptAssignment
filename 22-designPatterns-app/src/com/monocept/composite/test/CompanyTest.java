package com.monocept.composite.test;

import com.monocept.composite.model.Developer;
import com.monocept.composite.model.EmployeeDirectory;
import com.monocept.composite.model.IEmployee;
import com.monocept.composite.model.Manager;

public class CompanyTest {

	public static void main(String[] args) {

		IEmployee dev1 = new Developer("Rakesh", "Senior Developer");
		IEmployee dev2 = new Developer("Pradeep", "Junior Developer");

		EmployeeDirectory devloperDirectory = new EmployeeDirectory();
		devloperDirectory.addEmployee(dev1);
		devloperDirectory.addEmployee(dev2);
		IEmployee mgr1 = new Manager("Akash Gupta", "Project Manager");

		EmployeeDirectory managerDirectory = new EmployeeDirectory();
		managerDirectory.addEmployee(mgr1);

		EmployeeDirectory companyDirectory = new EmployeeDirectory();
		companyDirectory.addEmployee(devloperDirectory);
		companyDirectory.addEmployee(managerDirectory);
		System.out.println("------Employee Details-------");
		companyDirectory.showEmployeeDetails();
	}

}
