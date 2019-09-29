package string;

public class PrintString {

	public static void main(String[] args) {
		String str="x";
		String target="";
		target=str.replaceAll("x", "xxxxxxxxxx").replaceAll("x", "xxxxxxxxxx").replaceAll("x", "abc\n");
		System.out.println(target);
	}
}
