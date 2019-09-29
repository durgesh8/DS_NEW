package heap;

public class MaxHeap {

	private int[] heap;
	private int size;
	private int maxSize;
	
	public MaxHeap(int maxSize) {
          this.maxSize=maxSize;
          this.size=0;
          heap=new int[maxSize+1];
          heap[0]=Integer.MAX_VALUE;
	}
	
	private int parent(int pos) {
		return pos/2;
	}
	
	private int leftChild(int pos) {
		return pos*2;
	}
	
	private int rightChild(int pos) {
		return (pos*2)+1;
	}
}
