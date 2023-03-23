package com.collections;

import java.util.Optional;

public class FindFirstRepeated {
	public static void main(String[] args) {
		String inputString = "Hello, World!";

		Optional<Character> firstRepeatedChar = inputString.chars()
		                                                  .mapToObj(c -> (char) c)
		                                                  .filter(ch -> inputString.indexOf(ch) != inputString.lastIndexOf(ch))
		                                                  .findFirst();

		if(firstRepeatedChar.isPresent()) {
		    System.out.println("First repeated character in the string: " + firstRepeatedChar.get());
		} else {
		    System.out.println("There is no repeated character in the string.");
		}

	}
}
