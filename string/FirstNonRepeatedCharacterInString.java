package string;

public class FirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		System.out.println(getCharacter("Morning"));
		System.out.println(getCharacter("abcdefghija"));
		System.out.println(getCharacter("hello"));
		System.out.println(getCharacter("Java"));
		System.out.println(getCharacter("simplest"));
	}
	
	public static char getCharacter(String st) {
		int[] count=new int[256];
		for(int i=0;i<st.length();i++) {
			count[st.charAt(i)]++;
		}
		
		for(int i=0;i<st.length();i++) {
			if(count[st.charAt(i)]==1) {
				return st.charAt(i);
			}
		}
		return (Character) null;
	}
}
