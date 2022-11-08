package Thread;

public class ThreadExample extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ThreadExample t = new ThreadExample();
		ThreadExample t1 = new ThreadExample();
		ThreadExample t2 = new ThreadExample();
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		t2.start();

	}
}
