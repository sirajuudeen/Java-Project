package com.src.entity;

public class Student {

	
	int id;
    String name;
    double percentage;
    String specialization;

	
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

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Student(int id, String name, double percentage, String specialization) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", percentage=" + percentage + ", specialization="
				+ specialization + "]";
	}
    
    
}
