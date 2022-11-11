package io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWRitter {
	public static void main(String[] args) {
		try {
			FileWriter f = new FileWriter("C:\\Users\\as076\\OneDrive\\Desktop\\java.txt");
			f.write("Hello World java");// msg which want to write
			FileReader fr = new FileReader("C:\\\\Users\\\\as076\\\\OneDrive\\\\Desktop\\\\java.txt");
			int i = 0;
			while ((i = fr.read()) != -1) {
				System.out.println((char) i);

			}
			System.out.println("done");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
