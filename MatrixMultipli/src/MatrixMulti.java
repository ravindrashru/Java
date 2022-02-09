import java.io.*;
import java.util.*;
public class MatrixMulti {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row1,col1,row2,col2;
		System.out.println("Enter the row and column for the first matrix");
		row1=sc.nextInt();
		col1=sc.nextInt();
		System.out.println("Enter the row and column for the second matrix");
		row2=sc.nextInt();
		if(row2!=col1) {
			System.out.println("row of this second matrix must same as column of first matrix");
			System.out.println("Enter the row and column for the second matrix");
			row2=sc.nextInt();
		}
		col2=sc.nextInt();
		int[][] arr1 = new int[row1][col1];
		int[][] arr2=new int[row2][col2];
		int[][] res=new int[row1][col2];
		
		System.out.println("Enter the elements of the first array");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				arr1[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("Enter the elements of the second array");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				arr2[i][j]=sc.nextInt();
				
			}
			
		}
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				res[i][j]=0;
				for(int k=0;k<row2;k++) {
					res[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
			
		}
		System.out.println("Resultant matrix");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				System.out.println(res[i][j]);
				
			}
			
		}
		

	}

}
