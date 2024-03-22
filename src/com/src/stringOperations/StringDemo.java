package com.src.stringOperations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringDemo {

	public static void main(String[] args) {

		// Count repeated character in string
		String str="Well55";
		HashMap<Character, Integer> charMap= new HashMap<Character, Integer>();
		char[] arr=str.toCharArray();

		for(char value: arr) {
			if(Character.isLetterOrDigit(value)) {
				if(charMap.containsKey(value)) {
					charMap.put(value, charMap.get(value)+1);
				}else {
					charMap.put(value, 1);
				}
			}
		}
		System.out.println(charMap.toString());
		
		// Count repeated character in string using Java 8 Lambda expression & Stream
		Map<String, Long> charMaps=Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		System.out.println(charMaps.toString());
	}
}

