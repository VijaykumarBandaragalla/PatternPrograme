package NumberSeries;

public class FIbonacciNatutalAlternativeSeries {
	public static void main(String[] args) {
//1 1 1 3 2 5 3 7 5 9 8 11 13 13 21 15 34 17 55 19 
		int n=20;
		int f=1,s=1,t=0;
		for (int i = 0; i < n; i++) {
			if(i%2==0) {
				t=f+s;
				System.out.print(f + " ");
				f=s;
				s=t;
			}
			else {
				System.out.print(i + " ");
			}
		}
	}
}
