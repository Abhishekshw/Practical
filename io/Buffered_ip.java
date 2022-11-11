package io;

//importing pakkage of buffer input stream
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Buffered_ip {
	public static void main(String[] args) {
		try {
			FileInputStream F = new FileInputStream("C:\\Users\\as076\\OneDrive\\Desktop\\New folder\\java3.txt");// file
																													// directry
			BufferedInputStream b = new BufferedInputStream(F);// object of buffer input stream
			int i = 0;
			while ((i = b.read()) != -1) {
				F.close();
				b.close();
				System.out.println("done");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
