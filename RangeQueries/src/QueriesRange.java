import java.util.*;
public class QueriesRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of an array:");
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			arr[i]=temp;
		}
		int l=0,r=0;
		System.out.println("Please enter the range as start index and end index which shold be less than "+n);
		l=sc.nextInt();
		r=sc.nextInt();
		int sum=0;
		if(l<=r && r<arr.length) {
			while(l<=r) {
				sum+=arr[l];
				l++;
			}
		}
		System.out.println(sum);

	}

}
