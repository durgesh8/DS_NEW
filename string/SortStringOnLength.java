package string;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringOnLength {

	public static void main(String[] args) {
		String[] strArray= {"want","Java","do","World","its"};
		System.out.println(Arrays.toString(sortString(strArray)));
	}
	public static String[] sortString(String[] strArray) {
		//Arrays.sort(strArray,new StringComparator());
		Arrays.sort(strArray,Comparator.comparing(String::length));
		return strArray;
	}
}

class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return o1.length()-o2.length();
	}
	
}
