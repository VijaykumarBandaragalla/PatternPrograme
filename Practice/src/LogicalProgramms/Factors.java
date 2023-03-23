package LogicalProgramms;

import java.util.Scanner;

public class Factors {
//	Enter Number To Find Factors 
//	4
//	Factor of 4 is: 
//	1
//	2
//	4
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Find Factors ");
		int n = sc.nextInt();
		System.out.println("Factor of " +n+ " is: ");
		for (int i = 1; i <= n; i++) {
			if(n%i == 0) {
				System.out.println(i );
			}
		}
		sc.close();
	}
}
