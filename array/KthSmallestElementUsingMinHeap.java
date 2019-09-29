package array;

import java.util.Arrays;

public class KthSmallestElementUsingMinHeap {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(heapify(new int[] {45,12,85,32,89,39,69,44,42,1,6,8})));	
		}

	static int[] heapify(int[] arr) {
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(res[0]==0) {
				res[0]=arr[i];
			}else {
				if(arr[i]<res[i-1]) {
					int temp=res[i-1];
					res[i-1]=arr[i];
					res[i]=temp;
				}else {
					res[i]=arr[i];
				}
			}
		}
		return res;
	}
}
