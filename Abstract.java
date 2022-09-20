package abstraction;
abstract class Abstr{//parent class
	abstract void method();//abstract method
}
class test extends Abstr{//child class 
	void method() {//non abstract method
		System.out.println( "method running ");
	}
}
public class Abstract extends Abstr{
void method() {
	System.out.println("new method running");
}
public static void main(String[] args) {
	Abstr obj=new Abstract();
	obj.method();
}
}
