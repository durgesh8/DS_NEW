package tree;

public class MaxHeap {
	private int[] heap;
	private int size;
	private int maxsize;

	public MaxHeap(int maxsize) {
		this.maxsize = maxsize;
		this.size = 0;
		heap = new int[this.maxsize + 1];
		heap[0] = Integer.MAX_VALUE;
	}

	private int parent(int pos) {
		return pos / 2;
	}

	private int leftChild(int pos) {
		return pos * 2;
	}

	private int rightChild(int pos) {
		return (pos * 2) + 1;
	}

	private boolean isLeaf(int pos) {
		if (pos >= size / 2 && pos <= size)
			return true;
		else
			return false;
	}

	private void swap(int fpos, int spos) {
		int tmp;
		tmp = heap[fpos];
		heap[fpos] = heap[spos];
		heap[spos] = tmp;
	}

	private void maxHeapify(int pos) {
		if (isLeaf(pos))
			return;
		if (heap[pos] < heap[leftChild(pos)] || heap[pos] < heap[rightChild(pos)]) {
			if (heap[leftChild(pos)] > heap[rightChild(pos)]) {
				swap(pos, leftChild(pos));
				maxHeapify(leftChild(pos));
			} else {
				swap(pos, rightChild(pos));
				maxHeapify(rightChild(pos));
			}
		}
	}

	public void insert(int element) {
		heap[++size] = element;
		int current = size;
		while (heap[current] > heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	public void print() {
		for (int i = 1; i <= size / 2; i++) {
			System.out.print(
					" PARENT : " + heap[i] + " LEFT CHILD : " + heap[2 * i] + " RIGHT CHILD :" + heap[2 * i + 1]);
			System.out.println();
		}
	}

	public int extractMax() {
		int popped = heap[1];
		heap[1] = heap[size--];
		maxHeapify(1);
		return popped;
	}
	public static void main(String[] arg) 
    { 
        System.out.println("The Max Heap is "); 
        MaxHeap maxHeap = new MaxHeap(15); 
        maxHeap.insert(5); 
        maxHeap.insert(3); 
        maxHeap.insert(17); 
        maxHeap.insert(10); 
        maxHeap.insert(84); 
        maxHeap.insert(19); 
        maxHeap.insert(6); 
        maxHeap.insert(22); 
        maxHeap.insert(9); 
  
        maxHeap.print(); 
        System.out.println("The max val is " + maxHeap.extractMax()); 
        System.out.println("The max val is " + maxHeap.extractMax()); 
    } 
}
