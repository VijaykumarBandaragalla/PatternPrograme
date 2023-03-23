package LogicalProgramms;

import java.util.Scanner;

public class SwapTwoNumbers {
//	Enter Numbers Swap
//	324
//	3423654
//	After Swapping a Value is 3423654
//	After Swapping b Value is 324

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers Swap");
		int a = sc.nextInt();
		int b= sc.nextInt();
		
// 		1st Method ( using 3 variables )==========================================================
		int temp =0;
		temp =a;
		a=b;
		b=temp;
		System.out.println("After Swapping a Value is "+a);
		System.out.println("After Swapping b Value is "+b);
//		
//		2nd Method ( using addition )==========================================================
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("After Swapping a Value is "+a);
//		System.out.println("After Swapping b Value is "+b);

//		3rd Method ( using multiplication )==========================================================
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		System.out.println("After Swapping a Value is "+a);
//		System.out.println("After Swapping b Value is "+b);
		
//		4th Method ( using XOR condition )======================================================
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		System.out.println("After Swapping a Value is "+a);
//		System.out.println("After Swapping b Value is "+b);
		
//		5th Method ( Using Single line Statement ) =================================================
//		b= (a+b)-(a=b);
//		System.out.println("After Swapping a Value is "+a);
//		System.out.println("After Swapping b Value is "+b);
		sc.close();
	}
}
