package string;

import java.util.Arrays;

public class IPValidator {
	public static void main(String[] args) {
		System.out.println(isIPValid(".1.2.2"));
		System.out.println(isIPValid("1.1.2.2"));
		System.out.println(isIPValid(".1.2.267"));
		System.out.println(isIPValid("1.1.x.2"));
	}

	static boolean isIPValid(String str) {
		String [] st=str.split("\\.");
		if(st.length!=4)
			return false;
		try {
		return Arrays.stream(st).map(Integer::parseInt).filter(s->s>=0 && s<=255).count()==4;
		}catch (Exception e) {
			return false;
		}
	}
}
