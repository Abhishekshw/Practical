package inheritance.Super;
class Shape{//parent class
	String name="Circle";//data member of parent class
}
class Size extends Shape{//child class
	String name="Triangle";//data member of child class
	void showname() {//method
		System.out.println(name);//Display the name of the size class
		System.out.println(super.name);//Display the name of the Shape class
	}
}
public class Superiv {
	public static void main(String []args) {
		Size obj=new Size();
		obj.showname();
		
	}
}
