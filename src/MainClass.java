import java.util.ArrayList;

public class MainClass {
	
	public static void main(String args[]){
		MyArrayList<Integer> a = new MyArrayList<Integer>(16);
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);
		System.out.println(a.size());
	}
	

}
