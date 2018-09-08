import java.util.Arrays;

public class MyArrayList<E> {
	
	private static int DEFAULT_SIZE = 3;
	
	private int size = 0;
	
	Object arr[];

	public MyArrayList(int size) {
		if(size>0){
		arr = new Object[size];
		}
		else{
			throw new RuntimeException("negative array size not allowed");
		}
	}
	
	public MyArrayList(){
		arr = new Object[DEFAULT_SIZE];
	}
	
	public void add(E object){
		ensureCapacity(size+1);
		arr[size++] = object;
	}
	
	private void ensureCapacity(int newSize){
		if(!(arr.length >= (newSize))){
			int newCapacity = (int) (arr.length*1.5);
			arr = Arrays.copyOf(arr, newCapacity);
		}
	}
	
	public String toString(){
		return Arrays.toString(arr);
	}
	
	public int size(){
		return size;
	}
	

}
