package com.cts.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.employee.entity.Department;
import com.cts.employee.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	

	// fetching all department
	public List<Department> getAllDepartments(){
		List<Department> depts = (List<Department>)departmentRepository.findAll(); 
		return depts;
	}
	
	// fetching department by id
	public Optional<Department> getDepartment(int id){
		return departmentRepository.findById(id);
	}
	
	// inserting department
	public void addDepartment(Department d) {
		departmentRepository.save(d);
	}
	
	
}
