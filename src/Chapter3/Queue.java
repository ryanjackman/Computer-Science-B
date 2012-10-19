package Chapter3;

public interface Queue {
	boolean isEmpty();

	void enqueue(Object obj);

	Object dequeue();

	Object peekFront();
}