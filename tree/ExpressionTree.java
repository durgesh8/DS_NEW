package tree;

import java.util.Stack;

public class ExpressionTree {
	
	public static void main(String[] args) {
		 ExpressionTree et = new ExpressionTree(); 
	        String postfix = "ab+ef*g*-"; 
	        char[] charArray = postfix.toCharArray(); 
	        Node root = et.constructTree(charArray); 
	        System.out.println("infix expression is"); 
	        et.inorder(root); 
	}

	static class Node {
		Node right;
		Node left;
		char data;

		public Node(char ch) {
			this.data = ch;
			left = right = null;
		}
	}

	boolean isOperator(char c) {
		if (c == '+' || c == '-' || c == '/' || c == '^'|| c=='*')
			return true;
		return false;
	}
	
	void inorder(Node t) { 
        if (t != null) { 
            inorder(t.left); 
            System.out.print(t.data + " "); 
            inorder(t.right); 
        } 
    } 
	
	Node constructTree(char[] ch) {
		Stack<Node> st = new Stack<>();
		Node t, t1, t2;
		for(int i=0;i<ch.length;i++) {
			if(!isOperator(ch[i])) {
				t=new Node(ch[i]);
				st.push(t);
			}else {
				t=new Node(ch[i]);
				t1=st.pop();
				t2=st.pop();
				t.right=t1;
				t.left=t2;
				st.push(t);
			}
		}
		
		t=st.peek();
		return st.pop();
	}

	
}
