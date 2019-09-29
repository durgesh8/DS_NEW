package linkedlist;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(3);
		ll.add(2);
		ll.add(7);
		ll.add(9);
		ll.add(4);
		ll.add(6);
		ll.insertAtStart(8);
		ll.display(ll.head);
		ll.deleteFromLast();
		System.out.println();
		ll.display(ll.head);
		System.out.println();
		//ll.display(ll.segregateOddEvenNode());
		ll.deleteMiddle();
		ll.display(ll.head);
	}
}
