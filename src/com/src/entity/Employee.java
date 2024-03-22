package com.src.entity;

public class Employee {

	String ename;
	int salary;
	int experience;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Employee(String ename, int salary, int experience) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", salary=" + salary + ", experience=" + experience + "]";
	}
	
	
}
