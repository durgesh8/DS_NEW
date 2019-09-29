package stack;

import java.util.Stack;

public class LengthOfLongestValidParenthesis {

	public static void main(String[] args) {
		System.out.println(getLength("((()"));
		System.out.println(getLength(")()())"));
		System.out.println(getLength("()(()))))"));
	}
	public static int getLength(String exp) {
		int count=0;
		Stack<Character> st=new Stack<>();
	      char[] ch=exp.toCharArray();
	      for(int i=0;i<ch.length;i++) {
	    	  switch (ch[i]) {
			case '(':
				st.push(ch[i]);
				continue;
			case ')':
				if(st.isEmpty())
					continue;
				else {
					if(st.peek()=='(') {
						st.pop();
						count=count+2;
					}
				}
			}
	      }
	      return count;
	}
}
