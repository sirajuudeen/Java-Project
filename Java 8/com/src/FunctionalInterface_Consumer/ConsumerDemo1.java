package com.src.FunctionalInterface_Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.src.entity.Employee;

public class ConsumerDemo1 {

	public static void main(String[] args) {

		/*ArrayList<Employee> emplist=new ArrayList<>();
		emplist.add(new Employee("David", 30000, 5));
		emplist.add(new Employee("Scott", 60001, 4));
		emplist.add(new Employee("John", 35000, 4));
		emplist.add(new Employee("Mary", 50000, 6));
		emplist.add(new Employee("Abrahim", 10000, 1));*/

		List<Employee> emplist=Arrays.asList(
				new Employee("David", 30000, 5),
				new Employee("Scott", 60001, 4),
				new Employee("John", 35000, 4),
				new Employee("Mary", 50000, 6),
				new Employee("Abrahim", 10000, 1)
				);

		//Function
		Function<Employee, Integer> f=emp->(emp.getSalary()*10)/100;

		//Predicate
		Predicate<Integer> p=b->b>=5000;

		//Consumer
		Consumer<Employee> c=emp->{
			System.out.println(emp.getEname()+" "+emp.getSalary()+" "+emp.getExperience());
		};

		for(Employee e:emplist) {
			int bonus=f.apply(e);
			if(p.test(bonus)) {
				c.accept(e);
				System.out.println("Bonus is: "+bonus);
			}
		}
	}
}
