package com.collections;

import java.util.ArrayList;
import java.util.List;

public class FindFirstInt {
	public static void main(String[] args) {
List<Integer> al = new ArrayList<>();
		
		al.add(12);
		al.add(44);
		al.add(75);
		al.add(12);
		al.add(45);
		al.add(76);
		al.add(87);
		
		
		al.stream().findFirst().ifPresent(System.out::println);


	}
}
