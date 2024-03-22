package com.src.entity;

public class Employee {

	String empName;
	int empSalary;
	int empExperience;
	String empAddress;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public int getEmpExperience() {
		return empExperience;
	}
	public void setEmpExperience(int empExperience) {
		this.empExperience = empExperience;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public Employee(String empName, int empSalary, int empExperience, String empAddress) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.empExperience = empExperience;
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + ", empExperience=" + empExperience
				+ ", empAddress=" + empAddress + "]";
	}
	
	
	
	
	
	
}
