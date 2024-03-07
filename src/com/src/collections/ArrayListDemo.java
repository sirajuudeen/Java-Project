package com.src.collections;
import java.util.*;

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
	}
}
