package Interface;
//default static method in interface science java8
public interface Abc {
void print();//abstract 1 
//no need to define method
default void show() {//default 1
	System.out.println("hi");
}
static void hello() {//static method
	System.out.println(" inside static method");
}
}
 class App implements Abc{
	public void print() {
		System.out.println("in print method");
	}
	public static void main(String[] args) {
		Abc app=new App();
		app.show();
		app.print();
		Abc.hello();//calling interface using interface name
		
	}
}
