package Exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedException {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("enter two number");
		try {
			int x = S.nextInt();// asking for value
			int y = S.nextInt();// asking for value
			System.out.println(" " + (x / y));
		} catch (InputMismatchException e) {// if input mismatch Exception then catch by this
			System.out.println(e);
		} catch (Exception e) {// other Exception catch by this
			System.out.println(e);
		}
	}
}
