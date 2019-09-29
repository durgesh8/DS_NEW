package array;

import java.util.Arrays;

public class DutchNationalFlagProblem {

	public static void main(String[] args) {
		int[] sortedArray=sortArrays012(new int[] {0, 1, 2, 0, 1, 2});
		System.out.println(Arrays.toString(sortedArray));
		System.out.println(Arrays.toString(sortArrays012(new int[] {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1})));
	}
	
	public static int[] sortArrays012(int[] arr) {
		int[] res=new int[arr.length];
		int i=0;
		int j=arr.length-1;
		for(int m=0;m<arr.length;m++) {
			if(arr[m]==0)
				res[i++]=0;
			if(arr[m]==2)
				res[j--]=2;
		}
		while(i<=j) {
			res[i++]=1;
		}
		return res;
	}
}
