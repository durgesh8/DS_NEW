package string;

public class IsPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("maam"));
	}

	public static boolean isPalindrome(String st) {
		char[] charr=st.toCharArray();
		for(int i=0,j=charr.length-1;i<charr.length;i++,j--) {
			if(charr[i]!=charr[j]) {
				return false;
			}
		}
		return true;
	}
}
