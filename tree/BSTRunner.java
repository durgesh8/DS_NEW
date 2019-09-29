package tree;

public class BSTRunner {

	public static void main(String[] args) {
		BST tree = new BST();

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
		/*
		 * System.out.println("InOrder "); tree.inOrderTraversalRecursively(tree.root);
		 * System.out.println(); tree.inOrderTraversalIteratively(tree.root);
		 * System.out.println("PreOrder ");
		 * tree.PreOrderTraversalRecursively(tree.root);
		 * System.out.println("PostOrder ");
		 * tree.PostOrderTraversalRecursively(tree.root);
		 * System.out.println("\nHeight of tree: "+tree.heightOfBinaryTree(tree.root));
		 * tree.inOrderTraversalRecursively(tree.convertToMirrorTree(tree.root));
		 * tree.convertToMirrorTree2(tree.root); System.out.println("InOrder ");
		 * tree.inOrderTraversalRecursively(tree.root);
		 */
		 
		System.out.println(tree.getCountOfleafNodes(tree.root));
		tree.getCountOfleafNodes2(tree.root);
		System.out.println(tree.count);
		System.out.println(tree.getMinimumElementInBST(tree.root));
		System.out.println(tree.isFullBinaryTree(tree.root));
		System.out.println(tree.maxLevelSumInBinaryTree(tree.root));
		
	}
}
