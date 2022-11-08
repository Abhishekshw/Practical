package Thread;
/*
public class ThreadState extends Thread {
	public void run() {
		System.out.println("thread activated");
	}

	public static void main(String[] args) {
		ThreadState Th = new ThreadState();
		Th.start();
	}
}*/

public class ThreadState implements Runnable {
	public void run() {
		System.out.println("thread activated");
	}

	public static void main(String[] args) {
		ThreadState obj = new ThreadState();
		Thread t1 = new Thread(obj);
		t1.start();
	}
}
