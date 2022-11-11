package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//copy file Example
public class CopyWExample {
	public static void main(String[] args) {
		try {
			FileInputStream In = new FileInputStream("C:\\Users\\as076\\OneDrive\\Desktop\\java.txt");// file which need
																										// to copy
			FileOutputStream out = new FileOutputStream("C:\\Users\\as076\\OneDrive\\Desktop\\java1.txt");// copied file
			byte[] arr = new byte[1024];// creating byte arrays
			int i;
			while ((i = In.read(arr)) > 0) {
				out.write(arr);
			}
			In.close();
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
