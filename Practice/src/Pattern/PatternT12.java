package Pattern;

public class PatternT12 {
	public static void main(String[] args) {
//		   * *   
//		 *     
//		 *     
//		 *     
//		   * *  
		int row =5 ;
		int col = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(i==0 && j ==1 || i==0 && j ==2 ||i==1 && j ==0 ||i==2 && j ==0 ||i==3 && j ==0 ||i==4 && j ==1 ||i==4 && j ==2 ) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
