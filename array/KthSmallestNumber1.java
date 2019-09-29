package array;

import java.util.Arrays;

public class KthSmallestNumber1 {

	public static void main(String[] args) {
		System.out.println(getkthSmallest(new int[]{12, 3, 5, 7, 19}, 4));
	}
	private static int getkthSmallest(int[] arr, int n) {
		Arrays.sort(arr);
		return arr[n-1];
	}
}
