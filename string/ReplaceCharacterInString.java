package string;

public class ReplaceCharacterInString {
	public static void main(String[] args) {
		System.out.println(replace("Java is Great", "%20"));
	}

	public static String replace(String str, String rep) {
		char[] chArray=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<chArray.length;i++) {
			
			if(chArray[i]==' ') {
                sb.append(rep);
			}else
				sb.append(chArray[i]);
		}
		return sb.toString();
	}
}
