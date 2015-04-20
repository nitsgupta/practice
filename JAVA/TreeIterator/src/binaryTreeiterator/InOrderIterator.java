package binaryTreeiterator;

import iterator.iteratorSpecification.BinaryTreeIterator;

public interface InOrderIterator extends BinaryTreeIterator {

	public boolean hasNext();

	public Integer next();
}
