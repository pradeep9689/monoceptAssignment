package com.monocept.model;

import java.util.Comparator;

public class EmployeeCompare {
	public static class SortByName implements Comparator<Employee>{

		@Override
		public int compare(Employee emp1, Employee emp2) {
			// TODO Auto-generated method stub
			return emp1.getNmae().compareTo(emp2.getNmae());
		}

}
	
	public static class SortBySalary implements Comparator<Employee>{

		@Override
		public int compare(Employee emp1, Employee emp2) {
			// TODO Auto-generated method stub
			return (int) (emp1.getSalary()-emp2.getSalary());
		}

}

}
