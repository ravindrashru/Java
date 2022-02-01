import java.util.*;
public class TypeCast {

	public static void main(String[] args) {
		int varInt=10;
		float varFloat=30f;
		double varDouble=10.8;
		char ch='A';
		String str="123";
		
		//converting char type to int 
		varInt=(int)ch;
		System.out.println("converting char type to int ");
		System.out.println(varInt);
		
		//converting int type to char
		ch=(char)varInt;
		System.out.println("converting int type to char ");
		System.out.println(ch);
		
		//converting int to float
		varFloat=varInt;
		System.out.println("converting int type to float ");
		System.out.println(varFloat);
		
		//converting float to int
		varInt=(int)varFloat;
		System.out.println("converting float type to int ");
		System.out.println(varInt);
		
		//converting double to int
		varInt=(int)varDouble;
		System.out.println("converting double type to int ");
		System.out.println(varInt);
		
		//converting int to double
		varDouble=varInt;
		System.out.println("converting int type to double ");
		System.out.println(varInt);
		
		//Converting string into int
		varInt=Integer.parseInt(str);
		System.out.println("converting string type to int ");
		System.out.println(varInt);
		
		
		
			

		
	}

}
