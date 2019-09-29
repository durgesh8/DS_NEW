package string;

public class CountOfConstantVowelDigit {

	public static void main(String[] args) {
		printNumbers("This website is aw3som3.");
	}
	
	private static void printNumbers(String str) {
		str=str.toLowerCase();
		int consonant=0;
		int vowel=0;
		int digit=0;
		int whitespace=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' )
				++vowel;
			else if(ch>='a'&& ch<='z')
				++consonant;
			else if(ch>='0' && ch<='9')
				++digit;
			else if(ch==' ')
				++whitespace;
		}
		
		System.out.println("consonant: "+consonant);
		System.out.println("vowel: "+vowel);
		System.out.println("digit: "+digit);
		System.out.println("whitespace: "+whitespace);
	}
}
