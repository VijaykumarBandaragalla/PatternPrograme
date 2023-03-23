package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Findcount {

	public static void main(String[] args) {
		
		
		List<Integer> al = new ArrayList<>();
		
		al.add(12);
		al.add(44);
		al.add(75);
		al.add(12);
		al.add(45);
		al.add(87);
		long count = al.stream().count();
		System.out.println(count);
		

	}

}
