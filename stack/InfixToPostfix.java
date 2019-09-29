package stack;

import java.util.Stack;

public class InfixToPostfix {
	
	public static void main(String[] args) {
		System.out.println(infixtoPostfix("a+b*(c^d-e)^(f+g*h)-i"));
	}
	
	static int prec(char c) {
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

	static String infixtoPostfix(String infix) {
		Stack<Character> st = new Stack<>();
		StringBuilder res=new StringBuilder();
		char[] chArr=infix.toCharArray();
		for(int i=0;i<chArr.length;i++) {
			if(Character.isLetterOrDigit(chArr[i]))
				res.append(chArr[i]);
			else if(chArr[i]=='('){
				st.push(chArr[i]);
			}
				else if(chArr[i]==')') {
					while(!st.isEmpty() && st.peek()!='(') {
						res.append(st.pop());
					}
						if(!st.isEmpty())
							st.pop();
					
				}
				else {
					if(st.isEmpty() ||prec(chArr[i])>prec(st.peek())){
						st.push(chArr[i]);
					}
					else {
						while(prec(st.peek())>prec(chArr[i])) {
							res.append(st.pop());
						}
						st.push(chArr[i]);
					}
				}
			}
		
		while(!st.isEmpty()) {
			res.append(st.pop());
		}
		
		return res.toString();
	}
}
