
public class DiamondProb implements A,B {//implementing/extending properties more than 1 interface
	public void display() {
		A.super.display();
		B.super.display();
		System.out.println("Child class/Inherited class display method called");
	}

	public static void main(String[] args) {
		DiamondProb objdp=new DiamondProb();
		objdp.display();

	}

}
interface A{
	default void display() {//need to use default method
		System.out.println("Interface A display method called");
	}
}
interface B{
	default void display() {//need to use default method
		
		System.out.println("Interface A display method called");
		
	}
}
