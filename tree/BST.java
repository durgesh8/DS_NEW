package tree;

public class BST {

	TreeNode root;
	public BST() {
		this.root = null;
	}
	
	public void insertNodeIteratively(int data) {
		TreeNode node = new TreeNode(data);
		if (root == null) {
			root = node;
			return;
		} else {
			TreeNode currentNode = root;
			while (currentNode != null) {
				TreeNode prevNode = currentNode;
				if (node.data <= currentNode.data) {
					currentNode = currentNode.leftChild;
					if (currentNode == null)
						prevNode.leftChild = node;

				} else {
					currentNode = currentNode.rightChild;
					if (currentNode == null)
						prevNode.rightChild = node;
				}
			}
		}
	}
	
	public void insertNodeRecursively(int data) {
		
		TreeNode node=new TreeNode(data);
		if(root==null)
			root=node;
		else {
			insertRecursiveFunction(root,data);
		}
	}

	private TreeNode insertRecursiveFunction(TreeNode root2, int data) {
		TreeNode node=new TreeNode(data);
		if(root2==null)
			return node;
		else if(node.data>root.data) {
			root.setRightChild(insertRecursiveFunction(root2.rightChild, data));
		}
		else {
			root.setLeftChild(insertRecursiveFunction(root2.leftChild, data));
		}
		return root;
		
	}
	
	public int heightOfTreeOrMaxDepth(TreeNode root) {
		if(root==null)
			return 0;
		int ldepth=heightOfTreeOrMaxDepth(root.leftChild);
		int rdepth=heightOfTreeOrMaxDepth(root.rightChild);
		if(ldepth>rdepth)
			return ldepth+1;
		else
			return rdepth+1;
	}
	
	public int  getLeafNodeCount(TreeNode root) {
		if(root==null)
			return 0;
		if(root.rightChild==null && root.leftChild==null)
			return 1;
		else return getLeafNodeCount(root.leftChild)+getLeafNodeCount(root.rightChild);
		}
	
	public void convertToMirror(TreeNode root) {
		if(root==null)
			return;
		convertToMirror(root.leftChild);
		convertToMirror(root.rightChild);
		TreeNode node=root.rightChild;
		root.setRightChild(root.leftChild);
		root.setLeftChild(node);
		
	}
	
	public TreeNode cloneTree(TreeNode root) {
		if(root==null)
			return null;
		TreeNode node=new TreeNode(root.data);
		node.leftChild=cloneTree(root.leftChild);
		node.rightChild=cloneTree(root.rightChild);
				return node;
	}
	

	
}
