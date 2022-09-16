package inheritance;

public class Finalveriable {
	final int value=50;
	void disp() {//we cant change the value of final variable
		//value=80;//This line give compile time error
	}
	public static void main(String []args) {
	Finalveriable v=new Finalveriable();
	v.disp();
	
}}
