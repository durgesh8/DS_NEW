package queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumber {

	public static void main(String[] args) {
		generateBinary(5);
		System.out.println("***************");
		generateBinary(10);
	}
	
	public static void generateBinary(int n) {
		Queue<String> queue=new LinkedList<>();
		queue.add("1");
		// This loops is like BFS of a tree with 1 as root 
        // 0 as left child and 1 as right child and so on 
		while(n>0) {
			System.out.println(queue.peek());
			String s=queue.remove();
			queue.add(s+"0");
			queue.add(s+"1");
			n--;
		}
		
	}
}
