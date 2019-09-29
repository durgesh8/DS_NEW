package array;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
public static void main(String[] args) {
	removeDuplicates(new int[] {3,5,1,6,8,7});
}
	
	public static void removeDuplicates(int[] arr) {
		int[] res=new int[arr.length];
		//Arrays.sort(arr);
		Arrays.stream(arr).forEach(
				a->System.out.print(a+" "));
		System.out.println();
		res=sortArray(arr);
		Arrays.stream(res).forEach(
				a->System.out.print(a+" "));

	}
	
	private static int[] sortArray(int[] arr) {
		for(int i=1;i<arr.length;++i) {
				int key=arr[i];
				int j=i-1;
				while(j>=0 && key<arr[j]) {
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=key;
			}
		return arr;
		}
		
	
}
