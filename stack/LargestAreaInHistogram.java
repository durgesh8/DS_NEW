package stack;

import java.util.Stack;

public class LargestAreaInHistogram {

	public static void main(String[] args) {
		System.out.println(getMaxArea(new int[] {1,2,3,4,5,3,3,2}));
	}
	
	public static int getMaxArea(int[] hist) {
		int maxArea=Integer.MIN_VALUE;
		Stack<Integer> st=new Stack<>();
		
		for(int i=0;i<hist.length;i++) {
			if(st.isEmpty() || hist[st.peek()]<=hist[i]) {
				st.push(i);
			}
			else {
				while(!st.isEmpty()&& hist[st.peek()]>hist[i]) {
					int barHeight=hist[st.peek()];
					while(!st.isEmpty() && hist[st.peek()]==barHeight) {
						st.pop();	
					}
					int area=barHeight*(i-(st.isEmpty()?0:st.peek()+1));
					if(area>maxArea)
						maxArea=area;
				}
				
				st.push(i);
			}
		}
		
		while(!st.isEmpty()) {
			int pos=st.pop();
			int height=hist[pos];
			int area=height*(hist.length-pos);
			if(area>maxArea)
				maxArea=area;
		}
		return maxArea;
	}
}
