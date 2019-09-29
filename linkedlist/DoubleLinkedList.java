package linkedlist;

public class DoubleLinkedList {

	DLLNode head;

	public DoubleLinkedList() {
		this.head = null;
	}

	public void insertAtStart(int data) {
		DLLNode node = new DLLNode(data);
		node.next = head;
		node.prev = null;
		if (head != null)
			head.prev = node;
		head = node;

	}
	
	public void insertAfterNode(int data,DLLNode prevNode) {
		if(prevNode==null) {
			System.out.println("previous node cannot be null");
			return;
		}
		
		DLLNode node=new DLLNode(data);
		node.prev=prevNode;
		node.next=prevNode.next;
		prevNode.next.prev=node;
		prevNode.next=node;
		
	}
	
	public void insertAtEnd(int data) {
		DLLNode currNode=head;
		DLLNode node=new DLLNode(data);
		if(head==null)
			head=node;
		else {
			while(currNode.next!=null) {
				currNode=currNode.next;
			}
			
			node.prev=currNode;
			currNode.next=node;
		}
	}
	
	public void displayList(DLLNode head) {
		DLLNode currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data+"->");
			currNode=currNode.next;
		}
		System.out.println("null");
	}
}
