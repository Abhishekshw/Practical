package Operators;

public class Exop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;// values
		int b=6;
		int c=6;
		
		System.out.println(a+b);// Arithmetic operator
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(a<b&&b<a);//logical operator
		System.out.println(a>b&&b<a);
		System.out.println(a<b||b<a);
		
		System.out.println(a>b);//relational operator
		System.out.println(a<b);
		System.out.println(c=b);
		System.out.println(c!=b);
		System.out.println(a++ + ++a);//unary operator
		System.out.println(b-- + --b);
		
	}

}