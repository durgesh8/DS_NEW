package string;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		System.out.println(removeDuplicateChars("geeksforgeeks"));
	}
	
	private static String removeDuplicateChars(String st) {
		String sb=new String();
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(sb.indexOf(ch)<0) {
				sb=sb+ch;
			}
		}
		return sb;
	}
}
