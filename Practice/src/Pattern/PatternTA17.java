package Pattern;

public class PatternTA17 {
	public static void main(String[] args) {
//		A 3 4 5 6 
//		3 B 5 6 7 
//		4 5 C 7 8 
//		5 6 7 D 9 
//		6 7 8 9 E 
		
		int row = 5;
		int col = 5;
		for (int i = 1; i <=row; i++) { //changed to int i = 1; i <=row; i++
			for (int j = 1; j <= col; j++) { //changed to int j = 1; j <= col; j++
				if(i ==j) {
					System.out.print((char)(j+64)+" ");
				}
				else {
					System.out.print(i+j +" ");
				}
			}
			System.out.println();
		}
	}
}
