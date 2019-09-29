package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPairsOfElementsWithGivenSum {
public static void main(String[] args) {
	List<String> list=findPairs(new int[] { -1,-1,2, 4, 3, 5, 7, 8, 9 }, 7);
	List<String> list2=findPairs2(new int[] {-1,-1, 2, 4, 3, 5, 7, 8, 9 }, 7);
	list.forEach(a->System.out.println(a));
	list2.forEach(a->System.out.println(a));
}
	
	public static List<String> findPairs( int[] arr, int sum) {
		List<String> res=new ArrayList<>();
		Arrays.sort(arr);
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			if(arr[start]+arr[end]==sum) {
				res.add(arr[start]+","+arr[end]);
				start++;
				end--;
			}
				
			else if(arr[start]+arr[end]>sum)
				end--;
			else
				start++;
		}
				
			
		
		return res;
	}
	
	public static List<String> findPairs2(int arr[], int sum){
		List<String> res=new ArrayList<>();
		Set<Integer> set=new HashSet<>();
		for(int value:arr) {
			int target=sum-value;
			if(!set.contains(target)) {
				set.add(value);
			}else {
				res.add(target+","+value);
			}
		}
		return res;
	}
}
 