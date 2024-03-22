package com.src.Functional_Interface.Function;

import java.util.function.Function;

/*
 * A function is a type of functional interface in Java that receives only a single argument and returns a value after the required processing.
 * 
 */
public class FunctionDemo {

	public static void main(String[] args) {

		Function<Integer, Integer> fu=n->n*n;
		System.out.println(fu.apply(5));
		System.out.println("----------------------------------------------------");
		Function<String, Integer> f=s->s.length();
		System.out.println(f.apply("Welcome"));
		System.out.println("----------------------------------------------------");
		
		// Function Chaining
		
		Function<Integer,Integer> f1=n->n*2;
		Function<Integer,Integer> f2=n->n*n*n;
		
		System.out.println(f1.andThen(f2).apply(2)); //1st f1 condition will execute f1=2*2 =4, then f1 value will pass to f2 condition will execute f2=4*4*4 = 64
		System.out.println("----------------------------------------------------");
		
		System.out.println(f1.compose(f2).apply(2)); //1st f2 condition will execute f2=2*2*2 =8, then f2 value will pass to f1 condition will execute f1=8*2 = 16
		System.out.println("----------------------------------------------------");
		
		System.out.println(Function.identity().apply(f1).toString()); // it's static method Function.identity()it'll show whatever is there data.
		
		
	}
}
