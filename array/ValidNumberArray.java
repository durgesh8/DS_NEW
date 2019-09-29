package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidNumberArray {
	public static void main(String[] args) {

		int[] arr=new int[] {1,2,3,4,5,6};
		int x=2;
		int k=3;
		System.out.println(getKthNumber(arr, x, k));
	}

	public static int getKthNumber(int[] arr, int x, int k) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < arr.length; i++) {
			List<Integer> innerList = new ArrayList<Integer>();
			for (int j = 0; j < x; j++) {
				innerList.add(arr[i++]);
			}
			i--;
			list.add(innerList);
		}
		List<String> stringList = new ArrayList<>();
		
		for (int i = 0; i < list.get(0).size(); i++) {
			stringList.add(list.get(0).get(i).toString());
		}
		int stringsize=stringList.size();
		for (int i = 1; i < list.size(); i++) {
			List<String> stringList2 = new ArrayList<>();
			for (int j = 0; j < stringsize; j++) {
				
				for (int m = 0; m < list.get(i).size(); m++) {
					stringList2.add(stringList.get(j) + list.get(i).get(m).toString());
				}
				
			}
			stringList.clear();
			stringList.addAll(stringList2);

		}

		List<Integer> resList = new ArrayList<>();
		for (int i = 0; i < stringList.size(); i++) {
			resList.add(Integer.parseInt(stringList.get(i)));
		}

		Collections.sort(resList);
		return resList.get(k-1);
	}

}
