package String;

import java.util.Scanner;

//check equality by by using equal method
public class StringEquality {
	public static void main(String[] args) {
		String s1, s2;
		Scanner s = new Scanner(System.in);
		System.out.println("enter string 1");
		s1 = s.nextLine();
		System.out.println("enter string 1");
		s2 = s.nextLine();
		if (s1.equals(s2))// compairing two input string
			System.out.println("equal string");
		else
			System.out.println("unequal string");
	}
}
