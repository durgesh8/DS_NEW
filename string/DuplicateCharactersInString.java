package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		printDuplElements2("Geeks For Geeks");
		
		  System.out.println("2nd method"); 
		  printDuplElements2("Geeks For Geeks");
		  
		  System.out.println("2nd method");
		 
	}
	
	private static void  printDuplElements(String str) {
		if(str.trim().length()==0) {
			System.out.println((String)null);
		}
		else {
			Map<Character,Integer> map=new HashMap<>();
			char[] arr=str.replaceAll("\\s", "").toCharArray();
			for(int i=0;i<arr.length;i++){
				if(map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i])+1);
				}else {
					map.put(arr[i], 1);
				}
			}
			
			for(Entry<Character, Integer> entry:map.entrySet()) {
				if(entry.getValue()>1) {
					System.out.println(entry.getKey()+"--> "+entry.getValue());
				}
			}
			
			System.out.println("With java 8");
            map.forEach((k,v)->{
            	if(v>1) {
            		System.out.println(k+"-->"+v);
            	}
            });	
            
		}
		
		
	}
	
	private static void  printDuplElements2(String str) {
		int[] count=new int[256];
		for(int i=0;i<str.length();i++) {
			System.out.print((int)str.charAt(i)+" ");
			count[str.charAt(i)]++;
		}
		for(int i=0;i<256;i++) {
			if(count[i]>1) {
				System.out.println((char)i+"---> "+count[i]);
			}
		}
		
	}
}
