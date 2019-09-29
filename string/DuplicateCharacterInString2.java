package string;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacterInString2 {

	public static void main(String[] args) {
		getDuplicateCharacter("Geeks For Geeks");
	}
	private static void getDuplicateCharacter(String str) {
		if(str.trim().length()==0) {
			System.out.println((String)null);
		}
		else {
			char[] chAraay=str.replaceAll("\\s", "").toCharArray();
			int[] arr=new int[256];
			for(int i=0;i<chAraay.length;i++) {
					arr[chAraay[i]]++;
			}
			Set<Character> charSet=new HashSet<>();
			for(int i=0;i<chAraay.length;i++) {
				
				if(arr[chAraay[i]]>1) {
					if(charSet.contains(chAraay[i])) {
						
					}else {
						System.out.println("dup char "+chAraay[i] +"----->"+arr[chAraay[i]]);
						charSet.add(chAraay[i]);
						System.out.println(charSet.toString());
					}
					
				}
					
			}
		}
	}
}
