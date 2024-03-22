package com.src.FunctionalInterface_Predicate;

import java.util.function.Predicate;

//Joining  Predicates - and, or , negate
//p1 -- checks number is even
//p2 -- checks greater than 50

public class PredicateDemo2 {

	public static void main(String[] args) {

		int a[]= {5,15,20,25,30,35,40,45,50,55,60,65,70};

		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=i->i>30;

		System.out.println("The following numbers are even and greater than 30...");
		for(int n:a) {
			//if(p1.and(p2).test(n)) { // if(p1.test(n) && p2.test(n))
			//if(p1.or(p2).test(n)) { 
			if(p2.negate().test(n)) {  // It gives the opposite of conditions. If it's true, then the results will be false..
				System.out.println(n);
			}}}
}
