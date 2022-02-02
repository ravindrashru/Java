package pack1;
public class ModiAccess {

	public static void main(String[] args) {
		
		AccessModi obj=new AccessModi();
		obj.num=100;
		obj.name="Rajesh";
		obj.salary=1000f;
		System.out.println(obj.num);
		System.out.println(obj.name);
		System.out.println(obj.salary);
		
		obj.display();
		obj.display1();
	}

}