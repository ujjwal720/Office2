package multithreading;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Sita Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

/*
 * basically the thread join method will be called first and after executed that
 * another instance will be called this is the function thread join method
 */

class ThreadJoinDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		
		t.join();
		for (int i = 0; i < 5; i++) {
			System.out.println("Rama Thread");
		}
	}
}