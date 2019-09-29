package stack;

import java.util.Stack;

public class PrefixToInfix {

	public static void main(String[] args) {
		System.out.println(prefToInfix("*-A/BC-/AKL"));
	}
	
	public static String prefToInfix(String exp) {
		Stack<String> st=new Stack<>();
		for(int i=exp.length()-1;i>=0;i--) {
			if(Character.isLetterOrDigit(exp.charAt(i))) {
				st.push(""+exp.charAt(i));
			}
			else {
				String s="("+st.pop()+exp.charAt(i)+st.pop()+")";
				st.push(s);
			}
		}
		return st.pop();
	}
}
