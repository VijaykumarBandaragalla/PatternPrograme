package LogicalProgramms;

import java.util.Scanner;

public class FirstNLastDigit {
	
//	Enter Number To Find First and Last Digit 
//	23534
//	First digit is 2 Last digit is 4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Find First and Last Digit ");
		long l = sc.nextInt();
//		long l= 32846487l;
		int x=(int)l%10;
		while(l>10) 
			l=l/10;
		System.out.println("First digit is " + l +" "+ "Last digit is " + x);
		sc.close();
	}
}
