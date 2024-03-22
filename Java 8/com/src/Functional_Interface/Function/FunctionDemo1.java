package com.src.Functional_Interface.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.src.entity.Employee;

public class FunctionDemo1 {
	public static void main(String[] args) {

		List<Employee> emplist=Arrays.asList(
				new Employee("David", 30000, 5,"Chennai"),
				new Employee("Scott", 60001, 4,"Madurai"),
				new Employee("John", 35000, 4,"Bangalore"),
				new Employee("Mary", 50000, 6,"Chennai"),
				new Employee("Abrahim", 10000, 1,"Bangalore")
				);

		Function<Employee, Integer> fn=e->{
			int sal=e.getEmpSalary();
			if(e.getEmpSalary()>=10000 && e.getEmpSalary()<=20000) {
				return sal*10/100;
			}
			else if(e.getEmpSalary()>20000 && e.getEmpSalary()<=30000) {
				return sal*7/100;

			}else {
				return sal*5/100;
			}
		};
		//Predicate<Integer> pr=b->b>2000; // Predicate
		for(Employee emp: emplist) {
			int bonus=fn.apply(emp); // Functions
			//if(pr.test(bonus)) {
				System.out.println();
				System.out.println(emp.getEmpName()+" "+emp.getEmpSalary()+" "+emp.getEmpExperience()+" Bonus :"+bonus);
			// }
		}
		System.out.println("=========================");
		Function<Employee, String> FunctionName=e->e.getEmpName();
		Function<String, String> Function1=name->name.toUpperCase();
		for(Employee emp: emplist) {
			System.out.println(FunctionName.andThen(Function1).apply(emp));
		}
		
		System.out.println("=========================");
		Function<Employee, String> FunctionWord=e->e.getEmpName().concat(", Have a great Day");
		Function<String, String> Function2=name->name.toUpperCase();
		for(Employee emp: emplist) {
			System.out.println(Function2.compose(FunctionWord).apply(emp));
		}
		
		System.out.println("=========================");
		for(Employee emp: emplist) {
			System.out.println(Function.identity().apply(emp).toString());
		}
	}
}
