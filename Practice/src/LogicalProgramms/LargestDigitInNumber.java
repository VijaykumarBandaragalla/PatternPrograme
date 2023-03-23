package LogicalProgramms;

import java.util.Scanner;

public class LargestDigitInNumber {
//	Enter Number to find the largest digit in it
//	6797843
//	Max Digit present in the number  is: 9
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to find the largest digit in it");
		int n = sc.nextInt();
		int max=n%10;
		while(n!=0) {
			int rem=n%10;
			if(rem>max) {
				max=rem;
			}
			n=n/10;
		}
		System.out.println("Max Digit present in the number  is: "+max);
		sc.close();
	}
}
