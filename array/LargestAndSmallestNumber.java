package array;

public class LargestAndSmallestNumber {
	public static void main(String[] args) {
		int a[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };
		getNumbers(a);
	}

	public static void getNumbers(int[] arr) {
		int smallest = arr[0];
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest)
				smallest = arr[i];
			if (arr[i] > largest)
				largest = arr[i];
		}
		System.out.println("Largest: " + largest + " Smallest: " + smallest);
	}
}
