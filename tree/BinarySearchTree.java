package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class BinarySearchTree {

	TreeNode root;
	static int count = 0;

	public BinarySearchTree() {
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
		TreeNode node = new TreeNode(data);
		if (root == null) {
			root = node;
		} else {
			insertRecursively(data, root);
		}
	}

	private TreeNode insertRecursively(int data, TreeNode root) {
		TreeNode node = new TreeNode(data);
		if (root == null) {
			return node;
		} else {
			if (data <= root.data) {
				root.setLeftChild(insertRecursively(data, root.leftChild));
			} else {
				root.setRightChild(insertRecursively(data, root.rightChild));
			}
			return root;
		}
	}

	public void inOrderTraversalRecursively(TreeNode root) {
		TreeNode current = root;
		if (current == null) {
			return;
		}
		inOrderTraversalRecursively(current.leftChild);
		System.out.print(current.data + " ");
		inOrderTraversalRecursively(current.rightChild);
	}

	public void inOrderTraversalIteratively(TreeNode root) {
		TreeNode current = root;
		Stack<TreeNode> st1 = new Stack<>();
		while (current != null) {
			st1.push(current);
			current = current.leftChild;
		}
		while (!st1.isEmpty()) {
			TreeNode node = st1.pop();
			System.out.print(node.data + " ");
			if (node.rightChild != null) {
				TreeNode crr = node.rightChild;
				while (crr != null) {
					st1.push(crr);
					crr = crr.leftChild;
				}
			}

		}
	}

	public void preOrderRecursively(TreeNode root) {
		TreeNode crr = root;
		if (root == null)
			return;
		System.out.print(crr.data + " ");
		preOrderRecursively(root.leftChild);
		preOrderRecursively(root.rightChild);
	}

	public void preOrderIteratively(TreeNode root) {
		Stack<TreeNode> st1 = new Stack<>();
		TreeNode crr = root;
		st1.push(crr);
		while (crr != null) {
			System.out.print(crr.data + " ");
			if (crr.leftChild != null) {
				st1.push(crr.leftChild);

			}
			crr = crr.leftChild;
		}
		while (!st1.isEmpty()) {
			TreeNode node = st1.pop();
			if (node.rightChild != null) {
				TreeNode childNode = node.rightChild;
				st1.push(childNode);
				while (childNode != null) {
					System.out.print(childNode.data + " ");
					if (childNode.leftChild != null) {
						st1.push(childNode.leftChild);

					}
					childNode = childNode.leftChild;
				}
			}
		}
	}

	public void postOrderRecursively(TreeNode root) {
		TreeNode crr = root;
		if (crr == null)
			return;
		postOrderRecursively(crr.leftChild);

		postOrderRecursively(crr.rightChild);
		System.out.print(crr.data + " ");

	}

	public void postOrderIteratively(TreeNode root) {
		TreeNode crr = root;
		Stack<TreeNode> st1 = new Stack<TreeNode>();
		Stack<TreeNode> st2 = new Stack<TreeNode>();
		st1.push(crr);
		while (!st1.isEmpty()) {
			TreeNode node = st1.pop();
			st2.push(node);
			if (node.leftChild != null)
				st1.push(node.leftChild);
			if (node.rightChild != null)
				st1.push(node.rightChild);
		}
		while (!st2.isEmpty()) {
			System.out.print(st2.pop().data + " ");
		}
	}

	public void levelOrderTraversal(TreeNode root) {
		System.out.print("Level Order Traversal : ");
		Queue<TreeNode> q1 = new LinkedList<>();
		Queue<TreeNode> q2 = new LinkedList<>();
		q1.add(root);
		while (!q1.isEmpty() || !q2.isEmpty()) {
			while (!q1.isEmpty()) {
				TreeNode node = q1.poll();
				System.out.print(node.data + " ");
				if (node.leftChild != null)
					q2.add(node.leftChild);
				if (node.rightChild != null)
					q2.add(node.rightChild);
			}

			while (!q2.isEmpty()) {
				TreeNode node = q2.poll();
				System.out.print(node.data + " ");
				if (node.leftChild != null)
					q1.add(node.leftChild);
				if (node.rightChild != null)
					q1.add(node.rightChild);
			}
		}
	}

	public int heightOfTreeOrMaxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int ldepth = heightOfTreeOrMaxDepth(root.leftChild);
			int rdepth = heightOfTreeOrMaxDepth(root.rightChild);

			if (ldepth > rdepth)
				return ldepth + 1;
			else
				return rdepth + 1;
		}
	}

	public int minElementinBST(TreeNode root) {
		TreeNode crrNode = root;
		TreeNode prevNode = null;
		while (crrNode != null) {
			prevNode = crrNode;
			crrNode = crrNode.leftChild;
		}
		return prevNode.data;
	}

	public int countLeafNodes(TreeNode root) {
		if (root == null)
			return 0;
		if (root.leftChild == null && root.rightChild == null) {
			return 1;
		} else
			return countLeafNodes(root.leftChild) + countLeafNodes(root.rightChild);
	}

	public int maxElementinBST(TreeNode root) {
		TreeNode crrNode = root;
		TreeNode prevNode = null;
		while (crrNode != null) {
			prevNode = crrNode;
			crrNode = crrNode.rightChild;
		}
		return prevNode.data;
	}

	public void convertTOMirror(TreeNode root) {
		if (root == null)
			return;
		else {
			convertTOMirror(root.leftChild);
			convertTOMirror(root.rightChild);
			TreeNode temp = root.leftChild;
			root.leftChild = root.rightChild;
			root.rightChild = temp;
		}
	}

	public int maxLevelSum(TreeNode root) {

		int max = Integer.MIN_VALUE;
		Queue<TreeNode> q1 = new LinkedList<>();
		Queue<TreeNode> q2 = new LinkedList<>();
		q1.add(root);
		while (!q1.isEmpty() || !q2.isEmpty()) {
			int sum = 0;
			while (!q1.isEmpty()) {
				TreeNode node = q1.poll();
				sum = sum + node.data;
				if (node.leftChild != null)
					q2.add(node.leftChild);
				if (node.rightChild != null)
					q2.add(node.rightChild);
			}

			if (sum > max)
				max = sum;
			sum = 0;
			while (!q2.isEmpty()) {
				TreeNode node = q2.poll();
				sum += node.data;
				if (node.leftChild != null)
					q1.add(node.leftChild);
				if (node.rightChild != null)
					q1.add(node.rightChild);
			}
			if (sum > max)
				max = sum;
		}
		return max;
	}

	public boolean isFoldable(TreeNode root) {
		if (root == null)
			return true;
		else {
			TreeNode leftSubTree = root.leftChild;
			convertToMirror(leftSubTree);
			TreeNode rightSubTree = root.rightChild;
			return isSame(leftSubTree, rightSubTree);

		}
	}

	private boolean isSame(TreeNode leftSubTree, TreeNode rightSubTree) {
		if (leftSubTree == null && rightSubTree == null)
			return true;
		return (isSame(leftSubTree.leftChild, rightSubTree.leftChild))
				&& (isSame(leftSubTree.rightChild, rightSubTree.rightChild));
	}

	private void convertToMirror(TreeNode root) {
		if (root == null)
			return;
		convertToMirror(root.leftChild);
		convertToMirror(root.rightChild);
		TreeNode node = root.rightChild;
		root.rightChild = root.leftChild;
		root.leftChild = node;

	}

	public TreeNode cloneBinaryTree(TreeNode root) {
		if (root == null)
			return null;
		TreeNode newNode = new TreeNode(root.data);
		newNode.leftChild = cloneBinaryTree(root.leftChild);
		newNode.rightChild = cloneBinaryTree(root.rightChild);
		return newNode;
	}

	public void distanceFromRoot(TreeNode root, int k) {
		if (root == null)
			return;
		else
			distanceCount(root, k, 0);
	}

	public void distanceCount(TreeNode root, int k, int count) {
		if (root == null)
			return;
		if (count == k)
			System.out.print(root.data + " ");
		distanceCount(root.leftChild, k, count + 1);
		distanceCount(root.rightChild, k, count + 1);
	}

	public void diagonalSumInTree(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		int sum = 0;
		while (!queue.isEmpty()) {
			TreeNode pointer = queue.poll();
			if (pointer == null) {
				queue.add(null);
				pointer = queue.poll();
				System.out.print(sum + " ");
				sum = 0;
				if (pointer == null)
					break;
			}
			while (pointer != null) {
				sum = sum + pointer.data;
				if (pointer.leftChild != null)
					queue.add(pointer.leftChild);
				pointer = pointer.rightChild;
			}
		}

	}

	public int diameterOfBinaryTree(TreeNode root) {
		// diameter is number of nodes on largest path of binary tree
		if (root == null) {
			return 0;
		} else {
			int ldiam = diameterOfBinaryTree(root.leftChild);
			int rdiam = diameterOfBinaryTree(root.rightChild);
			if (ldiam > rdiam) {
				return 1 + ldiam;

			} else
				return 1 + rdiam;
		}
	}

	public boolean isFullBinaryTree(TreeNode root) {
		if (root == null)
			return true;
		if ((root.leftChild != null && root.rightChild == null) || (root.leftChild == null && root.rightChild != null))
			return false;
		return isFullBinaryTree(root.leftChild) && isFullBinaryTree(root.rightChild);
	}

	public int countNoOfSubTreessWithGivenSum(TreeNode root, int sum) {
		if (root == null)
			return 0;
		else
			countNoOfSubTreessWithGivenSumUtil(root, sum, 0);
		return count;
	}

	private int countNoOfSubTreessWithGivenSumUtil(TreeNode root, int sum, int ct) {
		if (root == null)
			return 0;
		int sumAtroot = root.data + countNoOfSubTreessWithGivenSumUtil(root.leftChild, sum, ct)
				+ countNoOfSubTreessWithGivenSumUtil(root.rightChild, sum, count);
		if (sumAtroot == sum)
			count++;
		return sumAtroot;

	}

	public int treePathSums(TreeNode root) {
		return treePathSumsUtil(root, 0);

	}

	private int treePathSumsUtil(TreeNode root, int val) {
		if (root == null)
			return 0;
		val = (val * 10 + root.data);
		if (root.rightChild == null && root.leftChild == null)
			return val;
		return treePathSumsUtil(root.leftChild, val) + treePathSumsUtil(root.rightChild, val);
	}

	public void printRightView(TreeNode root) {
		Queue<TreeNode> q1 = new LinkedList<>();
		Queue<TreeNode> q2 = new LinkedList<>();
		q1.add(root);
		while (!q1.isEmpty() || !q2.isEmpty()) {
			while (!q1.isEmpty()) {
				if (q1.size() == 1) {
					System.out.print(q1.peek().data + "->");
				}
				TreeNode node = q1.poll();
				if (node.leftChild != null)
					q2.add(node.leftChild);
				if (node.rightChild != null)
					q2.add(node.rightChild);

			}
			while (!q2.isEmpty()) {
				if (q2.size() == 1) {
					System.out.print(q2.peek().data + "->");
				}
				TreeNode node = q2.poll();
				if (node.leftChild != null)
					q1.add(node.leftChild);
				if (node.rightChild != null)
					q1.add(node.rightChild);

			}
		}

	}

	public TreeNode getLowestCommonAncestorInBST(TreeNode root, TreeNode node1, TreeNode node2) {
		if ((root.data < node1.data) && (root.data < node2.data))
			return getLowestCommonAncestorInBST(root.rightChild, node1, node2);
		else if ((root.data > node1.data) && (root.data > node2.data))
			return getLowestCommonAncestorInBST(root.leftChild, node1, node2);
		else
			return root;
	}

	public TreeNode getLowestCommonAncestorInBinaryTree(TreeNode root, TreeNode node1, TreeNode node2) {
		if (root == null)
			return null;
		if (root.data == node1.data || root.data == node2.data)
			return root;
		TreeNode left = getLowestCommonAncestorInBinaryTree(root.leftChild, node1, node2);
		TreeNode right = getLowestCommonAncestorInBinaryTree(root.rightChild, node1, node2);
		if (left != null && right != null)
			return root;
		if (left == null && right == null)
			return null;
		return left != null ? left : right;
	}

	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		int leftHeight = heightOfNode(root.leftChild);
		int righHeight = heightOfNode(root.rightChild);
		if (Math.abs(leftHeight - righHeight) <= 1 && isBalanced(root.leftChild) && isBalanced(root.rightChild))
			return true;
		return false;
	}

	public int heightOfNode(TreeNode root) {
		if (root == null)
			return 0;
		int leftheight = heightOfNode(root.leftChild);
		int rightheight = heightOfNode(root.rightChild);
		if (leftheight > rightheight)
			return 1 + leftheight;
		else
			return 1 + rightheight;
	}

	public int findMaxSum(TreeNode root) {
		Res res = new Res();
		res.val = Integer.MIN_VALUE;
		findMaxUtil(root, res);
		return res.val;
	}

	private int findMaxUtil(TreeNode node, Res res) {
		if (node == null)
			return 0;
		int l = findMaxUtil(node.leftChild, res);
		int r = findMaxUtil(node.rightChild, res);
		int max_single = Math.max(Math.max(l, r) + node.data, node.data);
		int max_top = Math.max(max_single, l + r + node.data);
		res.val = Math.max(res.val, max_top);
		return max_single;

	}

	public boolean isMirror(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		// If only one is empty
		if (root1 == null || root2 == null)
			return true;
		/*
		 * Both non-empty, compare them recursively Note that in recursive calls, we
		 * pass left of one tree and right of other tree
		 */
		return root1.data == root2.data && isMirror(root1.leftChild, root2.rightChild)
				&& isMirror(root1.rightChild, root2.leftChild);
	}

	public void printBSTKeysInRange(int x, int y, TreeNode root) {
		TreeNode current = root;
		if (current == null) {
			return;
		}
		printBSTKeysInRange(x, y, current.leftChild);
		if (current.data >= x && current.data <= y)
			System.out.print(current.data + " ");
		printBSTKeysInRange(x, y, current.rightChild);

	}

	// use InOrderTraversal and stack
	public void printAllRootToLeafPaths(TreeNode root) {
		Stack<Integer> st = new Stack<>();
		printAllRootToLeafPathsUtil(root, st);
	}

	public void printAllRootToLeafPathsUtil(TreeNode root, Stack<Integer> st) {
             if(root==null)
            	 return;
             st.push(root.data);
             printAllRootToLeafPathsUtil(root.leftChild, st);
             if(root.leftChild==null && root.rightChild==null) {
            	 String values = Arrays.toString(st.toArray());
                 System.out.println(values);
             }
            	 
             printAllRootToLeafPathsUtil(root.rightChild, st);
             st.pop();
             
	}
	
	public void reverseLevelOrderTraversal(TreeNode root) {
		TreeNode crr=root;
		Stack<TreeNode> st=new Stack<TreeNode>();
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(crr);
		while(!queue.isEmpty()) {
			TreeNode node=queue.peek();
			queue.remove();
			st.add(node);
			if(node.rightChild!=null) {
				queue.add(node.rightChild);
			}
			if(node.leftChild!=null) {
				queue.add(node.leftChild);
			}
		}
		while(!st.isEmpty()) {
			System.out.print(st.pop().data+" ");
		}
	}
	
	public boolean isBST(TreeNode root) {
		return isValidBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private boolean isValidBSTUtil(TreeNode node, int min, int max) {
		if(node==null)
			return true;
		if(node.data<min || node.data>max)
			return false;
		 return ((isValidBSTUtil(node.leftChild,min,node.data-1)) && (isValidBSTUtil(node.rightChild,node.data+1,max)));
	}
	
	public  void printSibling(TreeNode root) {
		/*
		 * A child node is said to have a sibling if the other node has the same parent
		 * as the child node. That means the nodes are siblings if they have same
		 * parent.
		 */
		
		if(root==null)
			return;
		if(root.leftChild!=null && root.rightChild==null)
			System.out.print(root.leftChild.data+" ");
		if(root.rightChild!=null && root.leftChild==null)
			System.out.print(root.rightChild.data+" ");
		printSibling(root.leftChild);
		printSibling(root.rightChild);
	}
	
	public void boundaryTraversal(TreeNode root) {
		leftBoundary(root);
		leafNodeBoundary(root);
		rightBoundary(root.rightChild);
		
	}
		
	private void leftBoundary(TreeNode node) {
		if(node!=null) {
			if(node.leftChild!=null) {
				System.out.print(node.data+" ");
				leftBoundary(node.leftChild);
			}else if(node.rightChild!=null){
				System.out.print(node.data+" ");
				leftBoundary(node.rightChild);
				
			}
		}
	}
	
	private void rightBoundary(TreeNode node) {
		if(node!=null) {
			if(node.rightChild!=null) {
				System.out.print(node.data+" ");
				rightBoundary(node.rightChild);
			}else if(node.leftChild!=null){
				System.out.print(node.data+" ");
				rightBoundary(node.leftChild);
			}
		}
	}
	
	private void leafNodeBoundary(TreeNode node) {
		if(node==null)
			return;
		if(node.leftChild==null && node.rightChild==null)
			System.out.print(node.data+" ");
		leafNodeBoundary(node.leftChild);
		leafNodeBoundary(node.rightChild);
	}
	
	public void printNodesAtKdistance(TreeNode root, TreeNode node, int k) {
		printdownNode(node, k);
		int dis=getdistance(root,node,0);
		System.out.println("Distance from root: "+dis);
	}
	
	private int getdistance(TreeNode root, TreeNode node,int x) {
		if(root==null)
			return -1;
		int distance=-1;
		if((root==node)||(distance=getdistance(root.leftChild, node, x))>=0
				||(distance=getdistance(root.rightChild, node, x))>=0)
			return distance+1;
		return distance;
		
		
	}

	private void printdownNode(TreeNode node,int k) {
		if(node==null || k<0)
			return;
		if(k==0)
			System.out.print(node.data+" ");
		printdownNode(node.leftChild, k-1);
		printdownNode(node.rightChild, k-1);
		
	}
	
	public List<Integer> printNodesAtKdistanceSolution2(TreeNode root, TreeNode startNode, int targetDistance) {
		/*
	    Create the node to parent map and populate it
	  */
		Map<TreeNode, TreeNode> nodeToParentMap = new HashMap<>();
		populateNodeToParentMap(nodeToParentMap, root, null);
		
		/*
	    Create the queue that we will use for the breadth first search.
	    Add the start node to the queue
	  */
		
		 Queue<TreeNode> queue = new LinkedList();
		  queue.add(startNode);
		  
		  /*
		    The is an undirected graph now that we can go to and from nodes.
		    Before we could only go down the tree.
		    Therefore, we need a hashtable to keep track of nodes we have
		    visited so that we do not go back and revisit what has already
		    been processed and cause an infinite cycle
		  */
		  
		  Set<TreeNode> seen = new HashSet<>();
		  seen.add(startNode);
		  
		  /*
		    When our search starts, we are standing at layer 0
		  */
		  int currentLayer = 0;
		  
		  while (!queue.isEmpty()) {

			    /*
			      Is this the layer we want? If so, extract and return it
			    */
			    if (currentLayer == targetDistance) {
			      return extractLayerFromQueue(queue);
			    }

			    /*
			      How large is this layer? Let's process all node in the layer.
			      This is Breadth First Search.
			    */
			    int layerSize = queue.size();
			    for (int i = 0; i < layerSize; i++) {

			      /*
			        Pull a node from the search queue, we are going to basically
			        use our current layer to populate the next layer of nodes
			        that we need to search in the next while loop iteration
			      */
			      TreeNode currentNode = queue.poll();

			      /*
			        Has left been touched before?
			        No?
			          1.) Add it to the seen hashtable
			          2.) Add it to the search queue
			      */
			      if (currentNode.leftChild != null && !seen.contains(currentNode.leftChild)) {
			          seen.add(currentNode.leftChild);
			          queue.offer(currentNode.leftChild);
			      }

			      /*
			        Has right been touched before?
			        No?
			          1.) Add it to the seen hashtable
			          2.) Add it to the search queue
			      */
			      if (currentNode.rightChild != null && !seen.contains(currentNode.rightChild)) {
			        seen.add(currentNode.rightChild);
			        queue.offer(currentNode.rightChild);
			      }

			      /*
			        Has this node's parent been touched before?
			        No?
			          1.) Add it to the seen hashtable
			          2.) Add it to the search queue
			      */
			      TreeNode parentOfCurrentNode = nodeToParentMap.get(currentNode);
			      if (parentOfCurrentNode != null && !seen.contains(parentOfCurrentNode)) {
			        seen.add(parentOfCurrentNode);
			        queue.offer(parentOfCurrentNode);
			      }

			    }

			    /*
			      Advance the layer for the next iteration
			    */
			    currentLayer++;

			  }

			  return new ArrayList<Integer>();
			}
		  

	private void populateNodeToParentMap(Map<TreeNode, TreeNode> nodeToParentMap, TreeNode root, TreeNode parent) {
		if(root==null)
			return;
		nodeToParentMap.put(root, parent);
		populateNodeToParentMap(nodeToParentMap, root.leftChild, root);
		populateNodeToParentMap(nodeToParentMap, root.rightChild, root);
		
	}
	
	private List<Integer> extractLayerFromQueue(Queue<TreeNode> queue) {
		  List<Integer> extractedList = new ArrayList<>();
		  for (TreeNode node: queue) {
		    extractedList.add(node.data);
		  }
		  return extractedList;
		}
	
	public void printTreeVertically(TreeNode root) {
		Map<Integer, List<TreeNode>> map=new TreeMap<>();
		verticalOrder(root, 0, map);
		map.forEach((k,v)->{
			v.forEach(a->System.out.print(a.data+" "));
			System.out.println();
		});
		
	}
	private void verticalOrder(TreeNode node,int dist,Map<Integer,List<TreeNode>> map) {
		if(node==null)
			return;
		List<TreeNode> nodeList=map.get(dist);
		if(nodeList==null) {
			nodeList=new ArrayList<>();
			nodeList.add(node);
		}
		else {
			nodeList.add(node);
		}
		
		map.put(dist, nodeList);
		verticalOrder(node.leftChild, dist-1, map);
		verticalOrder(node.rightChild,dist+1 , map);
	}
	
	public void printTopViewOfTree(TreeNode root) {
		Map<Integer, List<TreeNode>> map=new TreeMap<>();
		verticalOrder(root, 0, map);
		map.forEach((k,v)->{
			System.out.print(v.stream().findFirst().get().data+" ");
		});
	}

	
}

