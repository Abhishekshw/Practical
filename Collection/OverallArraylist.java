package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;//arraylist implements list interface,extends abstract list

public class OverallArraylist {

	public static void main(String[] args) {
		List al = new ArrayList();/// non generic
		List<String> all = new ArrayList<String>();/// non generic
		// adding element in arratlist
		all.add("rose");
		all.add("Sunflowe");
		all.add("jasmin");
		all.add("lotus");
		all.add("rose");
		all.add("orchid");
		// System.out.println("get the eliments " + all.get(1));//acess the elemnet by
		// index number
		all.set(1, "tulip");// adding in specific postion
		// for (String flower : all) {
		// System.out.println(flower);

		// }
		Collections.sort(all);// for shorting
		for (String flower : all) {
			System.out.println(flower);

		}
		List<Integer> al1 = new ArrayList<Integer>();// new arraylist
		al1.add(15);
		al1.add(20);
		al1.add(25);
		al1.add(30);
		Collections.sort(al1);// for shorting
		System.out.println(al1);
		System.out.println(all.isEmpty());// cheking empty or not
		System.out.println(all.retainAll(al1));

	}
}
