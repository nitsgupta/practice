package binaryTreeiterator;

import iterator.iteratorSpecification.BinaryTreeIterator;

public interface LevelOrderIterator extends BinaryTreeIterator {

	public boolean hasNext();

	public Integer next();
}
