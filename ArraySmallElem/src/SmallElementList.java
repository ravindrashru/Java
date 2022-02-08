import java.util.*;
public class SmallElementList {
	public int getsmallKthElemnt(int[] a, int k) {
		int temp;  
		for (int i = 0; i < a.length; i++)   
		        {  
		            for (int j = i + 1; j < a.length; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[k-1];
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		
		System.out.println("How many elements you will add into a list");
		n=sc.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Please enter the array elements");
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			arr[i]=temp;
		}
		System.out.println("Please enter Kth smallest elements you want");
		int k=sc.nextInt();
		
		SmallElementList sm=new SmallElementList();
		int small=sm.getsmallKthElemnt(arr, k);
		System.out.println("Kth smallest element is:"+small);
	}

}
