
public class ClassAndObject extends Student {

	public static void main(String[] args) {
		ClassAndObject obj1=new ClassAndObject();
		obj1.setRno(1);
		obj1.setName("Rajesh");
		System.out.println(obj1.getRno()+":"+obj1.getName());
		
		
	}
	

}
class Student{
	int Rno;
	String Name;
	
	public int getRno() {
		return Rno;
	}
	public void setRno(int rno) {
		Rno = rno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
