package poly;
class Test1{
 void show(){
		System.out.println("Dynamic  binding 1st");
	}
}
public class DynamicbindingDemo extends Test1{
	 void show(){
		System.out.println("Static binding 2nd");
	}
public static void main(String[] args) {
	Test1 T=new Test1();
	T.show();
}
}
