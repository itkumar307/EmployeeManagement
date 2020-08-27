package com.cts.employee.exception;

public class EmployeeNotFoundException extends RuntimeException {

	public EmployeeNotFoundException(int id) {
		super(String.format("City with Id %d not found", id));

	}

}