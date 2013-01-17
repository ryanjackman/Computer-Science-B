package Chapter3;

public class ListQueueWithCopy extends ListQueue{

	public static void main(String[] args) {
		
		new ListQueueWithCopy();
	}
	
	public ListQueueWithCopy(){
		this.enqueue( new Integer(1) );
		this.enqueue( new Integer(2) );
		this.enqueue( new Integer(3) );
		this.enqueue( new Integer(4) );
		this.enqueue( new Integer(5) );
		
		ListQueueWithCopy copy = copy();
		
		while(!copy.isEmpty()){
			System.out.println(copy.dequeue());
		}
	}
	
	public ListQueueWithCopy copy(){
		ListQueueWithCopy copy = this;
		return copy;
	}

}
