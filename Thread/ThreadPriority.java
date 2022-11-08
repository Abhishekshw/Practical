package Thread;

public class ThreadPriority extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(800);
			} catch (Exception ie) {
				System.out.println(ie);
			}
			System.out.println(i);

		}
	}

	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		t1.setPriority(MAX_PRIORITY);
		System.out.println(t2.getPriority());
		System.out.println(Thread.currentThread().getPriority());
		t1.start();
		t2.start();
		t3.start();
		t1.setName("Abhi");
		System.out.println(Thread.currentThread().getName());

	}

}
