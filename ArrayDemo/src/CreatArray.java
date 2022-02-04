import java.io.*;
import java.util.Scanner;
public class CreatArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int n=0;
		System.out.println("Enter the size of an array");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the Integer element of an array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
					
		}
		
		System.out.println("Printing the array elements");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
					
		}

	}

}
