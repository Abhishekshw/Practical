package Exeption;

//example of throw unchecked ecception
public class ThrowUnchecked {
	public static void eligible(int age) {
		if (age < 18) {// throwarithmatic exception if personage is <18
			throw new ArithmeticException("you are not eligible for vote");
		} else {
			System.out.println("eligible fo vote");
		}
	}

	public static void main(String[] args) {
		eligible(12);
		System.out.println("done");
	}
}
