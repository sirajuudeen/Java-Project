package com.src.FunctionalInterface_Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

import com.src.entity.Employee;

public class FunctionDemo1 {
	public static void main(String[] args) {

		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee("David", 30000, 5));
		al.add(new Employee("Scott", 20001, 4));
		al.add(new Employee("John", 35000, 4));
		al.add(new Employee("Mary", 50000, 6));
		al.add(new Employee("Abrahim", 10000, 1));

		Function<Employee, Integer> fn=e->{
			int sal=e.getSalary();
			if(e.getSalary()>=10000 && e.getSalary()<=20000) {
				return sal*10/100;
			}
			else if(e.getSalary()>20000 && e.getSalary()<=30000) {
				return sal*7/100;

			}else {
				return sal*5/100;
			}
		};
		//Predicate<Integer> pr=b->b>2000; // Predicate
		for(Employee emp: al) {
			int bonus=fn.apply(emp); // Functions
			//if(pr.test(bonus)) {
				System.out.println();
				System.out.println(emp.getEname()+" "+emp.getSalary()+" "+emp.getExperience()+" Bonus :"+bonus);
			// }
		}
		System.out.println("=========================");
		Function<Employee, String> FunctionName=e->e.getEname();
		Function<String, String> Function1=name->name.toUpperCase();
		for(Employee emp: al) {
			System.out.println(FunctionName.andThen(Function1).apply(emp));
		}
		
		System.out.println("=========================");
		Function<Employee, String> FunctionWord=e->e.getEname().concat(", Have a great Day");
		Function<String, String> Function2=name->name.toUpperCase();
		for(Employee emp: al) {
			System.out.println(Function2.compose(FunctionWord).apply(emp));
		}
		
		System.out.println("=========================");
		for(Employee emp: al) {
			System.out.println(Function.identity().apply(emp).toString());
		}
	}
}
