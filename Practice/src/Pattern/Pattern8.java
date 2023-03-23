package Pattern;

public class Pattern8 {
//	  * * * * * 
//		    *   
//        *     
//      *       
//    * * * * * 
	public static void main(String[] args) {
		int row = 5;
		int col = 5 ;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(i==0 || i+j==row-1 || i==row-1) {
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
