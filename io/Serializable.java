package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class student implements java.io.Serializable {// serializable interface
	int id;
	String name;
	transient int fee;// use it with data member of class in order to avoid serialization

	public student(int id, String name, int fee) {
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
}

public class Serializable {
	public static void main(String[] args) {
		try {
			student s = new student(100, "ABhi", 2045);// object of strudent classs
			FileOutputStream fout = new FileOutputStream("C:\\Users\\as076\\OneDrive\\Desktop\\A.txt");// write in a
																										// file
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			obj.writeObject(s);
			obj.close();
			System.out.println("done");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
