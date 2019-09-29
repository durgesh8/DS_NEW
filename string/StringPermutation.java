package string;

import java.util.Map;
import java.util.TreeMap;

public class StringPermutation {
	
	public static void main(String[] args) {
		StringPermutation sp=new StringPermutation();
		
		sp.permute(new char[] {'B','A','C','A'});
	}

	public  void permute(char[] input) {
		Map<Character,Integer> map=new TreeMap<>();
		for(char ch:input) {
			map.compute(ch, (key,value)->{
				if(value==null) {
					return 1;
				}
				else {
					return value+1;
				}
			});
		}
		
		char str[]=new char[map.size()];
		int count[]=new int[map.size()];
		int index=0;
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			str[index] =entry.getKey();
			count[index]=entry.getValue();
			index++;
		}
		char result[]= new char[input.length];
		permuteUtil(str,count,result,0);
	}
	
	public void permuteUtil(char str[], int count[], char result[], int level) {
		if(level==result.length) {
			printArray(result);
			return;
		}
		for(int i=0;i<str.length;i++) {
			if(count[i]==0) {
				continue;
			}
			result[level]=str[i];
			count[i]--;
			permuteUtil(str, count, result, level+1);
			count[i]++;
		}
	}
	
	private void printArray(char input[]) {
		for(char ch:input) {
			System.out.print(ch);
		}
		System.out.println();
	}
}
