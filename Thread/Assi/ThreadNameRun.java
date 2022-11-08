package Thread.Assi;

public class ThreadNameRun implements Runnable {

	@Override
	public void run() {

	}

	public static void main(String[] args) {
		Runnable R1 = new ThreadNameRun();
		Thread R = new Thread(R1, "My Thread");
		R.start();
		try {

			R.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("thread name is " + R.getName());
	}
}
