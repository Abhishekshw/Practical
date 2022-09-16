package poly;
//veriable have a type
/*public class Staticbinding {
int a=30;//its a int type data
reffrence have a type
Staticbinding b;
//object have a re4tuen type
Staticbinding new =obj Staticbinding();*/
public class Staticbinding {
	private void show(){
		System.out.println("Static binding");
	}
	public static void main(String[] args) {
		Staticbinding S=new Staticbinding();
		S.show();
	}
}

