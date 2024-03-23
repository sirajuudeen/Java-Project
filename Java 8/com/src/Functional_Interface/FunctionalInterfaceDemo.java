package com.src.Functional_Interface;

/*
 * A functional interface is an interface that contains only one abstract method.
 * It can have any number of default, static methods but can contain only one abstract method.
 * Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces
 * 
 * Some Built-in Java Functional Interfaces:
 *  • Runnable –> This interface only contains the run() method.
	• Comparable –> This interface only contains the compareTo() method.
	• ActionListener –> This interface only contains the actionPerformed() method.
	• Callable –> This interface only contains the call() method.

 *  In Java 8, there are 4 main functional interfaces are introduced which could be used in different scenarios
 *  1. Consumer
 *  2. Predicate  
 *  3. Function 
 *  4. Supplier  
 * 
 * 
 * 
 */

@FunctionalInterface // Explicit mentioned
interface Calculate {
	int randomCaluclate(int a,int b);	
	default void print(int result) {
		System.out.println("Results:"+result);
	}
}

// this also functional interface only 1 abstract method
interface Cab {
	public String bookCab(String source, String destination);
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		Calculate cal=(a,b) -> {
			int randomCal=a*b/20;
			return randomCal;
		};
		cal.print(cal.randomCaluclate(10, 20));

		Cab cab=(source,destination)->{
			System.out.println("Ola cab is booked from "+source+ " to "+destination);
			return ("Price is 7000");
		};
		System.out.println(cab.bookCab("Chennai","Mumbai"));
	}
}
