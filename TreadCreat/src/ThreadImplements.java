
public class ThreadImplements implements Runnable {

	public static void main(String[] args) {
		ThreadImplements obj=new ThreadImplements();
		Thread tobj=new Thread(obj);
		tobj.run();
		
				

	}

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}

}
