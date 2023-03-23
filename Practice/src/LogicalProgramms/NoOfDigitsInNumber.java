package LogicalProgramms;

import java.util.Scanner;

public class NoOfDigitsInNumber {

//	Enter Number To Find No of Digits in the number
//	324543
//	Total no of Digits in the numbers are: 6

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Find No of Digits in the number");
		long l = sc.nextInt();
//		long l = 763476232675432l;
		int count=0;
		while(l!=0) {
			l=l/10;
			count++;
		}
		System.out.println("Total no of Digits in the numbers are: " + count);
		sc.close();
	}
}
