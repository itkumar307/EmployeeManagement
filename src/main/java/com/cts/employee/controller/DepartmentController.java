package com.cts.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.employee.entity.Department;
import com.cts.employee.service.DepartmentService;

import ch.qos.logback.classic.Logger;


@RestController
public class DepartmentController {
	
	//static final Logger logger  = LogManager.getLogger(DepartmentController.class.getName());
	
	@Autowired
	private DepartmentService departmentService;
	
	// displaying list of all department
		@GetMapping("/departments")
		public List<Department> getAllDepartment(){
			return departmentService.getAllDepartments();
		}

		// displaying department by id
		@GetMapping("/departments/{id}")
		public Optional<Department> getDepartment(@PathVariable int id){
			return departmentService.getDepartment(id);
		}
		
		// inserting department
		@PostMapping("/departments")
		public void addDepartment(@RequestBody Department department){
			
			
			departmentService.addDepartment(department);
		}

		
}
