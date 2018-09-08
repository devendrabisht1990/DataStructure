/*
 * iterate on array
 * find the smallest element
 * replace the smallest element with current array element 
 */
public class SelectionSort {

	public static void main(String[] args) {
		int B[] = new int[-1];
		// TODO Auto-generated method stub
		int A[] = {12,45,3,23,7,10};
		for(int i=0;i<=A.length-1;i++){
			int minIndex = i;
			for(int j=i+1;j<=A.length-1;j++){
				if(A[minIndex] > A[j]){
					minIndex = j;
				}
			}
			int temp = A[i];
			A[i] = A[minIndex];
			A[minIndex] = temp;
		}
		for(int k =0;k<=A.length-1;k++){
		System.out.println(A[k]);
		}

	}

}
