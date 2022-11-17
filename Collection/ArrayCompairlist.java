package Collection;

import java.util.ArrayList;//importing Arraylist pakage

public class ArrayCompairlist {
	public static void main(String[] args) {// main method
		ArrayList<String> al = new ArrayList<String>();// Arraylist object
		al.add(null);// .add method use for adding element in array list
		al.add("abhi");
		al.add("sharma");
		al.add(2, "cat");// we can adding adding element in specified position
		al.add("bhavna");
		al.add("subo");
		al.add(1, "shekhar");
		al.add("me");
		al.add(5, "kilker");
		al.add("no");
		System.out.println(al);
		ArrayList<String> all = new ArrayList<String>();// new array object
		all.add(null);
		all.add("abhi");
		all.add("sharma");
		all.add(2, "cat");
		all.add("bhavna");
		all.add("subo");
		all.add(1, "shekhar");
		all.add("me");
		all.add(5, "kilker");
		all.add("no");

		System.out.println(all);
		boolean b = al.equals(all);// cheking equal or not
		System.out.println(b);
		all.add("ha");
		boolean c = al.equals(all);// after update cheking condition
		System.out.println(c);
	}
}
