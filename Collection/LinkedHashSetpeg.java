package Collection.linklist;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetpeg {
	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("pen");
		hs.add("pencil");
		hs.add("hoursh");
		hs.add("cal");
		hs.add("ram");
		hs.add(null);
		hs.add("Ac");
		hs.add("Ac");
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
