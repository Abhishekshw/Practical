package inheritance;
final class FInal{
	int a=60;
	final void display(final int a) {//we cant update the final parameter
		a=1;//this line give error
		System.out.println(a);
	}
}

//cant extend final class it always give an error

public class Finalclass extends FInal{//this line this error
	public static void main(String []args) {
	Finalveriable v=new Finalveriable();
	
	}
	
}
