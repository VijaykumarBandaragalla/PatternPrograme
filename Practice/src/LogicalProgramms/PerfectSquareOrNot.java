package LogicalProgramms;

import java.util.Scanner;

public class PerfectSquareOrNot {
//	Enter Number to find the Number is perfect square or not
//	3543
//	3543 : is not a perfect Square
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to find the Number is perfect square or not");
		int n = sc.nextInt();
		int sqrt=(int)Math.sqrt(n);
		System.out.println(n==sqrt*sqrt ? n+" : is a perfect square number" : n+" : is not a perfect Square");
		sc.close();
	}
}
