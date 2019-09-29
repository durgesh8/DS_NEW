package stack;

import java.util.LinkedList;

public class StackUsingLinkedList {

	LinkedList<Integer> ll = new LinkedList<>();

	public void push(int x) {
		ll.add(x);
	}

	public int pop() {

		return ll.removeLast();
	}
}
