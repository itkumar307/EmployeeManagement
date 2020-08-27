package com.cts.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.employee.entity.Employee;
import com.cts.employee.service.EmployeeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class EmployeeController {

	static final Logger logger  = LogManager.getLogger(EmployeeController.class.getName());

	@Autowired
	private EmployeeService employeeService;
	
	// displaying list of all employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employees/deptid/{depid}")
	public List<Employee> getAllEmployeeByDeptId(@PathVariable int depid){
		return employeeService.getEmployeesByDepID(depid);
	}
	

	// inserting employee
	@PostMapping("/employees")
	public void addEmployees(@RequestBody Employee employee){
		employeeService.addEmployee(employee);
	}

	
	@PutMapping("/employees/updatesalary/{id}")
	public void updateEmployeeSalary(@RequestBody Employee e, @PathVariable int id){
		employeeService.updateEmployeeSalary(e.getLatestSalary(), id);
	}
	

	
}
