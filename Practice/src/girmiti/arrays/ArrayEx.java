package girmiti.arrays;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
//		List al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		String ip = sc.nextLine();
		List<String> list = Collections.nCopies(5, ip);
		System.out.println(list);
		for(Object s:list) {
			System.out.println(s);
		}
		sc.close();
	}
}
