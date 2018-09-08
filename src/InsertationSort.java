import java.util.Arrays;

public class InsertationSort {
	
	public static void main(String args[]){
		int A[] = {10,3,7,36,1,54,5};
		for(int i=0;i<=A.length-1;i++){
			int current = A[i];
			int j = i-1;
			while(j>=0 && A[j]>current){
				A[j+1]= A[j];
				j=j-1;
			}
			A[j+1] = current;
		}
		System.out.println(Arrays.toString(A));
	}

}
