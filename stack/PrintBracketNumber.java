package stack;

import java.util.Stack;

public class PrintBracketNumber {
	public static void main(String[] args) {
		//printBracketNumber("(a+(b*c))+(d/e)");
		printBracketNumber("((())(()))");
	}

	public static void printBracketNumber(String exp){
		
		char[] ch=exp.toCharArray();
		Stack<Integer> st=new Stack<>();
		int j=1;
		for(int i=0;i<ch.length;i++) {
			if(ch[i] == '(') {
			    System.out.print(j+" ");
			    st.push(j);
			    j++;
			    
			}
			if(ch[i] == ')') {
				System.out.print(st.pop()+" ");
			}
		}
	}
}
