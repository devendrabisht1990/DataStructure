package stack;

public class Stack {
	
	private static int DEFAULT_CAPACITY =10;
	
	private Object[] array;
	
	private int top = -1;
	
	public Stack(){
		array = new Object[DEFAULT_CAPACITY];
	}
	
	public void push(Object element){
		top++;
		array[top] = element;
	}
	
	public Object pop(){
		if(top>=0){
		Object obj =  array[top];
		top--;
		return obj;
		}
		else{
			throw new RuntimeException("Stack is blank");
		}
	}
	
	public Object poll(){
		if(top>=0){
		Object obj =  array[top];
		return obj;
		}
		else{
			throw new RuntimeException("Stack is blank");
		}
	}
	
	

}
