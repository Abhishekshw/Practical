package Exeption;

import java.util.Scanner;

public class Exceptions {
	static void Operation() {// Ststic method
		Scanner S = new Scanner(System.in);// Scanner obj
		System.out.println("Enter 1st no");
		int x = S.nextInt();// asking for value
		System.out.println("enter 2nd no");
		int y = S.nextInt();
		;// asking for value
		try {// try used toi throw Exception
			System.out.println(x / y);
		} catch (Exception e) {// catch the Exception
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Operation();// method calling
	}
}
