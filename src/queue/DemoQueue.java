package queue;

public class DemoQueue {
	
	public static void main(String args[]){
		Queue queue = new Queue(5);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		//queue.enqueue(9);
		System.out.print(queue.dequeue());
	}

}
