package LogicalProgramms;

import java.util.Scanner;

public class SumOfDigits {
//	Enter Number to find Sum of it's Digits 
//	23445
//	Sum Of entered digits are : 18
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to find Sum of it's Digits ");
		int n = sc.nextInt();
//		int n=143435;
		int rem=0;
		int sum=0;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum Of entered digits are : "+sum);
		sc.close();
	}
}
