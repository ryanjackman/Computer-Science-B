package Chapter3;

public class ListQueue implements Queue {
	private java.util.LinkedList<Object> list;

	public ListQueue() {
		list = new java.util.LinkedList<Object>();
	}

	public boolean isEmpty() {
		return list.size() == 0;
	}

	public void enqueue(Object obj) {
		list.addLast(obj);
	}

	public Object dequeue() {
		return list.removeFirst();
	}

	public Object peekFront() {
		return list.getFirst();
	}
}