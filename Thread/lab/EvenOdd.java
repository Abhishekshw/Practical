package Thread.lab;

class Even extends Thread {// extending thread
	public void Show() {
		System.out.println("the even numbers are");
		for (int i = 1; i <= 100; i++) {// running for loop to get the values from 1-100
			if (i % 2 == 0) {// logic for even no
				System.out.print(" " + i);
			}
		}
	}
}

class Odd extends Thread {// extending the thread class to create new thread 2
	public void run() {// run method
		System.out.println("the odd numbers are : ");
		for (int i = 1; i <= 100; i++) {// running for loop to get the values from 1-100
			if (i % 2 != 0) {// logic for odd no
				System.out.print(" " + i);
			}
		}
	}
}

public class EvenOdd {
	public static void main(String[] args) throws InterruptedException {
		Even t1 = new Even();
		Odd t2 = new Odd();
		t1.start();
		t1.join();
		t2.start();

	}
}
