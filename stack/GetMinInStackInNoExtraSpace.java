package stack;

import java.util.Stack;

public class GetMinInStackInNoExtraSpace {
	
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
		GetMinInStackInNoExtraSpace s=new GetMinInStackInNoExtraSpace(st);
		s.push(3); 
        s.push(5); 
        s.getMinElement(); 
        s.push(2); 
        s.push(1); 
        s.getMinElement(); 
        s.pop(); 
        s.getMinElement(); 
        s.pop(); 
		
	}

	Stack<Integer> stack;
	Integer minElement;
	
	public GetMinInStackInNoExtraSpace(Stack<Integer> st) {
           this.stack=st;
	}
	
	public void getMinElement() {
		if(stack.isEmpty()) {
			System.out.println("Stack is Empty");
		}else {
			System.out.println("Min element is : "+minElement );
		}
	}
	
	public void push(int x) {
		if(stack.isEmpty()) {
			stack.push(x);
			minElement=x;
		}else if(stack.peek()<=x) {
			stack.push(x);
		}else {
			minElement=x;
			stack.push((2*x)-1);
		}
	}
	
	public void pop() {
		if(stack.isEmpty())
			System.out.println("Stack is Empty");
		else if(stack.peek()<minElement) {
			System.out.println("elemnt popped is "+minElement);
			minElement=(2*minElement)-stack.pop();
		}else {
			System.out.println("element popped is "+stack.pop());
		}
	}
}
