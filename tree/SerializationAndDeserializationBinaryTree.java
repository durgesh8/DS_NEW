package tree;

import java.util.ArrayList;

public class SerializationAndDeserializationBinaryTree {

	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.insertNodeIteratively(8);
		tree.insertNodeIteratively(6);
		tree.insertNodeIteratively(5);
		tree.insertNodeIteratively(10);
		tree.insertNodeRecursively(7);
		tree.insertNodeRecursively(2);
		tree.insertNodeRecursively(3);
		tree.insertNodeRecursively(4);
		tree.insertNodeRecursively(15);
		tree.insertNodeRecursively(20);
		tree.insertNodeRecursively(9);
		ArrayList<Integer> array=new ArrayList<Integer>();
		new SerializationAndDeserializationBinaryTree().serialize(tree.root, array);
		System.out.println(array);
	}
	
	public  void serialize(TreeNode root, ArrayList<Integer> array) {
		
		if(root==null) {
			array.add(-1);
			return;
		}
		array.add(root.data);
		serialize(root.leftChild, array);
		serialize(root.rightChild, array);
	}
}
