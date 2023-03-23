package LogicalProgramms;

import java.util.Scanner;
public class EvenOrOdd {
//	Enter Number To check Even Or Odd
//	12
//	even
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number To check Even Or Odd");
			int n = sc.nextInt();
//			if(n%2==0)
//				System.out.println("Even Number");
//			else
//				System.out.println("Odd Number");
			System.out.println((n % 2) == 0 ? "even":"odd");
			sc.close();
		}
	}
}
