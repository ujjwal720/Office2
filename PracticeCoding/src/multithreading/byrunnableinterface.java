package multithreading;

public class byrunnableinterface implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byrunnableinterface a=new byrunnableinterface();
		a.run();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			System.out.println("I ma a bad ");
		}
		
	}

}


class w implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			
			System.out.println("This is runnable");
		}
		
	}
	
	
	
}