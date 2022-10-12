package String;

import java.util.Scanner;

public class Stringtest {
	void show() {// method
		Scanner S = new Scanner(System.in);
		System.out.println("enter String");
		String A = S.next();// 1st string
		String B = S.next();// 2nd string
		System.out.println(A.length() + B.length());// total of both string length
		System.out.println(A.compareTo(B) > 0 ? "yes" : "no");// compareing values
		System.out.println(A.substring(0, 4).toLowerCase() + A.substring(2) + " " + B.substring(0, 1).toUpperCase()
				+ B.substring(1));
	}// methods of subString java

	public static void main(String[] args) {
		Stringtest obj = new Stringtest();
		obj.show();
	}

}
