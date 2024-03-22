package com.src.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


import com.src.entity.Student;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(2);
		list.add(1);
		list.add(1, 3);
		list.add(1);
		list.add(4);
		Collections.reverse(list); // Reverse the array

		Set<Integer> set=new LinkedHashSet<Integer>(list); // Remove the Duplicate value
		list.clear();
		list.addAll(set);

		// Printing all the elements in an ArrayList
		System.out.println(list);

		//Store user-defined class objects in the ArrayList

		ArrayList<Student> students=new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			students.add(new Student(i, "Student" + i, random.nextDouble() * 4.0, 18 + random.nextInt(5),
					"Major" + i, "Minor" + i, true, "Address" + i));
		}
		long startTime, endTime;

		// Traditional for loop
		startTime = System.nanoTime();

		for(int i=0;i<students.size();i++) {
			Student student = students.get(i);
			System.out.println(students.get(i).getId()+" "+students.get(i).getName()+" "+students.get(i).getAddress());
		}
		endTime = System.nanoTime();
		System.out.println("Traditional For Loop Time: " + (endTime - startTime) + " ns");

		// Enhanced for loop
		for (Student student : students) {
			System.out.println(student.getId()+" "+student.getName()+" "+student.getAddress());
		}

		// While loop
		int i = 0;
		while (i < students.size()) {
			Student student = students.get(i);
			System.out.println(students.get(i).getId()+" "+students.get(i).getName()+" "+students.get(i).getAddress());
			i++;
		}

		// Iterator
		Iterator<Student> iterator=students.iterator();
		while(iterator.hasNext()) {
			Student student=iterator.next();
			System.out.println(student.getId()+" "+student.getName()+" "+student.getAddress());
		}

		// Streams
		students.stream().forEach(student ->{System.out.println(student.getId()+" "+student.getName()+" "+student.getAddress());});
	}
}
