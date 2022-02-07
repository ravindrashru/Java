import java.util.*;

public class KeyAndCustomE {
		
	
	public static void main(String[] args) throws Exception {
		int a=10,b=10,c;
		try {
			c=a/b;
			//throw( new ArithmeticException("numnber cannot devided by zero"));
			throw new CustomeExc("Custom Exception number cannot devided by zero");
		}
		catch(CustomeExc e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Its default message");
		}
		
		
	}
}


