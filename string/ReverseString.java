package string;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverseStringIteration("Durgesh"));
		System.out.println(reverseStringRecursively("Durgesh"));
	}

	public static String reverseStringIteration(String str) {
		if(str.length()<2)
			return str;
		char[] arr=str.toCharArray();
		for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--) {
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		return new String(arr);
	}
	
	public static String reverseStringRecursively(String str) {
		if(str.length()==1)
			return str;
		else
			return str.charAt(str.length()-1)+reverseStringRecursively(str.substring(0,str.length()-1));
	}
}
