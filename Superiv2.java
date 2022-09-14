package inheritance.Super;
class Shape{//parent class
	String name="Circle";//data member of parent class
	void print()//parent class method
{System.out.println("print Circle");
		} 
}
class Size extends Shape{//child class
	String name="Triangle";//data member of child class
	void print()//method
	{
		System.out.println("print Tringle");
	super.print();
	
			} 
}
public class Superiv2 {
	public static void main(String []args) {
		Size obj=new Size();//new object
		obj.print();
}}
