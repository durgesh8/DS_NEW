package string;

public class NumberToWords {

	public static void main(String[] args) {
		System.out.println(convertToWord("9923".toCharArray()));
		System.out.println(convertToWord("523".toCharArray()));
		System.out.println(convertToWord("89".toCharArray()));
		System.out.println(convertToWord("8989".toCharArray()));
	}
	public static String convertToWord(char[] num) {
		StringBuilder res=new StringBuilder();
		if(num.length==0) {
		   res.append("string is empty");
		}
		else if(num.length>4)
			res.append( "Does not support more than 4");
		else {
			String[] single_digits = new String[]{ "zero", "one",  
                    "two", "three", "four", 
                    "five", "six", "seven",  
                        "eight", "nine"};
			
			String[] two_digits = new String[]{"ten", "eleven", "twelve",  
                    "thirteen", "fourteen", 
                    "fifteen", "sixteen", "seventeen", 
                    "eighteen", "nineteen"};
			String[] tens_multiple = new String[]{"", "", "twenty", "thirty", "forty",  
                    "fifty","sixty", "seventy",  
                    "eighty", "ninety"};
			String[] tens_power = new String[] {"hundred", "thousand"};
			int len=num.length;
			int x=0;
			while(x<num.length) {
				if(len==4) {
					if(num[x]-'0'!=0) {
						res.append(single_digits[num[x]-'0']+" ");
						res.append("thousand ");
					}
					len--;
					x++;
					continue;
				}
				if(len==3) {
					if(num[x]-'0'!=0) {
						res.append(single_digits[num[x]-'0']+" ");
						res.append("hundred ");
					}
					len--;
					x++;
					continue;
				}
				if(len==2) {
					if(num[x]-'0'!=0) {
						if(num[x]-'0'==1) {
							res.append(two_digits[num[x+1]-'0']);
						}else {
							res.append(tens_multiple[num[x]-'0']+" ");
							res.append(single_digits[num[x+1]-'0']);
						}
					}
					x=x+2;
				}
				if(len==1) {
					res.append(single_digits[num[x+1]-'0']);
				}
				
			}
		}
		return res.toString();
	}
}
