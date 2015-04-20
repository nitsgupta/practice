package iteratorImplemenation.BinaryTree;

import java.util.NoSuchElementException;
import java.util.Stack;

import node.TreeNode;
import binaryTreeiterator.PostOrderIterator;

public class BinaryTreePostOrderIteratorImplementation implements PostOrderIterator {
	Stack<TreeNode> stack = new Stack<TreeNode>();

	/**
	 * Returns the next integer a in the post-order traversal of the given
	 * binary tree. For example, given a binary tree below,  example, given a binary tree below,
	   *       4
	   *      / \
	   *     2   6
	   *    / \ / \
	   *   1  3 5  7
	   *    the outputs will be 1, 3, 2, 5, 7, 6, 4.
	 */

	@Override
	public boolean hasNext() {
		if (stack.isEmpty())
			return false;
		return true;
	}

	public BinaryTreePostOrderIteratorImplementation(TreeNode root) {
		super();
		if (root == null)
			throw new RuntimeException(
					"Can't create iterator for null Binary Tree");
		insertLeaf(root);

	}

	private void insertLeaf(TreeNode root) {
		while (root != null) {
			this.stack.push(root);
			root = (root.getLeft() != null) ? root.getLeft() : root.getRight();
		}
	}

	@Override
	public Integer next() {
		if (!hasNext())
			throw new NoSuchElementException("All element has visited!");
		TreeNode node = stack.pop();
		TreeNode top = null;

		if (!stack.isEmpty()) {
			top = stack.peek();

			if (top.getLeft().equals(node))
				insertLeaf(top.getRight());
		}
		return node.getData();
	}

}
