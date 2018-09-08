package Algorithm;

public class ShifNoAtLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,3,4,4,1,3,4};
		shiftArray(numbers);
		System.out.println("hello");
		for(int i =0 ; i<= numbers.length-1;i++)
		{
		System.out.println(numbers[i]);
		}
		

	}
	
	public static void shiftArray(int[] numbers){
		System.out.println("test1");
		int start = 0;
		int end = numbers.length-1;
		System.out.println("test2");
		while(start <= end){
			System.out.println("test3");
			if(numbers[start]==1){
				System.out.println("test4");
				for(int index=start;index<=end-1;index++){
					System.out.println("test5");
					numbers[index] = numbers[index+1];
					System.out.println("test6");
					numbers[end] = 1;
				
			}
			}
			start++;
		}
	}

}

