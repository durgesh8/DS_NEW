package string;

public class RemoveCharacterFromString {

	public static void main(String[] args) {
		System.out.println(removeChars("abcdfcg", 'c'));
	}
	
	public static String removeChars(String str, char c) {
		
		int index=str.indexOf(c);
		if(index==-1)
			return str;
		else
			return removeChars(str.substring(0,index)+str.substring(index+1,str.length()),c);
	}
	 
}
