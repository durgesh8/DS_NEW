package tree;

public class BinarySearchTreeRunner {

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
		
		BinarySearchTree tree2=new BinarySearchTree();
		tree2.insertNodeIteratively(10);
		tree2.insertNodeIteratively(7);
		tree2.insertNodeIteratively(9);
		tree2.insertNodeIteratively(15);
		tree2.insertNodeRecursively(11);
		/*
		 * System.out.print("Inorder Recursive : ");
		 * tree.inOrderTraversalRecursively(tree.root); System.out.println();
		 * System.out.print("Inorder Iterative : ");
		 * tree.inOrderTraversalIteratively(tree.root); System.out.println();
		 * System.out.print("PreOrder Recursive : ");
		 * tree.preOrderRecursively(tree.root); System.out.println();
		 * System.out.print("PreOrder Iterative : ");
		 * tree.preOrderIteratively(tree.root); System.out.println();
		 * System.out.print("PostOrder Recursive : ");
		 * tree.postOrderRecursively(tree.root); System.out.println();
		 * System.out.print("PostOrder Iterative : ");
		 * tree.postOrderIteratively(tree.root); System.out.println();
		 * */
		/*
		 * tree.levelOrderTraversal(tree.root);
		 * 
		 * System.out.println(tree.heightOfTreeOrMaxDepth(tree.root));
		 * System.out.println(tree.minElementinBST(tree.root));
		 * System.out.println(tree.maxElementinBST(tree.root));
		 * System.out.println(tree.countLeafNodes(tree.root));
		 * tree.convertTOMirror(tree.root); tree.inOrderTraversalRecursively(tree.root);
		 * System.out.println(); System.out.println(tree.maxLevelSum(tree.root));
		 */
		
		//System.out.println(tree2.isFoldable(tree2.root));
		/*
		 * TreeNode clonedTree=tree.cloneBinaryTree(tree.root);
		 * tree.inOrderTraversalIteratively(tree.root); System.out.println();
		 * tree.inOrderTraversalIteratively(clonedTree); System.out.println();
		 */
		/*
		 * System.out.println(); tree.distanceFromRoot(tree.root, 2);
		 * System.out.println(); tree.diagonalSumInTree(tree.root);
		 * System.out.println(""); System.out.println("Height of binary tree  "+
		 * tree.diameterOfBinaryTree(tree.root)); BinarySearchTree tree3=new
		 * BinarySearchTree(); tree3.insertNodeIteratively(8);
		 * tree3.insertNodeIteratively(6); tree3.insertNodeIteratively(4);
		 * tree3.insertNodeIteratively(7); tree3.insertNodeRecursively(12);
		 * tree3.insertNodeRecursively(11); tree3.insertNodeRecursively(17);
		 * System.out.println(tree3.isFullBinaryTree(tree3.root));
		 * System.out.println(tree3.countNoOfSubTreessWithGivenSum(tree3.root, 17));
		 */
		/*
		 * System.out.println(tree.treePathSums(tree.root));
		 * tree.printRightView(tree.root); System.out.println();
		 * System.out.println(tree.getLowestCommonAncestorInBST(tree.root, new
		 * TreeNode(3), new TreeNode(7)).data);
		 * System.out.println(tree.getLowestCommonAncestorInBST(tree.root, new
		 * TreeNode(3), new TreeNode(5)).data);
		 * System.out.println(tree.getLowestCommonAncestorInBinaryTree(tree.root, new
		 * TreeNode(3), new TreeNode(5)).data);
		 * System.out.println(tree.isBalanced(tree.root)); tree.printBSTKeysInRange(10,
		 * 20, tree.root); System.out.println();
		 * tree.printAllRootToLeafPaths(tree.root);
		 * tree.reverseLevelOrderTraversal(tree.root); System.out.println("PreOrder");
		 * tree.preOrderRecursively(tree.root); System.out.println();
		 * System.out.println(tree.isBST(tree.root)); tree.printSibling(tree.root);
		 * System.out.println(); tree.boundaryTraversal(tree.root);
		 * System.out.println();
		 */
		/*
		 * tree.printNodesAtKdistance(tree.root,
		 * tree.root.leftChild.leftChild.leftChild.rightChild, 2);
		 * System.out.println("Vertical Tree"); tree.printTreeVertically(tree.root);
		 * System.out.println("Top View"); tree.printTopViewOfTree(tree.root);
		 */
		tree.levelOrderTraversal(tree.root);
		tree.getLowestCommonAncestorInBST(tree.root, new TreeNode(3), new TreeNode(2));
		
	}
}
