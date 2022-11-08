package Thread.Assi;

class thread extends Thread {

}

public class ThreadName extends Thread {
	public static void main(String[] args) {
		thread t1 = new thread();
		try {
			t1.start();

			t1.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thread name is " + Thread.currentThread().getName());
	}
}
