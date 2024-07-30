package com.monocept.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.app.DTO.EmployeeDTO;
import com.monocept.app.entity.Employee;
import com.monocept.app.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/employee")
	 public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		Optional<Employee> employee = employeeService.getEmployeeById(id);
		if (employee.isPresent()) {
			return employee.get();
		} else {
			throw new RuntimeException("Employee not found with id: " + id);
		}
	}

	@PostMapping("/employee")
	public ResponseEntity<EmployeeDTO> createEmployee(@Valid @RequestBody EmployeeDTO employee) {
		EmployeeDTO saveEmployee = employeeService.saveEmployee(employee);
		return new ResponseEntity<EmployeeDTO>(saveEmployee, HttpStatus.OK);
	}

	@PutMapping("/employee/{id}")
	public ResponseEntity< EmployeeDTO> updateEmployee(@Valid @PathVariable int id, @RequestBody EmployeeDTO employeeDetails) {
		 EmployeeDTO updateEmployee = employeeService.updateEmployee(id, employeeDetails);
		 return new ResponseEntity<EmployeeDTO>(updateEmployee, HttpStatus.OK);
	}

	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		Optional<Employee> employeeOptional = employeeService.getEmployeeById(id);
		if (employeeOptional.isPresent()) {
			employeeService.deleteEmployee(id);
			return "Employee deleted with id: " + id;
		} else {
			throw new RuntimeException("Employee not found with id: " + id);
		}
	}

	@GetMapping("/employee/name/{empName}")
	public ResponseEntity< List<EmployeeDTO> >getEmployeesByName(@PathVariable String empName) {
		 List<EmployeeDTO> employeesByName = employeeService.getEmployeesByName(empName);
		 return new ResponseEntity<List<EmployeeDTO>>(employeesByName, HttpStatus.OK);
	}

	@GetMapping("/employee/email/{email}")
	public ResponseEntity< List<EmployeeDTO>> getEmployeesByEmail(@PathVariable String email) {
		 List<EmployeeDTO> employeesByEmail = employeeService.getEmployeesByEmail(email);
		 return new ResponseEntity<List<EmployeeDTO>>(employeesByEmail, HttpStatus.OK);
	}

	  @GetMapping("/employee/active")
	    public ResponseEntity< List<EmployeeDTO>> getActiveEmployees() {
	         List<EmployeeDTO> activeEmployees = employeeService.getActiveEmployees();
	         return new ResponseEntity<List<EmployeeDTO>>(activeEmployees, HttpStatus.OK);
	    }
	  
	  @GetMapping("/employee/nameStartingWith/{prefix}")
	  public ResponseEntity< List<EmployeeDTO>> getEmployeesByNameStartingWith(@PathVariable String prefix) {
	         List<EmployeeDTO> employeesByNameStartingWith = employeeService.getEmployeesByNameStartingWith(prefix);
	         return new ResponseEntity<List<EmployeeDTO>>(employeesByNameStartingWith, HttpStatus.OK);
	    }

	  @GetMapping("/employee/salary-greater-than/{salary}/designation/{designation}")
	    public ResponseEntity< List<EmployeeDTO>> getEmployeesBySalaryGreaterThanAndDesignation(@PathVariable double salary,
	                                                                           @PathVariable String designation) {
	         List<EmployeeDTO> sal = employeeService.getEmployeesBySalaryGreaterThanAndDesignation(salary, designation);
	         return new ResponseEntity<List<EmployeeDTO>>(sal, HttpStatus.OK);
	    }

	  @GetMapping("/employee/salary-between/{minSalary}/{maxSalary}")
	    public ResponseEntity<List<EmployeeDTO>> getEmployeesBySalaryBetween(@PathVariable double minSalary,
	                                                                          @PathVariable double maxSalary) {
	        List<EmployeeDTO> employeesBySalaryBetween = employeeService.getEmployeesBySalaryBetween(minSalary, maxSalary);
	        return new ResponseEntity<>(employeesBySalaryBetween, HttpStatus.OK);
	    }

	@GetMapping("employee/active/salaryGreaterThan/{salary}")
	public ResponseEntity<List<EmployeeDTO>> getActiveEmployeesSalaryGreaterThan(
	        @PathVariable(name = "salary") Double salary) {
	    List<EmployeeDTO> employees = employeeService.getActiveEmployeesSalaryGreaterThan(salary);
	    return new ResponseEntity<>(employees, HttpStatus.OK);
	}
}