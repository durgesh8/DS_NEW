package string;

public class AllPermutationOfString {
 
	public static void main(String[] args) {
		String str = "ABCD";  
        int len = str.length();  
        System.out.println("All the permutations of the string are: ");  
        generatePermutation(str, 0, len);  
	}
	
	public static void generatePermutation(String str, int start, int end) {
		if(start==end-1)
			System.out.println(str);
		
		else {
			for (int i = start; i < end; i++) {
				str=swapString(str,start,i);
				 generatePermutation(str,start+1,end);  
	                //Backtracking and swapping the characters again.  
	                str = swapString(str,start,i);
			}
		}
	}

	private static String swapString(String str, int i, int j) {
		char[] b=str.toCharArray();
		char ch;
		ch=b[i];
		b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
		
	}
}
