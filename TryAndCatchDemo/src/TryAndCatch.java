import java.lang.*;
import java.util.*;

public class TryAndCatch {

	public static void main(String[] args) {
		int a=10,b=0;
		int[] arr= {10,20};
		
				
		try {
			int c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Number trying to devided by 0"+e);
		}
		
		try {
			for(int i=0;i<=arr.length;i++) {
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array Index out of Range"+e);
	}
		
		

		
	}

}
