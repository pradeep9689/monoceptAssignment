package com.monocept.app.service;

import java.util.List;
import java.util.Optional;

import com.monocept.app.DTO.EmployeeDTO;
import com.monocept.app.entity.Employee;

import jakarta.validation.Valid;

public interface EmployeeService {

	List<EmployeeDTO> getAllEmployees();

	Optional<Employee> getEmployeeById(int id);

	EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);

	void deleteEmployee(int id);

	List<EmployeeDTO> getEmployeesByName(String empName);

	List<EmployeeDTO> getEmployeesByEmail(String email);

	List<EmployeeDTO> getActiveEmployees();

	List<EmployeeDTO> getEmployeesByNameStartingWith(String firstChar);

	List<EmployeeDTO> getEmployeesBySalaryGreaterThanAndDesignation(double salary, String designation);

	List<EmployeeDTO> getEmployeesBySalaryBetween(double minSalary, double maxSalary);

	//List<EmployeeDTO> getActiveEmployeesSalaryGreaterThan(Double salary);

	EmployeeDTO updateEmployee(@Valid int id, EmployeeDTO employeeDetails);

	List<EmployeeDTO> getActiveEmployeesSalaryGreaterThan(double salary);

}
