package NumberSeries;

public class DifferenceOfNaturalNumber {
	//1 2 4 7 11 ....n
	public static void main(String[] args) {
		int n =5;
		int sum =1 ;
		for (int i = 0; i < n ; i++) {
			sum=i+sum;
			System.out.println(sum);
		}
	}
}
