package string;

public class LongestPalindromicSubstring {
	
	
	public static void main(String[] args) {
		String str = "ABDCBCDBDCBBC";
		
		System.out.println("Longest Palindromic SubString of " + str + " is "
				+ longestPalString(str, str.length() - 1));
	}

	public static String longestPalString(String str, int length) {
		// max_str stores the maximum length palindromic substring
				// found so far
		String max_str="",curr_str;
		// max_length stores the length of maximum length palindromic
				// substring found so far
		int max_length=0,curr_length;
		// consider every adjacent pair of characters as mid points and
				// expand in both directions to find maximum length palindrome
		
		for(int i=0;i<length;i++) {
			// find a longest odd length palindrome with str[i] as mid point
			curr_str = expand(str, i, i);
			curr_length=curr_str.length();
			
			if(curr_length>max_length) {
				max_length=curr_length;
				max_str=curr_str;
			}
			
			// find a longest even length palindrome with str[i] and
						// str[i+1] as mid points.
						// Note that an even length palindrome has two mid points
			
			curr_str=expand(str, i, i+1);
			if(curr_length>max_length) {
				max_length=curr_length;
				max_str=curr_str;
			}
		}
		
		return max_str;
		
	}
	
	// expand in both directions of low and high to find
		// maximum length palindrome
	public static String expand(String str, int low, int high) {
		int length=str.length();
		while(low>=0 && high<length &&(str.charAt(low)== str.charAt(high))) {
			low--;
			high++;
		}
		return str.substring(low+1,high);
	}
}
