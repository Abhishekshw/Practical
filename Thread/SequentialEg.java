package Thread;

public class SequentialEg {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(2000);// the thread sleep/stop for given time 1000=1sec
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		SequentialEg t1 = new SequentialEg();
		SequentialEg t2 = new SequentialEg();
		SequentialEg t3 = new SequentialEg();
		t1.run();
		t2.run();
		t3.run();

	}
}
