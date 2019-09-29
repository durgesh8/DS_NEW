package linkedlist;

public class LinkedList {

	Node head;

	public LinkedList() {
		this.head = null;
	}
	
	public void add(int data) {
		Node node=new Node(data);
		if(head==null)
			head=node;
		else {
			Node crrNode= head;
			while(crrNode.next!=null) {
				crrNode=crrNode.next;
			}
			crrNode.next=node;
		}
	}
	
	public void insertAtStart(int data) {
		Node node=new Node(data);
		if(head==null)
			head=node;
		else {
			node.next=head;
			head=node;
		}
	}
	
	public void deleteFromLast() {
		Node crrNode=head;
		Node prevNode=null;
		while(crrNode.next!=null) {
			 prevNode=crrNode;
			crrNode=crrNode.next;
			
		}
		prevNode.next=null;
	}
	
	public void display(Node head) {
		Node crrNode=head;
		while(crrNode!=null) {
			System.out.print(crrNode.data+"->");
			crrNode=crrNode.next;
		}
		System.out.print((String)null);
	}
	
	public void deleteNode(Node ref) {
		ref.data=ref.next.data;
		ref.next=ref.next.next;
	}
	
	public Node segregateOddEvenNode() {
		Node crr=head;
		Node res=null;
		Node ptrEven=null;
		Node oddPtr=null;
		Node oddPtr1=null;
		while(crr!=null) {
			
			if(crr.data%2==0) {
				if(ptrEven==null) {
					ptrEven=new Node(crr.data);
					res=ptrEven;
				}
					
				else {
					ptrEven.next=new Node(crr.data);
					ptrEven=ptrEven.next;
				}
					
			}else {
				if(oddPtr==null) {
					oddPtr=new Node(crr.data);
					oddPtr1=oddPtr;
				}
					
				else {
					oddPtr.next=new Node(crr.data);
					oddPtr=oddPtr.next;
				}
					
			}
			crr=crr.next;
		}
		ptrEven.next=oddPtr1;
		return res;
	}
	
	public void deleteMiddle() {
		Node ptr1=head;
		Node ptr2=head;
		while(ptr2!=null && ptr2.next!=null) {
			ptr1=ptr1.next;
			ptr2=ptr2.next.next;
		}
		ptr1.data=ptr1.next.data;
		ptr1.next=ptr1.next.next;
	}
	
	public Node getTail() {
		Node crr=head;
		while(crr.next!=null)
			crr=crr.next;
		return crr;
	}
	 

	
}
