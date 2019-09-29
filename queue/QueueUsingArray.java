package queue;

public class QueueUsingArray {
	
	public static void main(String[] args) {
		QueueUsingArray queue=new QueueUsingArray();
		queue.dequeue();
		queue.enqueue(3);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.dequeue();
		queue.dequeue();
		
	}

	int[] arr;
	int size = 10;
	int top = -1;

	public QueueUsingArray() {
		arr = new int[10];
	}
	
	public void enqueue(int x) {
		if(top==size)
			System.out.println("Queue is full");
		else {
			System.out.println("Element Enqueued: "+x);
			arr[++top]=x;
		}
	}
	
	public int dequeue() {
		if(top==-1) {
			System.out.println("Queue is Empty");
			return -1;
		}
			
		else {
			System.out.println("Element dequeued: "+arr[0]);
			int val=arr[0];
			for(int i=0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=0;
			return val;
		}
	}
	
	
}
