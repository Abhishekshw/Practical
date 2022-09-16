package poly;

public class Runtimepoly {
void show(){
	System.out.println("show anything");
}
}
class Test extends Runtimepoly{
	void show(){
		System.out.println("show nothing");
	}
	public static void main(String []args) {
		/*/Runtimepoly R=new Runtimepoly();
		R.show();*/
		Test T=new Test();
		T.show();
	}
}
