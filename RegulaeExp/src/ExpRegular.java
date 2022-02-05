import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpRegular {

	public static void main(String[] args) {
		Pattern p1=Pattern.compile("[0-9]{10}");
		
		Matcher m2=p1.matcher("8951599953");
		System.out.println(m2.matches());
		
		Matcher m3=p1.matcher("895159995");
		System.out.println(m3.matches());

	}

}
