package com.src.FunctionalInterface;

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
