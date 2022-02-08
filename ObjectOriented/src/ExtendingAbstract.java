
public class ExtendingAbstract extends AbstractClass {

	public static void main(String[] args) {
	//creating object of child class
		ExtendingAbstract obj=new ExtendingAbstract();
		//calling abstract class method
		int a=obj.add(10,20);
		System.out.println(a);
		
		//calling abstract class method
		obj.display();
		

	}
	//Abstract class method implemented
	@Override
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}

}
