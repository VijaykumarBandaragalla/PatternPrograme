package LogicalProgramms;

import java.util.Scanner;

public class ReverseOfNumber {
//	Enter Number to find the reverse of it
//	3225
//	Reverse of 3225 is: 
//	5223
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to find the reverse of it");
		int n = sc.nextInt();
//		int n=1276;
		System.out.println("Reverse of " +n+" is: ");
		while(n!=0) {
			System.out.print( n%10);
			n=n/10;
		}
		sc.close();
	}
}
