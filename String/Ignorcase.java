package String;

public class Ignorcase {
	public static void main(String[] args) {
		String s1 = "i love you";
		String s2 = "i love You";
		System.out.println("string 1 is : " + s1);
		System.out.println("string 2 is : " + s2);
		int result = s1.compareToIgnoreCase(s2);// comapiring with ignoring case of string
		if (result < 0) {
			System.out.println("\"" + s1 + "\"" + " is less than " + "\"" + s2 + "\"");
		} else if (result == 0)
			System.out.println("\"" + s1 + "\"" + " is equal " + "\"" + s2 + "\"");
		else
			System.out.println("\"" + s1 + "\"" + " is grater  than " + "\"" + s2 + "\"");
	}
}
