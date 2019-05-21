package example;

public class SimpleThread {
	static class MyThread implements Runnable {

		@Override
		public void run() {
			System.out.println("Wow! Sono dentro "+Thread.currentThread());			
		}
		
	}
	
	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println("Thread principale: "+mainThread);
		mainThread.setName("Thread del 4Binf");
		mainThread.setPriority(10);
		System.out.println("Thread principale: "+mainThread);
		
		System.out.println("Esempio!");
		
		Thread myThread = new Thread(new MyThread(), "My wonderful thread");
		myThread.start();
		System.out.println("Ultima riga!");
	}
}
