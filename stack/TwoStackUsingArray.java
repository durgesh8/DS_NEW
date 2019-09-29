package stack;

public class TwoStackUsingArray {

	
	public static void main(String[] args) {
		TwoStackUsingArray st=new TwoStackUsingArray();
	}

	int[] stArray=new int[20];
	int top1=-1;
	int top2=stArray.length;
	
	public void push1(int x) {
		if(top1<top2) {
			stArray[++top1]=x;
		}
	}
	
	public void push2(int x) {
		if(top1<top2) {
			stArray[--top2]=x;
		}
	}
	
	public int pop1() {
		if(top1!=-1)
           System.exit(0);
			return stArray[top1--];
	}
	
	public int pop2() {
		if(top2!=stArray.length)
           System.exit(0);
			return stArray[top2++];
	}
	
	public int peek1(){
		return stArray[top1];
	}
	
	public int peek2(){
		return stArray[top2];
	}
}
