package Overloading;
//changing no of argumnet
public class overloading {
static int add(int a,int b) {//two argument
	return a+b;	
}
static int add(int a,int b,int c) {//two argument
	return a+b+c;
}
}
class test{
	public static void main(String  []args) {
		System.out.println(overloading.add(2,2));
		System.out.println(overloading.add(2,2,3));
	}
}