package io;

import java.io.FileOutputStream;

public class WriteByteSos {
	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream("C:\\Users\\as076\\OneDrive\\Desktop\\New folder\\java.txt");
			/*
			 * f.write(67); f.close(); System.out.println("done");// comment
			 */
//write String
			String s = "welcome abhishek";
			byte b[] = s.getBytes();// converting String to byte
			f.write(b);
			f.close();
			System.out.println("done 2");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
