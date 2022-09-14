package inheritance;
class Shape2{//parent class
	public Shape2() {//cons of parent class
		System.out.println("hello");
	}
}
class Size2 extends Shape2{//child class
	public Size2()//cons of child
{super();// calling parent cons
	System.out.println("hii");	}
}
public class Supercons {
	public static void main(String []args) {//main method
		Size2 obj=new Size2();//object creation
		
	}
}
