package iteratorImplemenation.BinaryTree;

import java.util.NoSuchElementException;
import java.util.Stack;

import node.TreeNode;
import binaryTreeiterator.PreOrderIterator;

public class BinaryTreePreOrderIteratorImplementation implements PreOrderIterator {
	Stack<TreeNode> stack = new Stack<TreeNode>();

	/**
	 * Returns the next integer a in the post-order traversal of the given
	 * binary tree. For example, given a binary tree below, 4 example, given a binary tree below,
	   *       4
	   *      / \
	   *     2   6
	   *    / \ / \
	   *   1  3 5  7
	   * the outputs will be 1, 3, 2, 5, 7, 6, 4.
	 */

	public BinaryTreePreOrderIteratorImplementation(TreeNode root) {
		super();
		if (root == null)
			throw new RuntimeException(
					"Can't create iterator for null Binary Tree");

		stack.push(root);
	}

	@Override
	public boolean hasNext() {
		if (stack.isEmpty())
			return false;
		return true;
	}

	@Override
	public Integer next() {
		if (!hasNext())
			throw new NoSuchElementException("All element has visited!");

		TreeNode node = stack.pop();
		if (node.getLeft() != null)
			stack.push(node.getLeft());
		if (node.getRight() != null)
			stack.push(node.getRight());
		return node.getData();

	}

}
