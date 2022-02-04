import java.util.*;
public class OuterClass {
	
	public void display() {
		System.out.println("I am Method of outerclass");
	}
	
	public class InnerClass{
		public void display() {
			System.out.println("I am Method of ther inner class");
		}
	}
}

