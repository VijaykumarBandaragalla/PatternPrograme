package NumberSeries;


public class TablesofNumber {

	public static void main(String[] args) {
		int n =20;
		//1 2 4 8 16 ....n
		for (int i = 1; i <= n; i+=i ) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		
		for (int i = 0; i <=n; i++) {
			System.out.print((int)Math.pow(2, i) + " ");
		}
		System.out.println();
		
		
		for (int i = 0; i <=n; i++) {
			System.out.print((1<< i )+ " ");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		//1 2 9 28 65 ...n
		for (int i = 0; i < n ; i++) {
			System.out.print((i*i*i)+1 + " ");
		}
		System.out.println();
		System.out.println("--------------------------------");
		
		//1 2 4 7 11 .....n
		int sum=1;
		for (int i = 0; i < n; i++) {
			sum = sum+i;
			System.out.print(sum + " ");
		}
		System.out.println();
		System.out.println("------------------------------------");
		
		//1 4 9 16 25 36
		for (int i = 1; i < n; i++) {
			System.out.print(i*i + " ");
		}
		System.out.println();
		System.out.println("--------------------------------------");
		
		int sum1=0;
		for (int i = 1; i < n; i++) {
			sum1 = sum1+i;
			System.out.print(sum1 + " ");
		}
		System.out.println();
		System.out.println("---------------------------------------");
		
		
	}

}
