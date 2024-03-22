package com.src.Java8Demos;

@FunctionalInterface
interface cab{
	String m1(String source,String destination);
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		cab cab= (source,destination) ->  {
			return "Price is : 5000";
		};
			System.out.println(cab.m1("Ch", "MuM"));
	}
}
