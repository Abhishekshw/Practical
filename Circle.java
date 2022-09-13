package inheritance;
class Operation{
	int a;
	int square (int a) {
		return a*a;
		
	}
}
public class Circle {
	Operation ref;
	double pi=3.142;
	double area(int radius) {
		ref =new Operation();
		int square1=ref.square(radius);
		return pi*square1;
	}
public static void main(String  []args) {
	Circle c=new Circle();
	double result=c.area(6);
	System.out.println(result);
}
}
