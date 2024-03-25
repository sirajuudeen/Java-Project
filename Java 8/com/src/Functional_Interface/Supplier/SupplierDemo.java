package com.src.Functional_Interface.Supplier;

import java.util.Date;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;
/*
 * Supplier<R> - get()
 * supplier functional interface is the one whose method is not having any arguments to pass and will return a value. 
 * A supplier functional interface is mainly used to generate values lazily. For example, 
 * to get a random number, to generate a sequence of numbers etc.
 */
public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<Date> dt=() ->(new Date());
		System.out.println(dt.get());

		System.out.println("--------------------");
		Supplier<Integer> supplier = () -> (int)(Math.random() * 10);

		List<Integer> randomNumbers = new ArrayList<>();

		// generate 5 random numbers
		for(int i = 0; i< 5; i++) {
			randomNumbers.add(supplier.get());
		}
		System.out.println(randomNumbers);
	}
}
