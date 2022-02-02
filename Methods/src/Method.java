import java.util.*;
import java.io.*;

public class Method {
	public int addition(int a, int b) {
		return a+b;
		
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	

	public static void main(String[] args) {
		
		int var1,var2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number(var1)");
		var1=sc.nextInt();
		System.out.println("Enter the second number(var2)");
		var2=sc.nextInt();
		Method obj=new Method();
		int res=obj.addition(var1,var2);
		int res2=obj.mul(var1,var2);
		System.out.println("Sum of var1 and var2 is:"+res);
		System.out.println("Multiplication of var1 and var2 is:"+res2);
		
		
		
	}

}
