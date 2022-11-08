package Thread;

public class Runmethod extends Thread {
	public void show() {
		System.out.println("threade activated");
	}

	public static void main(String[] args) {
		Runmethod r = new Runmethod();
	}
}
