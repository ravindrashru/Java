import java.util.*;
import java.lang.*;
public class Factory implements Runnable{
	static int value=0;
	boolean flag=false;
	
		synchronized public static void producer()throws Exception
		{
		value++;
		System.out.println("Producer produces the item"+value);
		
	}	
	
	synchronized public static void consumer() throws Exception {
		
		
		System.out.println("Consumer consumes this item"+ value);
		
		
	}
	
	public static void main(String[] args) throws Exception {
		Factory fact=new Factory();
		Thread t=new Thread(fact);
		
		
		int i=10;
		while(i>=1) {
			t.run();
			i--;
		}
	

	}


	@Override
	public void run() {
		//Thread t=new Thread();
		if(!flag) {
			
			try {
				Factory.producer();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			flag=true;
		}
		if(flag) {
			try {
				Factory.consumer();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			flag=false;
		}
	}

}
