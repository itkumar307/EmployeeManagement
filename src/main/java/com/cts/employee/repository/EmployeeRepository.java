package com.cts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.employee.entity.Employee;

// interface extending crud repository
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("update Employee e set e.latestSalary = :salary where e.employeeID = :employeeID ")
	void updateSalary(@Param("salary") String salary , @Param("employeeID") int id);
	
	
	@Query("select e from Employee e where e.department = :deptID")
	List<Employee> getEmployeesByDept(@Param("deptID") int id);


}
