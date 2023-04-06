package prac.arrays;

public class SmallestArray {
	public static void main(String[] args) {
		int arr[] = new int[] {12,43,46,21,99,7,67,43};
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min);
	}
}
