package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TraverseNAryTree {
	
	public static void main(String[] args) {
		TraverseNAryTree t=new TraverseNAryTree();
		NAryTreeNode root=new NAryTreeNode();
		root.data=100;
		NAryTreeNode lev_11 = new NAryTreeNode();   lev_11.data=90;
	    NAryTreeNode lev_12 = new NAryTreeNode();   lev_12.data=50;
	    NAryTreeNode lev_13 = new NAryTreeNode();   lev_13.data=70;
	    NAryTreeNode lev_21 = new NAryTreeNode();   lev_21.data=20;
	    NAryTreeNode lev_22 = new NAryTreeNode();   lev_22.data=30;
	    NAryTreeNode lev_23 = new NAryTreeNode();   lev_23.data=200;
	    NAryTreeNode lev_24 = new NAryTreeNode();   lev_24.data=300;
	    
	    List<NAryTreeNode> temp2 = new ArrayList<NAryTreeNode>();  //Level two first branch
	    temp2.add(lev_21);
	    temp2.add(lev_22);

	    List<NAryTreeNode> temp3 = new ArrayList<NAryTreeNode>();  //level two second branch
	    temp3.add(lev_23);
	    temp3.add(lev_24);
	    
	    lev_11.nAryNodeList.addAll(temp2);
	    lev_12.nAryNodeList.addAll(temp3);

	    List<NAryTreeNode> temp = new ArrayList<NAryTreeNode>();  //level one
	    temp.add(lev_11);
	    temp.add(lev_12);
	    temp.add(lev_13);


	    // Add Temp to root  to form a leaf of the root
	    root.nAryNodeList.addAll(temp);

	    // root=null;
	    //Call the display function.
	    t.display(root);
	}

	static class NAryTreeNode{
		int data;
		List<NAryTreeNode> nAryNodeList=new ArrayList<>();
	}
	
	void display(NAryTreeNode t) {
		Stack<List<NAryTreeNode>> st=new Stack<>();
		Stack<List<NAryTreeNode>> st2=new Stack<>();
		System.out.println(t.data);
		if(t.nAryNodeList!=null)
			st.push(t.nAryNodeList);
		while(!st.isEmpty() || !st2.isEmpty()) {
			while(!st.isEmpty()) {
				List<NAryTreeNode> nodeList=st.pop();
				for(NAryTreeNode node: nodeList) {
					if(node.nAryNodeList!=null) {
						st2.push(node.nAryNodeList);
					}
					System.out.print(node.data+" ");
				}
				System.out.println();
			}
			while(!st2.isEmpty()) {
				List<NAryTreeNode> nodeList=st2.pop();
				for(NAryTreeNode node: nodeList) {
					if(node.nAryNodeList!=null) {
						st.push(node.nAryNodeList);
					}
					System.out.print(node.data+" ");
				}
			
			}
		}
	}
}
