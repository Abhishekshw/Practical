package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

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

public class ObjectIbputegSR {
	public static void main(String[] args) {
		try {
			ObjectInputStream oi = new ObjectInputStream(
					new FileInputStream("C:\\Users\\as076\\OneDrive\\Desktop\\A.txt"));
			student s = (student) oi.readObject();
			System.out.println("id is : " + s.id + " name is " + s.name + " fee is :" + s.fee);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
