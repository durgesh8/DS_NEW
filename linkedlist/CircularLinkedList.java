package linkedlist;

public class CircularLinkedList {

	Node head;

	public CircularLinkedList() {
		this.head = null;
	}

	public  Node insertAtStart(int data) {
		Node node = new Node(data);
		Node tmp = head;
		if (head == null) {
			node.next = node;

		} else {
			while (tmp.next != head) {
				tmp = tmp.next;
			}
			node.next = tmp.next;
			tmp.next = node;
		}
		head = node;
		return head;

	}

	public void display() {
		Node tmp = head;
		do {
			System.out.print(tmp.data + "->");
			tmp = tmp.next;
		}
		while (tmp!= head);
			
	}

}
