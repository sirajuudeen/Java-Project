package com.src.Functional_Interface.Consumer;

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
				new Employee("David", 30000, 5,"Chennai"),
				new Employee("Scott", 60001, 4,"Madurai"),
				new Employee("John", 35000, 4,"Bangalore"),
				new Employee("Mary", 50000, 6,"Chennai"),
				new Employee("Abrahim", 10000, 1,"Bangalore")
				);

		//Function
		Function<Employee, Integer> f=emp->(emp.getEmpSalary()*10)/100;

		//Predicate
		Predicate<Integer> p=b->b>=5000;

		//Consumer
		Consumer<Employee> c=emp->{
			System.out.println(emp.getEmpName()+" "+emp.getEmpSalary()+" "+emp.getEmpExperience());
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
