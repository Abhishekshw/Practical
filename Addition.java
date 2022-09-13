package Overloading;
//changing datatype
 class Overloading {//class
		static int add(int a,int b) {//two argument of int
			return a+b;	
		}
		static double add(double a , double b) {//two argument of double
			return a+b;
		}
		}
public class Addition{
	public static void main(String  []args) {
		System.out.println(Overloading.add(10,10));
		System.out.println(Overloading.add(10.5,10));
	}
}


