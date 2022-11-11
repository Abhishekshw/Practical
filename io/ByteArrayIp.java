package io;

import java.io.ByteArrayInputStream;

public class ByteArrayIp {
	public static void main(String[] args) {
		byte[] ar = { 54, 78, 78, 47, 59, 44, 54 };// byte array

		ByteArrayInputStream ba = new ByteArrayInputStream(ar);// passing byte array in ByteArrayInputStream
		int i = 0;
		while ((i = ba.read()) != -1) {// while loop for read cahr
			char c = ((char) i);
			System.out.println("ascii char :" + i + " , " + " value is : " + c);
		}

	}
}
