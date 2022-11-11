package io;

import java.io.FileInputStream;

public class WriteByteFis {
	public static void main(String[] args) {
		try {
			FileInputStream F = new FileInputStream("C:\\Users\\as076\\OneDrive\\Desktop\\New folder\\java1.txt");
			// read single chararcter
			// int i = F.read();
			// System.out.println((char) i);
			// F.close();
			// read all file
			int i = 0;
			while ((i = F.read()) != -1) {
				System.out.print((char) i);// conver it into character

			}
		} catch (

		Exception e) {
			System.out.println(e);
		}
	}
}
