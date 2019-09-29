package string;

import java.util.HashMap;
import java.util.Map;


public class CheckAnagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("dbcc", "cbcd"));
	}

	static boolean isAnagram(String s1, String s2) {
		if(s1.length()!= s2.length()) {
			return false;
		}
		
		Map<Character,Integer> map1=new HashMap<>();
		Map<Character,Integer> map2=new HashMap<>();
		
		char[] ch1 =s1.toCharArray();
		
		char[] ch2=s2.toCharArray();
		for(int i=0; i<ch1.length;i++) {
			if(map1.containsKey(ch1[i])) {
				map1.put(ch1[i], map1.get(ch1[i])+1);
			}else {
				map1.put(ch1[i], 1);
			}
		}
		
		for(int i=0; i<ch2.length;i++) {
			if(map2.containsKey(ch2[i])) {
				map2.put(ch2[i], map2.get(ch2[i])+1);
			}else {
				map2.put(ch2[i], 1);
			}
		}
		return map1.keySet().stream().allMatch(k->map1.get(k)==map2.get(k));
	
	}

}
