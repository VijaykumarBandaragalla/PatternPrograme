package NumberSeries;


public class AlernativeNumbers {
	public static void main(String[] args) {
		int n = 10;
		//2 1 4 3 6 5 8 7 10 .....
		for (int i = 1; i < n; i++) {
			System.out.print((i%2==0) ? i-1+" " : +i+1+" " );
		}
	}
}
