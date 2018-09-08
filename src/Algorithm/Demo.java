package Algorithm;
import java.util.*;

public class Demo {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scanner.nextLine();
		System.out.println(str);
		/*
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		str = sb.toString();
		System.out.println(str);
		*/
		char[] test = str.toCharArray();
		int length = test.length;
		char[] reverse = new char[length];
		for(int i=length-1,j=0;i>=0;i--){
			reverse[j]=test[i];
			j++;
		}
		System.out.println(reverse);
		
	}

}
