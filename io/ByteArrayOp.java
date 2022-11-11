package io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOp {
	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream(
					"C:\\\\Users\\\\as076\\\\OneDrive\\\\Desktop\\\\New folder\\\\java3.txt");// file location passing
																								// in FileOutputStram
			FileOutputStream f1 = new FileOutputStream(
					"C:\\\\Users\\\\as076\\\\OneDrive\\\\Desktop\\\\New folder\\\\java3.txt");// file location passing
																								// in FileOutputStream
			ByteArrayOutputStream b = new ByteArrayOutputStream();
			b.write(65);
			b.writeTo(f);
			b.writeTo(f1);
			b.close();
			System.out.println("done");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
