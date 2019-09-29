package tree;

public class BST2 {

	TreeNode root;

	public BST2() {
		root = null;
	}

	public void insertNodeIteratively(int data) {
		TreeNode node = new TreeNode(data);
		if (root == null)
			root = node;
		else {
			TreeNode crrNode = root;
			while (crrNode != null) {
				TreeNode prev = crrNode;
				if (node.data < root.data) {
					crrNode = crrNode.leftChild;
					if (crrNode == null)
						prev.leftChild = node;
				} else {
					crrNode = crrNode.rightChild;
					if (crrNode == null)
						prev.rightChild = node;
				}
			}
		}
	}

	public void insertNodeRecursively(int data) {
		if (root == null)
			root = new TreeNode(data);
		else {
			insertHelper(root, data);
		}
	}

	private TreeNode insertHelper(TreeNode root, int data) {
		TreeNode node = new TreeNode(data);
		if (root == null)
			return node;
		else {
			if (root.data < data)
				root.setRightChild(insertHelper(root.rightChild, data));
			else
				root.setLeftChild(insertHelper(root.leftChild, data));
		}

		return root;
	}
}
