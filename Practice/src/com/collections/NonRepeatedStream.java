package com.collections;

import java.util.Optional;

public class NonRepeatedStream {
	public static void main(String[] args) {
		
		
		String inputString = "Hello, World!";

		Optional<Character> firstNonRepeatedChar = 
				inputString.chars().mapToObj(c -> (char) c)
		                           .filter(ch -> inputString.indexOf(ch) == inputString.lastIndexOf(ch))
		                           .findFirst();

		if(firstNonRepeatedChar.isPresent()) {
		    System.out.println("First non-repeated character in the string: " + firstNonRepeatedChar.get());
		} else {
		    System.out.println("There is no non-repeated character in the string.");
		}
	}
}
