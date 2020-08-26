package com.cts.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.employee.entity.Employee;

// interface extending crud repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
}
