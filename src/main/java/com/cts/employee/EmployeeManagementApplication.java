package com.cts.employee;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication {

//	//logging
	static final Logger logger = LogManager.getLogger(EmployeeManagementApplication.class.getName());

	public static void main(String[] args) {
		logger.info("Starting the application");
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

}
