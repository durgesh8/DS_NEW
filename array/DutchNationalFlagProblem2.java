package array;

import java.util.Arrays;

public class DutchNationalFlagProblem2 {
public static void main(String[] args) {
	System.out.println(Arrays.toString(sortArray(new int[] {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1})));
}
	
	public static int[] sortArray(int[] arr) {
	  int i=0;
	  int j=0;
	  int k=arr.length-1;
	  int temp=0;
	  while(j<=k) {
		  switch (arr[j]) {
		case 0:
			 temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j++;
			break;
		case 1:
			j++;
			break;
		case 2:
			 temp=arr[j];
             arr[j]=arr[k];
             arr[k]=temp;
             k--;
			break;
		}
	  }
	  return arr;
	}
}
