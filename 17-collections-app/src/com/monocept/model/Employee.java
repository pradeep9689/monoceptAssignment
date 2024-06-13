package com.monocept.model;

public class Employee {
	private int employeeID;
	private String nmae;
	private double salary;
	public Employee(int employeeID, String nmae, double salary) {
		
		this.employeeID = employeeID;
		this.nmae = nmae;
		this.salary = salary;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getNmae() {
		return nmae;
	}
	public void setNmae(String nmae) {
		this.nmae = nmae;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", nmae=" + nmae + ", salary=" + salary + "]";
	}

}
