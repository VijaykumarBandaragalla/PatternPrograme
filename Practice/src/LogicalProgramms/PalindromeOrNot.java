package LogicalProgramms;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to find Weather Palindrome or not");
		int n = sc.nextInt();
		int rev=0;
		int rem=0;
		
		while(n!=0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		sc.close();
	}
}
