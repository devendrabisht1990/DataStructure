//sorted array
//complexity log 
// after each step the no of data reduced to half
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {2,5,7,19,45,65,101,432};
		//find 101
		int index = A.length/2;
		while(A[index]!=101){
			index = (index + (A.length-1))/2;
		}
		System.out.println(index);
		
	}

}
