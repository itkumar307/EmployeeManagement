package com.cts.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.employee.entity.Employee;
import com.cts.employee.repository.EmployeeRepository;

// employee service class
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// fetching all employees
	public List<Employee> getAllEmployees(){
		List<Employee> emps = (List<Employee>)employeeRepository.findAll(); 
		return emps;
	}
	
	// fetching employee by id
	public Optional<Employee> getEmployee(int id){
		return employeeRepository.findById(id);
	}
	
	// inserting employee
	public void addEmployee(Employee e) {
		employeeRepository.save(e);
	}
	
	// updating employee by id
	public void updateEmployee(Employee emp, int id){
		if(id == emp.getEmployeeID()) {
			employeeRepository.save(emp);
		}
	}
	
	//patching/updating employee by id
	public void patchEmployee(Employee emp, int id) {
		if(id == emp.getEmployeeID()) {
			employeeRepository.save(emp);
		}
	}
}