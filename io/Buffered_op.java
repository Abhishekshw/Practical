package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Buffered_op {
	public static void main(String[] args) {
		try {
			FileOutputStream F = new FileOutputStream("C:\\Users\\as076\\OneDrive\\Desktop\\New folder\\java3.txt");// location
																													// of
																													// file
																													// passing
																													// in
																													// file
																													// output
																													// string
			BufferedOutputStream bos = new BufferedOutputStream(F);
			String s = "i am abhishek";// string
			byte b[] = s.getBytes();// converting string to byte
			F.write(b);// writing in file
			F.close();
		} catch (Exception e) {
			System.out.println("e");
		}
	}
}
