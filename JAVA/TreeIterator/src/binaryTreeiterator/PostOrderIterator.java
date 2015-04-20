package binaryTreeiterator;

import iterator.iteratorSpecification.BinaryTreeIterator;

public interface PostOrderIterator extends BinaryTreeIterator {

	public boolean hasNext();

	public Integer next();
}
