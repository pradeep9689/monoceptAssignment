package com.monocept.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.monocept.app.DTO.EmployeeDTO;
import com.monocept.app.entity.Employee;
import com.monocept.app.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	  public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();
        for (Employee employee : employees) {
            employeeDTOs.add(convertEmployeeObjectToDTO(employee));
        }
        return employeeDTOs;
    }

	@Override
	public Optional<Employee> getEmployeeById(int id) {

		return employeeRepository.findById(id);

	}
	  public EmployeeDTO updateEmployee(int id, EmployeeDTO employeeDetails) {
	        Optional<Employee> employeeOptional = employeeRepository.findById(id);
	        if (employeeOptional.isPresent()) {
	            Employee employee = employeeOptional.get();
	            employee.setEmpName(employeeDetails.getEmpName());
	            employee.setEmail(employeeDetails.getEmail());
	            employee.setDesignation(employeeDetails.getDesignation());
	            employee.setSalary(employeeDetails.getSalary());
	            employee.setActive(employeeDetails.isActive());
	            Employee updatedEmployee = employeeRepository.save(employee);
	            return convertEmployeeObjectToDTO(updatedEmployee);
	        } else {
	            throw new RuntimeException("Employee not found with id: " + id);
	        }}

	
	@Override
	public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
		Employee employee = convertEmployeeDtoToObject(employeeDTO);
		Employee newEmployee = employeeRepository.save(employee);
		EmployeeDTO empDTO = convertEmployeeObjectToDTO(employee);
		return empDTO;
	}

	private EmployeeDTO convertEmployeeObjectToDTO(Employee employee) {
		EmployeeDTO eployeeDTO = new EmployeeDTO();

		eployeeDTO.setId(employee.getId());
		eployeeDTO.setEmpName(employee.getEmpName());
		eployeeDTO.setEmail(employee.getEmail());
		eployeeDTO.setDesignation(employee.getDesignation());
		eployeeDTO.setSalary(employee.getSalary());
		eployeeDTO.setActive(employee.isActive());
		return eployeeDTO;

	}

	private Employee convertEmployeeDtoToObject(EmployeeDTO employeeDTO) {
		Employee employee = new Employee();
		employee.setId(employeeDTO.getId());
		employee.setEmpName(employeeDTO.getEmpName());
		employee.setEmail(employeeDTO.getEmail());
		employee.setDesignation(employeeDTO.getDesignation());
		employee.setSalary(employeeDTO.getSalary());
		employee.setActive(employeeDTO.isActive());
		return employee;
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);

	}
	@Override
	  public List<EmployeeDTO> getEmployeesByName(String empName) {
	        List<Employee> employees = employeeRepository.findByEmpName(empName);
	        List<EmployeeDTO> employeeDTOs = new ArrayList<>();
	        for (Employee employee : employees) {
	            employeeDTOs.add(convertEmployeeObjectToDTO(employee));
	        }
	        return employeeDTOs;
	    }

	@Override
	 public List<EmployeeDTO> getEmployeesByEmail(String email) {
        List<Employee> employees = employeeRepository.findByEmail(email);
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();
        for (Employee employee : employees) {
            employeeDTOs.add(convertEmployeeObjectToDTO(employee));
        }
        return employeeDTOs;
    }

	@Override
	public List<EmployeeDTO> getActiveEmployees() {
        List<Employee> employees = employeeRepository.findByActive(true);
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();
        for (Employee employee : employees) {
            employeeDTOs.add(convertEmployeeObjectToDTO(employee));
        }
        return employeeDTOs;
    }

	@Override
	public List<EmployeeDTO> getEmployeesByNameStartingWith(String prefix) {
        List<Employee> employees = employeeRepository.findByEmpNameStartingWith(prefix);
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();
        for (Employee employee : employees) {
            employeeDTOs.add(convertEmployeeObjectToDTO(employee));
        }
        return employeeDTOs;
    }

	@Override
	  public List<EmployeeDTO> getEmployeesBySalaryGreaterThanAndDesignation(double salary, String designation) {
        List<Employee> employees = employeeRepository.findBySalaryGreaterThanAndDesignation(salary, designation);
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();
        for (Employee employee : employees) {
            employeeDTOs.add(convertEmployeeObjectToDTO(employee));
        }
        return employeeDTOs;
    }

	@Override
	public List<EmployeeDTO> getEmployeesBySalaryBetween(double minSalary, double maxSalary) {
        List<Employee> employees = employeeRepository.findBySalaryBetween(minSalary, maxSalary);
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();
        for (Employee employee : employees) {
            employeeDTOs.add(convertEmployeeObjectToDTO(employee));
        }
        return employeeDTOs;
    }

	@Override
	public List<EmployeeDTO> getActiveEmployeesSalaryGreaterThan(double salary) {
		List<Employee> employees = employeeRepository.findByActiveAndSalaryGreaterThan(true, salary);
	    List<EmployeeDTO> employeeDTOs = new ArrayList<>();
	    for (Employee employee : employees) {
	        employeeDTOs.add(convertEmployeeObjectToDTO(employee));
	    }
	    return employeeDTOs;
	}
	

	

	
}
