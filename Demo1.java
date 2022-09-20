package Interface;

public interface Demo1 {//interface declaration
void method();
}
class Test implements Demo1{//1st implementation
	public void method() {
		System.out.println("display");
	}}
	class Test1 implements Demo1{//2nd implementation
		public void method() {
			System.out.println("display");
		}
	public static void main(String[] args) {
		Demo1 T=new Test();
		T.method();
	}
}