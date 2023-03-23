package Pattern;

public class ShivanandPAttern {
	public static void main(String[] args) {
		int row=6;
		int col=7;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("  ");
				if( (i+j==row && i!=2)||(i==3&&j==4) ||(i==3&&j==5) || (i==4&&j==6) ) {
					System.out.print("*");
				}
//				else if( j==3 || i+j ==row ) {
//					System.out.print("* ");
//				}
			}
			System.out.println();
		}
//		System.out.println();
		
	}
}
