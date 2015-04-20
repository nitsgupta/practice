/**
 * 
 */
package heap;

/**
 * @author guptanitin
 *
 */
public interface IHeap {

	// creation
	public void init(int arg0);
	
	public void buildHeap();

	public void heapify();

	// operations
	public void insert(HeapNode arg0);

	public HeapNode leftChild(int arg0);

	public HeapNode rightChild(int arg0);

	public HeapNode parent(int  arg0);

	public boolean isLeaf(int arg0);

	public void remove();

	public void swap(HeapNode arg0, HeapNode arg1);
	
	public int getSizeOfHeap();

	// supportive methods
	public void print();

}
