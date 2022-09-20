package Interface;
interface interface1{//creating an interface
	void show();//by defdault allmethod in interface is public
	void display();
	void print();
}
//creating abstract class thet implement one interface
abstract class Absclass implements interface1{
	public void show() {
		System.out.println("inside show method");
	}
}
//creating sub class of abstract class
class Class2 extends Absclass{
	public void display() {
		System.out.println("inside display method");
	}
	public void print()
{
		System.out.println("inside show method");}
}
public class App2 {
public static void main(String[] args) {
	interface1 obj=new Class2();
	obj.show();
	obj.print();
	obj.display();
}
}
