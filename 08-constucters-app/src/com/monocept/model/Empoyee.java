package com.monocept.model;

public class Empoyee {
	
	private	int empId;
	private	String empName;
	private	double salary;
	

	public Empoyee()
	{
		empId=0;
		empName="";
		salary=0;
		

	}
	public Empoyee(int empId,String empName,double salary) {
		this.empId= empId;
		this.empName= empName;
		this.salary=salary;
		}
	public void setEmpId(int empId) 
	{
		this.empId= empId;
	}
	public void setName(String empName) 
	{
		this.empName= empName;
	}
	public void setSalary(double salary) 
	{
		this.salary= salary;
	}

	public int getId() 
	{
		return empId;
	}
	public String getName() 
	{
		return empName;
	}
	public double getsalary() 
	{
		return salary;
	}
	
	
}
