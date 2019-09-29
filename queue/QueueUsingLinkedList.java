package queue;

import java.util.LinkedList;

public class QueueUsingLinkedList {

	LinkedList<Integer> ll=new LinkedList<Integer>();
	
	public void enqueue(int x) {
		ll.add(x);
	}
	
	public int dequeue() {
		return ll.removeLast();
	}
}
