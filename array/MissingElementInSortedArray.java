package array;

public class MissingElementInSortedArray {
	
	public static void main(String[] args) {
		System.out.println(searchMissing(new int[] {1, 2, 3, 4, 5, 7, 8}, 0, 6));
	}

	public static boolean searchMissing(int[] arr, int start, int end) {
		int mid = (start + end) / 2;
		int diff = arr[mid]-mid;
		if (start > end)
			return false;
		else if (diff == 2) {
			if (( arr[mid - 1]-(mid - 1)  == 1) && start <= end) {
				return true;
			} else {
				end = mid - 1;
				return searchMissing(arr, start, end);
			}
		} else if (diff == 1) {
			if ( arr[mid + 1]-(mid + 1)  == 2) {
				return true;
			} else {
				start = mid + 1;
			return	searchMissing(arr, start, end);
			}

		}else
			return false;

		

	}
}
