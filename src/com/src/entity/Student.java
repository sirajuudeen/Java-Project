package com.src.entity;

public class Student {

	int id;
    String name;
    double gpa;
    int age;
    String major;
    String minor;
    boolean enrolled;
    String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMinor() {
		return minor;
	}
	public void setMinor(String minor) {
		this.minor = minor;
	}
	public boolean isEnrolled() {
		return enrolled;
	}
	public void setEnrolled(boolean enrolled) {
		this.enrolled = enrolled;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(int id, String name, double gpa, int age, String major, String minor, boolean enrolled,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.age = age;
		this.major = major;
		this.minor = minor;
		this.enrolled = enrolled;
		this.address = address;
	}
	
    
	
	
	
}
