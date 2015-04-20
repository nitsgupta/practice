package iteratorImplemenation.BinaryTree;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

import node.TreeNode;
import binaryTreeiterator.LevelOrderIterator;

public class BinaryTreeLevelOrderIteratorImplementation implements LevelOrderIterator {
	Queue<TreeNode> queue = new LinkedList<TreeNode>();
	
	/** Returns the next integer a in the post-order traversal of the given binary tree.
	   * For example, given a binary tree below,
	   *       4
	   *      / \
	   *     2   6
	   *    / \ / \
	   *   1  3 5  7
	   * the outputs will be 4, 2, 6, 1,3,5,7. 
	   */ 
	
	
	
	@Override
	public boolean hasNext() {
		if (queue.isEmpty())
			return false;
		return true;
	}

	public BinaryTreeLevelOrderIteratorImplementation(TreeNode root) {
		super();
		queue.add(root);
		// TODO Auto-generated constructor stub
	}

	private void insertChildren(TreeNode root){
		if (root.getLeft() != null)
			queue.add(root.getLeft());
		if (root.getRight() != null)
			queue.add(root.getRight());
	}
	@Override
	public Integer next() {
		if (!hasNext())
			throw new NoSuchElementException("All element has visited!");
		TreeNode node = queue.remove(); 
		insertChildren(node);
		return node.getData();
		
	}

}
