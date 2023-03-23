package Pattern;

public class PatternTA16 {
	public static void main(String[] args) {
//		DCBA
//		DCBA
//		DCBA
//		DCBA

		int row = 4;
		int col = 4;
		for (int i = row; i >=1; i--) {
			for (int j = col; j >= 1; j--) {
				System.out.print((char)(64+j));
				
			}
			System.out.println();
		}
	}
}
