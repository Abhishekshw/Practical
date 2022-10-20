package Exeption;

public class MultipleCatch {
	static void mfunc() {
		try {
			int num = 50 / 0;// ArithmeticException
			System.out.println(num);
			/*
			 * int arr[] = new int[3]; arr[4]=25;//arrayIndexOutOfBoundsException } catch
			 * (ArithmeticException e) { System.out.println(e); } catch
			 * (ArrayIndexOutOfBoundsException e) { System.out.println(e);
			 */
		} finally {
			System.out.println("i am finally block");// it will always run
		}
	}

	public static void main(String[] Args) {
		mfunc();
	}
}
