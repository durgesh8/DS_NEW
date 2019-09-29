package string;

import java.util.ArrayList;
import java.util.List;

public class CharacterOccurence {

	public static void main(String[] args) {
		getCountOfCharacters("geeksforgeeks");
	}

	private static void getCountOfCharacters(String str) {
		int[] count = new int[256];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		char ch[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			int find = 1;
			for (int j = 0; j < i; j++) {
				if (str.charAt(i) == ch[j])
					find++;
			}
			if (find == 1)
				System.out.println(str.charAt(i) + " occured for : " + count[str.charAt(i)]);
		}

	}

}
