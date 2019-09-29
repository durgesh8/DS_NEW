package array;

public class StringTest {

	public static void main(String[] args) {
		String str="abd";
		String str1=new String("abd");
		String str2=new String("abd").intern();
		
		System.out.println(str==str1);
		System.out.println(str.hashCode()+"------------"+str1.hashCode());
		System.out.println(str==str1.intern());
		System.out.println(System.identityHashCode(str1)+"----------"+System.identityHashCode(str)+"----------"+System.identityHashCode(str2));
	}
}
