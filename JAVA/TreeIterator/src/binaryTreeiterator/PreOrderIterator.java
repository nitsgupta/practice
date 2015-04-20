package binaryTreeiterator;

import iterator.iteratorSpecification.BinaryTreeIterator;

public interface PreOrderIterator extends BinaryTreeIterator {

	public boolean hasNext();

	public Integer next();
}