

public class BinaryMinHeap {

	private Integer[] heap = {1,3,6,5,9,8,null,null,null,null,null,null};
	private int heapSize = 6;
	
	public BinaryMinHeap() {
	}

	public int getMinimum() {
		if (isEmpty())
			throw new HeapException("Heap is empty");
		else
			return heap[0];
	}

	public boolean isEmpty() {
		return (heapSize == 0);
	}

	private int getLeftChildIndex(int nodeIndex) {
		return 2 * nodeIndex + 1;
	}

	private int getRightChildIndex(int nodeIndex) {
		return 2 * nodeIndex + 2;
	}

	private int getParentIndex(int nodeIndex) {
		return (nodeIndex - 1) / 2;
	}
	
	public void insert(int value) {
		if (heapSize == heap.length)
			throw new HeapException("Heap's underlying storage is overflow");
		else {
			System.out.print("\nReorganizando...");
			heapSize++;
			heap[heapSize - 1] = value;
			siftUp(heapSize - 1);
		}
	}

	private void siftUp(int nodeIndex) {
		System.out.println(toString());
		int parentIndex, tmp;
		if (nodeIndex != 0) {
			parentIndex = getParentIndex(nodeIndex);
			if (heap[parentIndex] > heap[nodeIndex]) {
				tmp = heap[parentIndex];
				heap[parentIndex] = heap[nodeIndex];
				heap[nodeIndex] = tmp;
				siftUp(parentIndex);
			}
		}
	}
	
	public String toString() {
		System.out.print("\nminHeap = {");
		for(int i = 0; i < heapSize; i++) {
			System.out.print(i < heapSize -1 ? heap[i] + ", " : heap[i]);
		}
		return "}";
	}

	public class HeapException extends RuntimeException {
		private static final long serialVersionUID = 1L;
		public HeapException(String message) {
			super(message);
		}
	}
}

