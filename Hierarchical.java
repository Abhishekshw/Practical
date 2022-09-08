package inheritance;
class Vehical1 {//parent class
void running() {
	System.out.println("running mode is on");
}
}
class Car1 extends Vehical1{// child of vehical
	void run(){
	System.out.println("car running mode is on");
}
}
class bike1 extends Vehical1{// child of vehical
	void speed() {
		System.out.println("speed is high");
	}
}
public class Hierarchical {
	public static void main(String[] args) {
		bike1 b=new bike1();//object creation
		b.running();
		b.speed();
		Car1 c=new Car1();
		c.running();
		c.run();
}
}
