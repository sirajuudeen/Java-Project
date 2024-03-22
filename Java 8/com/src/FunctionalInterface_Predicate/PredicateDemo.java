package com.src.FunctionalInterface_Predicate;

import java.util.function.Predicate;

/*
 * Predicate will accept one argument, do some processing, and then return Boolean value.
 * some conditional check the argument then go to use Predicate.
 * It is used for filtering or testing elements based on a condition. 
 */
public class PredicateDemo {
	public static void main(String[] args) {

		//Ex1:
		Predicate<Integer> p=i->(i<10);
		System.out.println(p.test(5));
		System.out.println(p.test(10));

		//Ex2: check the length of given string is greater than 4 or not

		Predicate<String> pr=s->(s.length()>4);
		System.out.println(pr.test("Welcome"));
		System.out.println(pr.test("xyz"));

		//EX3 : Print array elements whose size is > 4 from array

		String names[]= {"David","John","Scott","Abrahim","Mary"};
		for(String name: names) {
			if(pr.test(name)) { // if(names.length() >4)
				System.out.println(name);
			}
		}

	}
}
