package string;

public class CheckIfStringContainOnlyDigit {

	public static void main(String[] args) {
		System.out.println(isOnlyDigit("65354353"));
		System.out.println(isOnlyDigit("6555a76"));
	}
	private static boolean isOnlyDigit(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
			}else {
				return false;
			}
		}
		return true;
	}
}
