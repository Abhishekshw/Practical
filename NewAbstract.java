package abstraction;
//an abstrtact class which has abstract,non abstract,construtor
public abstract class NewAbstract {
	NewAbstract(){// construtor
		System.out.println("cons created");
	}
	abstract void show();//abs method
	void method1() {//non abstract method
		System.out.println("method1 created");
	}
}
class Test extends NewAbstract{
	void show() {
		System.out.println("method running");
	}
}
class Anything extends NewAbstract{//child class
	void show(){
		System.out.println("new test method running");
	}
	public static void main(String[] args) {
		NewAbstract obj=new Anything();
		obj.method1();
		obj.show();
	}
}
