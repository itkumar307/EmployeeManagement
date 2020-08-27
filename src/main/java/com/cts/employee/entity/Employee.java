package com.cts.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeID;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "phone_no")
	private String phoneNo;

	@Column(name = "email_id")
	private String email_ID;

	@Column(name = "address")
	private String address;

	@Column(name = "pincode")
	private String pincode;

	@Column(name = "latest_salary")
	private String latestSalary;

	@Column(name = "dob")
	private String dob;

	@Column(name = "doj")
	private String doj;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	public Employee() {

	}

	public Employee(int employeeID, String firstName, String lastName, String phoneNo, String email_ID, String address,
			String pincode, String latestSalary, String dob, String doj, Department department) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.email_ID = email_ID;
		this.address = address;
		this.pincode = pincode;
		this.latestSalary = latestSalary;
		this.dob = dob;
		this.doj = doj;
		this.department = department;
	}

	
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail_ID() {
		return email_ID;
	}

	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getLatestSalary() {
		return latestSalary;
	}

	public void setLatestSalary(String latestSalary) {
		this.latestSalary = latestSalary;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNo=" + phoneNo + ", emailID=" + email_ID + ", address=" + address + ", pincode=" + pincode
				+ ", latestSalary=" + latestSalary + ", dob=" + dob + ", doj=" + doj + ", department=" + department
				+ "]";
	}

}
