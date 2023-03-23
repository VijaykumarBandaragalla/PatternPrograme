package Pattern;

public class PatternTA19 {
	public static void main(String[] args) {
//		B 3 4 5 6 
//		3 C 5 6 7 
//		4 5 D 7 8 
//		5 6 7 E 9 
//		6 7 8 9 F 

		int n= 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==j)
					System.out.print((char)(i+65) + " ");
				else 
					System.out.print(i+j + " ");
			}
			System.out.println();
		}
	}
}
		
		
		
		
//		A 
//		B C 
//		D E F 
//		G H I J 


//		char ch ='A';
//		for (int i = 1; i < 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(ch++ +" ");
//			}
//			System.out.println();
//		}
//	}
//}
		
//		A 
//		B E 
//		C F H 
//		D G I J 

//		int n= 4;
//		for (int i = 1; i <= n; i++) {
//			int x=i;
//			for (int j = 1; j <=i; j++) {
//				System.out.print((char)(x+64)+ " ");
//				x=x+(n-j);
//			}
//			System.out.println();
//			
//		}
//	}
//}
