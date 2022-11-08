package Thread;

//without using Synchronization
class MyThreadClass {
	/* synchronized */ void print(int num) {// by using Synchronized it will be Synchronizwed
		for (int i = 1; i < 5; i++) {
			System.out.println(num * i);

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Thread1 extends Thread {
	MyThreadClass ws;

	Thread1(MyThreadClass ws) {
		this.ws = ws;

	}

	public void run() {
		ws.print(5);// 5*1,5*2....
	}

}

class Thread2 extends Thread {
	MyThreadClass ws;

	Thread2(MyThreadClass ws) {
		this.ws = ws;
	}

	public void run() {
		ws.print(500);// 500*1;500*2...
	}
}

public class WithouTSynchronizatio {
	public static void main(String[] args) {
		MyThreadClass obj = new MyThreadClass();
		Thread1 t = new Thread1(obj);
		Thread2 t1 = new Thread2(obj);
		t.start();
		t1.start();

	}
}
