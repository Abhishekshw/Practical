package Exeption;

public class TryCatch {
	public static void main(String[] args) {
		try {
			int num = 25 / 0;// may exeption occure
			System.out.println("this line will not exicute");
		} catch (ArithmeticException r) {// Exeption handling
			System.out.println(r);
			System.out.println(25 / 5);
		}
		System.out.println("code run Sucessfull");
	}
}
