package girmiti.arrays;

public class MaxArray {
	public static void main(String[] args) {
		int arr[] = new int[] {21,43,97,65,21,54,12,56,87,99};
		int max =arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(max);
	}
}
