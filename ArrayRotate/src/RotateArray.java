import java.util.*;

public class RotateArray {
	void rightRotate(int arr[], int d, int n)
    {
        // Iterating till we want
        for (int i = n; i > d; i--)
 
            // Recursively calling
            rightRotatebyOne(arr, n);
    }
	void rightRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array withch is greater than 5:");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("Enter the element of array");
		for(int i=0;i<n;i++) {
			int c=sc.nextInt();
			arr[i]=c;
			
		}
		RotateArray rarr=new RotateArray();
		rarr.rightRotate(arr,5,arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		
		
	

	}

}
