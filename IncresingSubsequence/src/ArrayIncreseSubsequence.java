import java.util.*;
import java.io.*;
public class ArrayIncreseSubsequence {
	 static int findSeq(int arr[], int n)
	    {
	        int res[] = new int[n];
	        int max = 0;
	  
	        for (int i = 0; i < n; i++)
	            res[i] = 1;
	  
	        
	        for (int i = 1; i < n; i++)
	            for (int j = 0; j < i; j++)
	                if (arr[i] > arr[j] && res[i] < res[j] + 1)
	                    res[i] = res[j] + 1;
	  
	       
	        for (int i = 0; i < n; i++)
	            if (max < res[i])
	                max = res[i];
	  
	        return max;
	    }
	  
	    public static void main(String args[])
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the size of an array");
	    	int size=sc.nextInt();
	    	int[] arr=new int[size];
	    	System.out.println("Enter the elemets of an array");
	    	for(int i=0;i<size;i++) {
	    		int temp=sc.nextInt();
	    		arr[i]=temp;
	    	}
	    	System.out.println("longest subsequence array is:"+findSeq(arr,size));
	       
	    }
	


}
