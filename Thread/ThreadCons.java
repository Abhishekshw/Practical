package Thread;

//using Thread class
public class ThreadCons {
	public static void main(String[] args) {
		Thread obj = new Thread("Abhi");// uswing constructore Thring String name)
		obj.start();// move to active State
		String str = obj.getName();// thread name by invoking get name nmethod
		System.out.println(str);
	}
}

//runnable interface
/*
 * public class ThreadCons implements Runnable { public void run() {
 * System.out.println("threade Activated"); }
 * 
 * public static void main(String[] args) { Runnable r = new
 * ThreadCons();//creatinfg obj of thread class Thread obj = new Thread(r,
 * "Abhi");//using thread(runnable r,String name) obj.start(); String str =
 * obj.getName();//thrade name by invoking get name method
 * System.out.println(str); } }
 */
