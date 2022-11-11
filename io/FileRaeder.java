package io;

import java.io.FileReader;

public class FileRaeder {
	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("C:\\Users\\as076\\OneDrive\\Desktop\\java.txt");// file reader
			int i;
			while ((i = f.read()) != -1) {// raeding file
				System.out.println((char) i);
			}
			f.close();
			System.out.println("done");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
