package Exeption;

public class Nestedtry {
	public static void main(String[] args) {
		try {// outer try block
			try {// inner try 1
				System.out.println("going to didvide by 0");
				int a = 14 / 0;
			} catch (ArithmeticException e) {// inner catch 1
				System.out.println(e);
			}
			try {// inner try 2
				int b[] = new int[5];
				b[6] = 24;// assigning the value out of array bound
			} catch (ArrayIndexOutOfBoundsException e) {// inner catch 1
				System.out.println(e);
			}
			System.out.println("OTHER STETMENT");
		} catch (Exception e) {// outer catch block
			System.out.println("outer block exception");
		}
		System.out.println("normal Flow");
	}
}
