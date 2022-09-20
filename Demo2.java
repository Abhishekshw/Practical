package Interface;
//multiple inheritance by interface
public interface Demo2 {//1st interface
void show();
}
interface demo3{//2nd interface
	void print();
}
class Example implements Demo2,demo3{
	public void show(){
		System.out.println(" Show");
	}
	public void print() {
		System.out.println("print");
	}
	public static void main(String[] args) {
		Example obj=new Example();
		obj.show();
		obj.print();
	}
}