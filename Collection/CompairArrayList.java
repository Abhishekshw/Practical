package Collection;

import java.util.ArrayList;
import java.util.Collections;

class CompairArrayList {
	public static Boolean compareList(ArrayList al2, ArrayList al3) {
		return al2.toString().contentEquals(al3.toString()) ? true : false;// logic to chgange array to string
	}

	public static void main(String[] args) {
		ArrayList<String> all = new ArrayList<String>();/// non generic
		// adding element in arratlist
		all.add("rose");
		all.add("Sunflowe");
		all.add("jasmin");
		all.add("lotus");
		all.add("rose");
		all.add("orchid");
		ArrayList<String> al1 = new ArrayList<String>();// new array list
		al1.add("rose");// adding element in arratlist
		all.add("ram");
		al1.add("Sunflowe");
		al1.add("jasmin");
		al1.add("lotus");
		al1.add("rose");
		al1.add("orchid");
		System.out.println(compareList(all, al1));
		// al1.add("Ram");
		// al1.add("Shyam");
		// al1.add("Laxman");
		// al1.add("Wasudev");
		// al1.add("krisna");
		Collections.reverse(al1);// reverse rthe array lkist
		System.out.println(al1);
		System.out.println("using comapire method " + all.equals(al1));// copairing arraylist
		System.out.println("using remove all " + all.removeAll(al1));
		System.out.println("Using Containt equals " + all.containsAll(al1));
		System.out.println("Using retainall " + all.retainAll(al1));
		System.out.println("Using Arraylist.contanins " + all.contains(al1));

	}
}
