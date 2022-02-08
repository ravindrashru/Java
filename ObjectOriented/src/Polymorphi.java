
public class Polymorphi extends Parent {
	//Child class display method
	public void display() {
		System.out.println("Child class display method called");
	}

	public static void main(String[] args) {
		//creating object of child class
		Polymorphi pl=new Polymorphi();
		pl.display();
		
		//creating object of parent class
		Parent pr=new Parent();
		pr.display();
		
		//creating child object using reference of parent class
		//Runtime polymorphism
		Parent pr1=new Polymorphi();
		pr1.display();
		
		
		

	}

}
class Parent{
	//parent class display method
	public void display() {
		System.out.println("Parent class display menthod called");
	}
}
