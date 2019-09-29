package stack;

import java.util.Stack;

public class SortStack2 {
	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(11);
		st.push(2);
		st.push(32);
		st.push(3);
		st.push(41);
		System.out.println(st);
		sortStack(st);
		System.out.println(st);
		
	}

	public static Stack<Integer> sortStack(Stack<Integer> st){
		Stack<Integer> tmpstack=new Stack<Integer>();
		if(!st.isEmpty()) {
			tmpstack.push(st.pop());
		}
		while(!st.isEmpty()) {
			if(tmpstack.peek()>=st.peek()) {
				tmpstack.push(st.pop());
			}else {
				int x=st.pop();
				while(tmpstack.peek()<x) {
					st.push(tmpstack.pop());
				}
				tmpstack.push(x);
			}
		}
		
		while(!tmpstack.isEmpty()) {
			st.push(tmpstack.pop());
		}
		return st;
	}
}
