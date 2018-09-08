package queue;

public class Queue {
	
	private Object array[];
	
	private int head =-1;
	
	private int tail =-1;
	
	public Queue(int size){
		array = new Object[size];
	}
	
	public void enqueue(Object obj){
		if(head==-1){
			head++;
		}
		if(tail==array.length-1){
			throw new RuntimeException("Queue is full.");
		}
		array[++tail] = obj;
	}
	
	public Object dequeue(){
		if(head==-1){
			throw new RuntimeException("Empty Queue");
		}
		return array[head--];
	}
	
}