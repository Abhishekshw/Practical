package inheritance;

public class Overriding {//parent class
void run() {
	System.out.println("running mode on");
}}
class TestOverriding extends Overriding{//creating child class
	void run() {//defining same method to child class to.
		System.out.println("running mode off");
	}
public static void main(String []args) {
	Overriding obj=new Overriding();//object creation 
	obj.run();//method calling.
}
}
