package Pattern;

public class Pattern3 {
//	* * * * * 
//	*       * 
//	*       * 
//	*       * 
//	* * * * * 

	public static void main(String[] args) {
		int row =5;
		int col=5;
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < col; j++) {
				if(i==0 || j==0 || i==row-1 || j==col-1) {
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
