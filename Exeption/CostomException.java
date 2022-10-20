package Exeption;

import java.util.Scanner;

class InvalidAgeException extends Exception {// creating new Exception
	InvalidAgeException(String str) {
		super(str);
	}
}

public class CostomException {
	public static void checkAge(int age) throws InvalidAgeException {
		if (age <= 18 || age >= 25) {// cheking condition for Exception
			throw new InvalidAgeException("invalid age  for java couse");// throwing new Exception
		} else {
			System.out.println("your age is proper for java course");
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		Scanner S = new Scanner(System.in);
		System.out.println("enter the age");
		int age = S.nextInt();
		checkAge(age);

	}
}
