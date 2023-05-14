package com.employee.entity;


import javax.persistence.Table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@jakarta.persistence.Entity
@Table(name="empdata")
public class Entity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private String gender;
	private String dob;
	public int getEmpId() {
		return empId;
	}
	
	public Entity(int empId, String empName, String gender, String dob, String empRole, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.dob = dob;
		this.empRole = empRole;
		this.salary = salary;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	private String empRole;
	private int salary;
	
	
	
	

}
