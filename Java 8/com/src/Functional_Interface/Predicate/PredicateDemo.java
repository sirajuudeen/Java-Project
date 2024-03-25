package com.src.Functional_Interface.Predicate;

import java.util.function.Predicate;

/*
 * Predicate will accept one argument, do some processing, and then return Boolean value.
 * some conditional check the argument then go to use Predicate.
 * It is used for filtering or testing elements based on a condition. 
 * Abstract method: boolean test(T t)
 */
public class PredicateDemo {
	public static void main(String[] args) {

		//Ex1:
		Predicate<Integer> p=i->(i<10);
		System.out.println(p.test(5));
		System.out.println(p.test(10));

		System.out.println("----------------------------------------------------");
		//Ex2: check the length of given string is greater than 4 or not

		Predicate<String> pr=s->(s.length()>4);
		System.out.println(pr.test("Welcome"));
		System.out.println(pr.test("xyz"));

		System.out.println("----------------------------------------------------");
		//EX3 : Print array elements whose size is > 4 from array

		String names[]= {"David","John","Scott","Abrahim","Mary"};
		for(String name: names) {
			if(pr.test(name)) { // if(names.length() >4)
				System.out.println(name);
			}
		}
		
		System.out.println("----------------------------------------------------");
		
		//Joining  Predicates - and, or , negate
		//p1 -- checks number is even
		//p2 -- checks greater than 50
		
		int a[]= {5,15,20,25,30,35,40,45,50,55,60,65,70};

		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=i->i>30;

		System.out.println("The following numbers are even and greater than 30...");
		for(int n:a) {
			//if(p1.and(p2).test(n)) { // if(p1.test(n) && p2.test(n))
			//if(p1.or(p2).test(n)) { 
			if(p2.negate().test(n)) {  // It gives the opposite of conditions. If it's true, then the results will be false..
				System.out.println(n);
			}
		}
	
		System.out.println("----------------------------------------------------");
		
	}
}
