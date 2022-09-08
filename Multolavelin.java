package inheritance;
class Vehical1 {//parent class
void running() {
	System.out.println("running mode is on");
}
}
class Car1 extends Vehical1{// child b
	void Run(){
	System.out.println("car running mode is on");
}
}
class bike1 extends Car1{//child c
	void speed() {
		System.out.println("speed is high");
	}
}
public class Multolavelin {

	public static void main(String[] args) {
	bike1 d=new bike1();//object creation
	d.running();
	d.speed();
	d.Run();
	}
}
