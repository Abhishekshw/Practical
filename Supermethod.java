package inheritance.Super;
class Shape1{//parent class
	void print() {//method
		System.out.println("print circle");
	}
}
class Size1 extends Shape1{//child class
	String name="Triangle";//data member of child class
	void print()//same method as parent
	{
		System.out.println("print Tringle");}
	void display() {//new method oiif child class
		System.out.println("print nothing");
	}
void show() {//final method
super.print();
display();
}
	
			} 
public class Supermethod {
	public static void main(String []args) {
		Size1 obj=new Size1();
		obj.show();
		}
}
