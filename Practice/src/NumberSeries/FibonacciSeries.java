package NumberSeries;

public class FibonacciSeries {
	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13 21 34 55 89 ....n

		
		int f=0;
		int s=1;
		int t=0;
		
		int n=10;
		System.out.println(f);
		System.out.println(s);
		for (int i = 0; i < n; i++) {
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
		}
	}
}
