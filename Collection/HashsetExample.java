package Collection.linklist;

import java.util.HashSet;

public class HashsetExample {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("pen");
		hs.add("pencil");
		hs.add("hoursh");
		hs.add("cal");
		hs.add("ram");
		hs.add(null);
		hs.add("Ac");
		hs.add("Ac");
		System.out.println(hs);
		hs.remove("ram");
		System.out.println("updated list " + hs);// after remove ram
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Abhi");
		hs1.add("Abhi1");
		System.out.println("updated list  hs" + hs);
		hs.addAll(hs1);
		System.out.println("updated list hs1" + hs1);
		hs.removeAll(hs1);
		hs.clear();
		System.out.println("present list " + hs);
	}
}
