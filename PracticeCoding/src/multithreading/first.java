package multithreading;

public class first extends Thread {
	
	/*
	 * threading is nothing but two threads are running in simutunesly
	 * if we directly put a.run then only one will be executed.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		first a = new first();
		a.run();
		re b=new re();
	    b.run();

	}

	@Override
	public void run() {

		while (true) {
			System.out.println("Correspondence");
		}
	}

}

class re extends Thread {

	public void run() {

		while (true) {

			System.out.println("Hello is it");
		}
	}
}
