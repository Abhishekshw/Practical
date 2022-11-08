package Thread.Assi;

class SynchronizedMethod {
	String str;

	synchronized String method1(String s1) {

		return s1;
	}

	synchronized String method2(String s2) {
		return s2;
	}

	synchronized String method3(String s3) {
		return s3;
	}

	synchronized String method4(String s4) {
		return s4;
	}

	synchronized String method5(String s5) {
		return s5;
	}
}

class ThreadA extends Thread {
	SynchronizedMethod s;

	ThreadA(SynchronizedMethod s) {
		this.s = s;
	}

	public void run() {
		System.out
				.println(s.method1("i") + s.method2("want") + s.method3("to") + s.method4("learn") + s.method5("java"));
	}
}

class TestSync {
	public static void main(String[] args) {
		SynchronizedMethod stn = new SynchronizedMethod();
		ThreadA td = new ThreadA(stn);
		td.start();
	}
}
