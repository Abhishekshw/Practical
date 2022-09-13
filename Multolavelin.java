package inheritance;

class Vehical2 {//parent class
void running() {
	System.out.println("running mode is on");
}
}
class Car2 extends Vehical2{// child b
	void run(){
	System.out.println("car running mode is on");
}
}
class Bike1 extends Car2{//child c
	void speed() {
		System.out.println("speed is high");
	}
}
public class Multolavelin {

	public static void main(String[] args) {
	Bike1 d=new Bike1();//object creation
	d.running();
	d.speed();
	d.run();
	}
}
