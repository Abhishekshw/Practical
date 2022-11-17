package Collection;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();// object of array list
		al.add(null);
		al.add("abhi");
		al.add("sharma");
		al.add(2, "cat");
		al.add("bhavna");
		al.add("subo");
		al.add(1, "shekhar");
		al.add("me");
		al.add(5, "kilker");
		al.add("no");
		System.out.println(al);// view arraylist
		System.out.println("size of array list: " + al.size());// get size of arraylist
		System.out.println("element of index value " + al.get(4));// get indec wise eliments
		al.remove(2);// remove element by index
		System.out.println(al);
		System.out.println("size of al " + al.size());
	}
}
