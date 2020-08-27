package com.cts.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.employee.entity.Employee;
import com.cts.employee.exception.NoDataFoundException;
import com.cts.employee.repository.EmployeeRepository;

// employee service class
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	// fetching all employees
	public List<Employee> getAllEmployees() {
		List<Employee> emps = (List<Employee>) employeeRepository.findAll();
		return emps;
	}

	@Transactional(readOnly = true)
	public List<Employee> getEmployeesByDepID(int employeeID) {
		List<Employee> emps = (List<Employee>) employeeRepository.getEmployeesByDept(employeeID);
		if(emps.isEmpty()) {
		throw new NoDataFoundException("Employee is empty");
		}
		return emps;
	}

	// fetching employee by id
	public Optional<Employee> getEmployee(int id) {

		Optional<Employee> employeeList = employeeRepository.findById(id);

		if (employeeList.isEmpty()) {

			throw new NoDataFoundException("Employee is empty");
		}
		return employeeList;

	}

	// inserting employee
	public void addEmployee(Employee e) {
		employeeRepository.save(e);
	}

	// updating employee by id
	public void updateEmployeeSalary(String salary, int id) {

		if (!salary.isEmpty()) {
			if (Integer.parseInt(salary) <= 0) {
				throw new NoDataFoundException("Employee");
			}
		}else {
			throw new NoDataFoundException("Employee");
		}
		employeeRepository.updateSalary(salary, id);

	}

	// updating employee by id
	public void updateEmployee(Employee emp, int id) {
		if (id == emp.getEmployeeID()) {
			employeeRepository.save(emp);
		}
	}

}
