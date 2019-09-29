package queue;

import java.util.Stack;

public class QueueUsingTwoStacks {

	Stack<Integer> st;
	Stack<Integer> st2;
	
	public QueueUsingTwoStacks() {
		st=new Stack<>();
		st2=new Stack<>();
	}
	
	public void enqueue(int x) {
		System.out.println("Enqueue: "+x);
		st.push(x);
	}
	
	public int dequeue() {
		if(!st2.isEmpty()) {
			return st2.pop();
		}
		else {
			while(!st.isEmpty()) {
				st2.push(st.pop());
			}
			return st2.pop();
		}
	}
	
}
