package datastr;

public class MyArrayList {
	private char[] list;
	private final int DEFAULT_SIZE = 8;
	private int size = DEFAULT_SIZE;
	private int howManyElements = 0;

	public MyArrayList() {
		list = new char[size];

	}

	public MyArrayList(int inputSize) {
		if (inputSize > 0) {
			size = inputSize;
		}
		list = new char[size];
	}

	public boolean isEmpty() {
		return (howManyElements == 0);
	}

	public boolean isFull() {
		return (howManyElements == size);
	}

	private void resize() {
		int largeSize = (howManyElements < 100) ? size * 2 : (int) (size * 1.5);

		char[] largeList = new char[largeSize];

		for (int i = 0; i < howManyElements; i++) {
			largeList[i] = list[i];
		}
		list = largeList;
		System.gc();
		size = largeSize;
	}

	public void add(char element) {
		if (isFull()) {
			resize();
		}
		list[howManyElements++] = element;
	}

	public void addAtIndex(char element, int index) {
		if (index < 0 && index > size) {
			throw (new Exception("Nu uH"));
		}
	}
}
