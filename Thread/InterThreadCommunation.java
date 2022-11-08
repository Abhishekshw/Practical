package Thread;

class InterThread {
	int i;
	boolean value = false;

	synchronized void product(int i) {
		if (value) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);

			}
			this.i = i;
			value = true;
			System.out.println("Production done: " + i);
			notify();
		}
	}

	synchronized int consume() {
		if (!value) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Production consumed: " + i);
			value = true;
			notify();
		}
		return i;
	}
}

class Producer extends Thread {
	InterThread iThread;

	Producer(InterThread iThread) {
		this.iThread = iThread;
	}

	@Override
	public void run() {
		for (int j = 0; j < 5; j++) {
			iThread.product(j);
		}
	}

}

class Consumer extends Thread {
	InterThread iThread;

	Consumer(InterThread iThread) {
		this.iThread = iThread;
	}

	@Override
	public void run() {
		for (int k = 0; k < 5; k++) {
			iThread.product(k);
		}
	}
}

public class InterThreadCommunation {
	public static void main(String[] args) {
		InterThread interthread = new InterThread();
		Producer producer = new Producer(interthread);
		Consumer consumer = new Consumer(interthread);
		producer.start();
		consumer.start();
	}
}
