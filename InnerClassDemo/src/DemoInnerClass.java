
public class DemoInnerClass {

	public static void main(String[] args) {
		OuterClass obj=new OuterClass();
		obj.display();
		
		OuterClass.InnerClass objInner=obj.new InnerClass();
		objInner.display();

	}

}
