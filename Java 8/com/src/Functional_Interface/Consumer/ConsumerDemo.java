package com.src.Functional_Interface.Consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*
 * Consumer is accepting one argument, and printing it in upper case, but there is no return value.
 * The Consumer interface accepts one argument, but there is no return value.
 * The name of the function inside this interface is accept.
 */
public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> uconsumer=s->System.out.println(s.toUpperCase());
		uconsumer.accept("welcome");

		System.out.println("-------------------------------");
		
		BiConsumer<String, String> biConsumer=(x,y)->System.out.println("x: "+x+" Y: "+y);
		biConsumer.accept("Sun", "Moon");
		
		System.out.println("-------------------------------");
		
		Consumer<String> c1=s->System.out.println(s+"  "+"is white");
		Consumer<String> c2=s->System.out.println(s+"  "+"is having four legs");
		Consumer<String> c3=s->System.out.println(s+"  "+"is eating grass");
		
		c1.accept("Cow");
		c2.accept("Cow");
		c3.accept("Cow");
		
		System.out.println("-------------------------------");
		// or
		
		c1.andThen(c2).andThen(c3).accept("cow");

		System.out.println("-------------------------------");
		// or
		Consumer<String> c4=c1.andThen(c2).andThen(c3);
		c4.accept("cow");
	}
}
