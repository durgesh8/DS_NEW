package stack;

import java.util.Stack;

public class StockSpanProblem {
public static void main(String[] args) {
	int[] re=span(new int[] {100, 80, 60, 70, 60, 75, 85});
	for(int i=0;i<re.length;i++) {
		System.out.print(re[i]+" ");
	}
}
	
	public static int[] span(int[] arr) {
		Stack<Integer> st=new Stack<>();
		Stack<Integer> st1=new Stack<>();
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(st.isEmpty()) {
				st.push(arr[i]);
				res[i]=1;
			}else {
				int count=1;
				while(st.peek()<arr[i]) {
					st1.push(st.pop());
					count++;
				}
				st1.push(arr[i]);
				res[i]=count;
				while(!st1.isEmpty()) {
					st.push(st1.pop());
				}
			}
				
		}
		return res;
	}
}
