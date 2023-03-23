package girmiti.arrays;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {

//		reading input from the user

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of an array");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+ size + " array elements ");
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
		}

//		Creating new Array and running the loop in reverse order.
		int arr2[] = new int[arr.length] ;
		for (int i =arr2.length-1 ; i >=0; i--) {
			arr2[i]=arr[i];
			System.out.println(arr2[i]);
		}
		sc.close();
	}
}
