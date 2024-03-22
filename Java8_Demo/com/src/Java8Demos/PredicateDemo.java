package com.src.Java8Demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.src.entity.Student;

public class PredicateDemo {

	public static void main(String[] args) {

		List<Student> StudentList = Arrays.asList(
				new Student(111, "John", 81.0, "Mathematics"),
				new Student(222, "Harsha", 79.5, "History"),
				new Student(333, "Ruth", 87.2, "Computers"),
				new Student(444, "Aroma", 63.2, "Mathematics"),
				new Student(555, "Zade", 83.5, "Computers")
				);

		System.out.println("================Predicate=======================");
		Predicate<Student> p= student -> student.getSpecialization().equals("History");
		for(Student str: StudentList) {
			if(p.test(str)) {
				System.out.println(str.getName()+" "+str.getSpecialization());
			}
		}
		System.out.println("================Consumer=======================");
		Consumer<Student> c =student -> System.out.println(student.getName() +" "+ student.getPercentage());
		for(Student str: StudentList) {
			c.accept(str);
		}

		System.out.println("================Function=======================");

		Function<Student, String> fn= student -> student.getName();
		List<String> studentNames = new ArrayList<String>();
		for(Student str: StudentList) {
			if(p.test(str)) {
				studentNames.add(fn.apply(str));
			}
		}
		System.out.println(studentNames.toString());

		System.out.println("================Supplier=======================");
		Supplier<Student> s= () -> 	new Student(666, "New Student", 92.9, "Java 8");
		
		Supplier<List<Student>> s1 = () -> {
			List<Student> listStdnt = new ArrayList<Student>();
			listStdnt.add(new Student(666, "New", 95.00, "Social"));
			return listStdnt;
		};
		
		
		System.out.println("Student name:"+s.get().getName());
		
		
		//StudentList.addAll(s1.get());
		System.out.println(s1.get().toString());
		
		
		

	}
}
