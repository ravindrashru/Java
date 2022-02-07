
public class CustomExceptions extends Exception{
	String str;
	public CustomExceptions(String s) {
		this.str=s;
	}
	public String toString() {
		return ("Exception Occured:"+str);
	}

}
