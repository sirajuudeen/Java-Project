package com.src.Functional_Interface.Predicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
		BiPredicate<Integer, Integer> eq = (x, y) -> x -2 > y;
		System.out.println(bi.test(2, 3));
		System.out.println(bi.or(eq).test(2, 3));
		System.out.println(bi.or(eq).test(8, 3));

	}

}
