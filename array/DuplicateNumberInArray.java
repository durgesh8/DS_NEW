package array;
// this algorithm works when you have numbers in range of arr.length-1
public class DuplicateNumberInArray {

	public static void main(String[] args) {
		System.out.println(findDuplicateNumberInArray(new int[] { 4, 2, 4, 5, 2, 3, 1 }));
	}

	public static int findDuplicateNumberInArray(int[] arr) {
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (res[arr[i]] == 0) {
				res[arr[i]] = 1;
			} else {
				return arr[i];
			}
		}

		return -1;
	}
}
