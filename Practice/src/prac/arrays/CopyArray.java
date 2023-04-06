package prac.arrays;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
//		int arr[]= {12,45,67,32,15,62,87};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of an array");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+ size + " array elements ");
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		//creating new Array
		int arr2[] = new int[arr.length];
		//copying array elements from arr -> arr2
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		//displaying array elements from arr2
		System.out.println("Entered array elements are: ");
		for ( int i : arr2) {
			System.out.print( + i + " ");
		}
		sc.close();
	}
}
