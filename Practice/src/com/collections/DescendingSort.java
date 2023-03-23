package com.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingSort {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

		List<Integer> sortedNumbers = numbers.stream()
		                                     .sorted(Comparator.reverseOrder())
		                                     .collect(Collectors.toList());

		System.out.println("Sorted list in descending order: " + sortedNumbers);

	}
}
