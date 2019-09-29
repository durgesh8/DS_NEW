package stack;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(11);
		st.push(2);
		st.push(32);
		st.push(3);
		st.push(41);
		System.out.println(st);

		System.out.println(sortStackIteratively(st));
		System.out.println(st.pop());
	
	}

	public static Stack<Integer> sortStackIteratively(Stack<Integer> st) {
		Stack<Integer> st1 = new Stack<Integer>();
		st1.push(st.pop());
		while (!st.isEmpty()) {
			if (st.peek() < st1.peek()) {
				st1.push(st.pop());
			} else {
				int element = st.pop();
				while (element > st1.peek()) {
					st.push(st1.pop());
				}
				st1.push(element);
			}
		}

		while (!st1.isEmpty()) {
			st.push(st1.pop());
		}
		return st;
	}
	
	public void  sortStackRecursively(Stack<Integer> st){
		if(st.isEmpty())
			return;
		
		int top=st.pop();
		sortStackRecursively(st);
		sortedInsert(st,top);
	}

	private void sortedInsert(Stack<Integer> st, int key) {
		if(st.isEmpty()|| st.peek()<key) {
			st.push(key);
		}
		
		int top=st.pop();
		sortedInsert(st, key);
		st.push(top);
	}
	
}
