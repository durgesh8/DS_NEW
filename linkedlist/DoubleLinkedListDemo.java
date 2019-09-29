package linkedlist;

public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		DoubleLinkedList dll=new DoubleLinkedList();
		dll.insertAtEnd(3);
		dll.insertAtStart(6);
		dll.insertAtEnd(4);
		dll.insertAtEnd(8);
		dll.insertAtEnd(3);
		dll.insertAtStart(1);
		dll.insertAfterNode(9, dll.head.next.next.next);
		dll.displayList(dll.head);
	}
}
