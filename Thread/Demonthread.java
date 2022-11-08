package Thread;

public class Demonthread extends Thread {
	public void run() {
		/*
		 * System.out.println("name : " + Thread.currentThread());
		 * System.out.println("Demon : " + Thread.currentThread());
		 */
		if (Thread.currentThread().isDaemon()) {// Cheking name is demon or not
			System.out.println(Thread.currentThread().getName());
			System.out.println("i am demon");
		} else
			System.out.println("i am user Thread");
	}

	public static void main(String[] args) {
		Demonthread d = new Demonthread();
		Demonthread d1 = new Demonthread();
		Demonthread d2 = new Demonthread();
		d1.setDaemon(true);
		d.start();
		d1.start();
		d2.start();

	}

}
