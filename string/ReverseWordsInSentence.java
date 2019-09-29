package string;

public class ReverseWordsInSentence {
	public static void main(String[] args) {
            System.out.println(reverseWords("Java is best programming language"));
	}

	public static String reverseWords(String st) {
		String[] stArr = st.split(" ");
		for (int i = 0, j = stArr.length - 1; i < stArr.length / 2; i++, j--) {
			String temp = stArr[i];
			stArr[i] = stArr[j];
			stArr[j] = temp;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < stArr.length; i++) {
			sb.append(stArr[i]+" ");
		}
		return sb.toString();
	}
}
