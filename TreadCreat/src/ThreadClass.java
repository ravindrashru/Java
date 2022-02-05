import java.lang.*;

public class ThreadClass extends Thread {
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws Exception {
		
		ThreadClass obj=new ThreadClass();
		obj.start();
		System.out.println(obj.getPriority());
		System.out.println(obj.isAlive());
		Thread.sleep(1000);

	}

}
