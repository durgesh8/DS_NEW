package algo.searching;

public class BinarySearch {

	public static void main(String[] args) {
		
		System.out.println(search(new int[] {1,4,6,7,8},0,4,15));
	}
	
	public static boolean search(int[] arr, int start, int end, int number) {
		
		int mid=(start+end)/2;
		if(arr[mid] ==number)
			return true;
		else {
			if(arr[mid]>number && start<=end) {
				end=mid-1;
				return search(arr, start, end, number);
			}else if(arr[mid]<number && start<=end) {
				start=mid+1;
				return search(arr, start, end, number);
			}else
				return false;
				
			
		}
		
		
	}
	
}
