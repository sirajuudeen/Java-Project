package com.src.FunctionalInterface_Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.src.entity.Employee;

public class PredicateDemo1 {

	public static void main(String[] args) {
		
		// Requirement: employee Object return salary > 30k & experience > 3
		Predicate<Employee> pr=e->(e.getSalary()>30000 && e.getExperience()>3);
		
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee("David", 30000, 5));
		al.add(new Employee("Scott", 20000, 4));
		al.add(new Employee("John", 35000, 4));
		al.add(new Employee("Mary", 50000, 6));
		al.add(new Employee("Abrahim", 10000, 1));
		
		for(Employee emp: al) {
			if(pr.test(emp)) {
				System.out.println(emp.getEname()+" "+emp.getSalary()+" "+emp.getExperience());
			}
		}
	}
}
