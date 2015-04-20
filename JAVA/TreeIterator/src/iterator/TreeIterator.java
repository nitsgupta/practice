package iterator;

import java.util.Iterator;

public interface TreeIterator extends Iterator<Integer> {

	public boolean hasNext();

	public Integer next();
}
