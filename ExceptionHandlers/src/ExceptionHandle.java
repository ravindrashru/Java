
public class ExceptionHandle {

	public static void main(String[] args) {
		
		try {
			System.out.println("Try block called");
			throw new CustomExceptions("Custom Exceptions");
		}
		catch(CustomExceptions e){
			System.out.println("Catch block called");
			System.out.println(e);
		}

	}

}
