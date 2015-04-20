package heaps;

import heap.HeapNode;
import heap.IHeap;

public abstract class MaxHeap implements IHeap {

	private HeapNode maxHeap[];
	private int maxSize;
	private int currentSize = 0;

	@Override
	public void init(int maxSize) {
		this.maxSize = maxSize;
		this.maxHeap = new HeapNode[this.maxSize];

	}

	@Override
	public void buildHeap() {
		// TODO Auto-generated method stub

	}

	@Override
	public void heapify() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(HeapNode arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public HeapNode leftChild(int pos) {
		if (pos < 0 || pos > this.currentSize
				|| (2 * pos) > this.currentSize - 1)
			return null;
		return maxHeap[2 * pos];

	}

	@Override
	public HeapNode rightChild(int pos) {
		if (pos < 0 || pos > this.currentSize
				|| (2 * pos + 1) > this.currentSize - 1)
			return null;
		return maxHeap[2 * pos + 1];
	}

	@Override
	public HeapNode parent(int pos) {
		if (pos < 0 || pos > this.currentSize)
			return null;
		return maxHeap[(pos-1) / 2];
	}

	@Override
	public boolean isLeaf(int arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

	@Override
	public void swap(HeapNode arg0, HeapNode arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getSizeOfHeap() {
		return currentSize;
	}

	@Override
	public void print() {/*
						 * for (int i = 1; i <= size / 2; i++) {
						 * System.out.print(" PARENT : " + Heap[i] +
						 * " LEFT CHILD : " + Heap[2 * i] + " RIGHT CHILD :" +
						 * Heap[2 * i + 1]); System.out.println(); }
						 */
	}

}
