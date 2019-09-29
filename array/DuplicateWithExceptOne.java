package array;

public class DuplicateWithExceptOne {

	public static void main(String[] args) {
		System.out.println(getElement(new int[]{1, 1, 2, 2, 3,3,3, 4, 4, 5, 5}));

	}
	private static int getElement(int[] arr) {
		int res=0;
		for(int i=0;i<arr.length;i++) {
			res=res^arr[i];
		}
		return res;
	}
}
