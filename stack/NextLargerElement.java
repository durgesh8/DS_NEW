package stack;

import java.util.Stack;

public class NextLargerElement {
	public static void main(String[] args) {
		nextlargeElement(new int[] {11, 13, 21, 3});
	}

	public static void nextlargeElement(int[] arr) {
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			if(st.isEmpty()) {
				st.push(arr[i]);
			}
			else {
				while(!st.isEmpty() && st.peek()<arr[i]) {
					System.out.println(st.pop()+"--------"+arr[i]);
				}
				st.push(arr[i]);
			}
		}
		
		while(!st.isEmpty()) {
			System.out.println(st.pop()+"----- -1");
		}
	}
}
