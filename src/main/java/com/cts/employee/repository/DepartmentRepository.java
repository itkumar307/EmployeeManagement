package com.cts.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.employee.entity.Department;


public interface DepartmentRepository extends CrudRepository<Department, Integer>{

}
