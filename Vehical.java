package inheritance;

class Vehical1 {// parent class
void running() {
	System.out.println("running mode is on");
}
}
class bike extends Vehical1{//child class
	void run(){
	System.out.println(" bike running mode is on");
}
}
public class Vehical{//main class
	public static void main(String []args) {
		bike d=new bike();//object of child
		d.run();
		d.running();
		
	}
}
