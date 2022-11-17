package Collection;

import java.util.ArrayList;//importring pakage
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistTraversing {
	public static void main(String[] args) {

		ArrayList<String> all = new ArrayList<String>();// object off list
		all.add("g");
		all.add("abhi");
		all.add("sharma");
		all.add(2, "cat");
		all.add("bhavna");
		all.add("subo");
		all.add(1, "shekhar");
		all.add("me");
		all.add(5, "kilker");
		all.add("no");
		System.out.print("traversing using for loop");// traversing using for loop
		for (int i = 0; i < all.size(); i++) {
			System.out.println(all.get(i));
		}
		System.out.print("traversing using each for loop");// traversing using for each loop
		for (String a : all) {
			System.out.println(a);
		}
		System.out.print("traversing using iterator");// traversing using for iterator
		Iterator itr = new all.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.print("traversing using forward iterator");// traversing using forward iterator
		ListIterator<String> itr1 = all.listIterator();
		while (itr1.hasNext()) {
			System.out.print(itr1.next());
		}
		System.out.println("traversing using backward iterator");// traversing using backward iterator
		ListIterator<String> itr2 = all.listIterator(all.size());
		while (itr1.hasPrevious()) {
			System.out.print(itr2.previous());
		}
	}
}
