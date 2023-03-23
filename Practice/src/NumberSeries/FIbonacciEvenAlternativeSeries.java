package NumberSeries;

public class FIbonacciEvenAlternativeSeries {

	public static void main(String[] args) {
//1 2 1 4 2 6 3 8 5 10 8 12 13 14 21 16 34 18 55 20
		int f=1;
		int s=1;
		int t=0;
		int n=20;
		for (int i = 0; i < n; i++) {
			if(i%2==0) {
				t=f+s;
				System.out.print(f + " ");
				f=s;
				s=t;	
			}
			else {
				System.out.print(i+1 + " ");
				
			}
		}
	}

}
