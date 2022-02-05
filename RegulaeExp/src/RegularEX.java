import java.util.regex.*;

public class RegularEX {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[a-zA-z]+");
		
		Matcher m=p.matcher("am");
		System.out.println(m.matches());
		
		Matcher m1=p.matcher("acc");
		System.out.println(m1.matches());
		
		
		
	
		
	
		
		
		
		
	}

}
