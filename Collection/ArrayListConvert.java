package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConvert {
	public static void main(String[] args) {

		ArrayList<String> all = new ArrayList<String>();
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
		System.out.println("list to array");
		String arr[] = all.toArray(new String[all.size()]);// list to array
		for (String s : arr) {
			System.out.print(" " + s);
		}
		// array to list
		System.out.println("Array to lis");
		List<String> A = new ArrayList<String>();
		A = Arrays.asList(arr);
		System.out.println(all);
	}
}
