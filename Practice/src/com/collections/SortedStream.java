package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStream {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

		List<Integer> sortedNumbers = numbers.stream()
		                                     .sorted()
		                                     .collect(Collectors.toList());

		System.out.println("Sorted list: " + sortedNumbers);

	}
}
