package com.src.Functional_Interface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.src.entity.Employee;

public class PredicateDemo1 {

	public static void main(String[] args) {
		// Requirement: employee Object return salary > 30k & experience > 3
		Predicate<Employee> pr1=e->(e.getEmpSalary()>30000 && e.getEmpExperience()>3);
		
		List<Employee> emplist=Arrays.asList(
				new Employee("David", 30000, 5,"Chennai"),
				new Employee("Scott", 60001, 4,"Madurai"),
				new Employee("John", 35000, 4,"Bangalore"),
				new Employee("Mary", 50000, 6,"Chennai"),
				new Employee("Abrahim", 10000, 1,"Bangalore")
				);
		
		for(Employee emp: emplist) {
			if(pr1.test(emp)) {
				System.out.println(emp.getEmpName()+" "+emp.getEmpSalary()+" "+emp.getEmpExperience());
			}
		}

	}

}
