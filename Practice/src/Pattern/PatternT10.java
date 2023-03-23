package Pattern;

public class PatternT10 {
	public static void main(String[] args) {
//		* * * * * 
//		* *   *   
//		*   *     
//		* *   *   
//		*       * 
		int row = 5;
		int col =5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(i==0 || j==0 || i+j == row-1 || i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
