package com.monocept.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.monocept.app.DTO.EmployeeDTO;
import com.monocept.app.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByEmpName(String empName);

	List<Employee> findByEmail(String email);

	List<Employee> findByActive(boolean active);

	List<Employee> findByEmpNameStartingWith(String prefix);

	List<Employee> findBySalaryGreaterThanAndDesignation(@Param("salary") double salary,
			@Param("designation") String department);

	List<Employee> findBySalaryBetween(@Param("minSalary") double minSalary, @Param("maxSalary") double maxSalary);

	List<Employee> findByActiveAndSalaryGreaterThan(boolean b, Double salary);

}
