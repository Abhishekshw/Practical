package Thread.Assi;

import java.util.ArrayList;
import java.util.Scanner;

class ArrayStore extends Thread {
	ArrayList<String> A = new ArrayList<String>();
	Scanner s = new Scanner(System.in);

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("enter the String");
			String str = s.nextLine();
			A.add(str);
		}

		{
			System.out.println(A);
		}
	}

}

public class StringList {
	public static void main(String[] args) {
		ArrayStore A1 = new ArrayStore();
		A1.start();

	}
}
