package pack1;

public class AccessModi {
	public int num;
	protected String name;
	float salary;
	private String designation;
	
	public void  display() {
		System.out.println("Public method");
	}
	protected void display1() {
		System.out.println("Protected method");
	}
	private void display2() {
		System.out.println("Private method");
	}
		
}
 
