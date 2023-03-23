package Pattern;

public class PatternTA20 {
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 

	public static void main(String[] args) {
		int n =5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
//				if( j ==0 || i ==4 || i==j || (i==2 && j==1 ) || (i==3 && j==1) || (i==3 && j==2) )
					System.out.print("* ");
			}
//			for (int j = 0; j < n-i; j++) {
//				System.out.print("  ");
//			}
			System.out.println();
		}
	
	}
}
