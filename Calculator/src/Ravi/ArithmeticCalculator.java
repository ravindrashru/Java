package Ravi;
import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		double var1,var2;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		var1=sc.nextDouble();
		System.out.println("Enter the second number");
		var2=sc.nextDouble();
		System.out.println("Please Enter which arithmetic operation neeed to be performed + - * /");
		ch=sc.next().charAt(0);
		
			switch(ch) 
			{
				case '+':
					System.out.println("Sum of "+var1+" and "+var2+" is: "+(var1+var2));
					break;
				case '-':
					System.out.println("Difference of "+var1+" and "+var2+" is: "+(var1-var2));
					break;
				case '*':
					System.out.println("Multiplication of "+var1+" and "+var2+" is: "+(var1*var2));
					break;
				case '/':
					if(var2>0)
					{
						System.out.println("Sum of "+var1+" and "+var2+" is: "+(var1/var2));
					}
					else {
						System.out.println("Enter the var2 which is greater than 0");
					}
					break;
				default:
					System.out.println("Please enter valid operation");
				
		}
	}
}
