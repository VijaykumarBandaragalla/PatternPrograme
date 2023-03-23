package LogicalProgramms;

import java.util.Scanner;

public class PowerOfNumber {
//	Enter 2 number i.e base and power
//	3
//	3
//	27

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number i.e base and power");
		int base = sc.nextInt();
		int pow = sc.nextInt();
		int op=1;
		while(pow>=1) {
			op=op*base;
			pow--;
		}
		System.out.println(op);
		sc.close();
	}
}
