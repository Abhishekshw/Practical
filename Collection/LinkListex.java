package Collection.linklist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListex {
	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();// link list
		li.add("Abhishek");// add for element in list
		li.add("Arnav");
		li.add("Aksh");
		li.add("amit");
		li.add(1, "Saroj");
		LinkedList<String> li2 = new LinkedList<String>();// link list 2
		li2.addAll(li);// Coping All element to li to li2
		System.out.println(li2);
		li2.addAll(1, li);// All inserting in index 1
		System.out.println(li2);
		li2.addFirst("radf");// adding in Frist position
		System.out.println(li2);
		li2.addLast("ho");// adding in last position
		System.out.println(li2);
		li2.remove(1);// removing by index number
		System.out.println(li2);
		li.removeAll(li2);
		li.add("Abhishek");// add for element in list
		li.add("Arnav");
		li.add("Aksh");
		li.add("amit");
		li.add(1, "Saroj");

		System.out.println(li);
		li.removeFirst();// remove frist element
		System.out.println(li);
		li.removeLast();// remove last element
		System.out.println(li);
		li.removeFirstOccurrence("Abhi");// removing Frist Occurance of given element
		System.out.println(li);
		li.removeLastOccurrence("Abhi");// removing Frist Occurance of given element
		System.out.println(li);
		Iterator<String> itr1 = li.descendingIterator();// view in reverse direction
		while (itr1.hasNext()) {

			System.out.println(itr1.next());
		}
		System.out.println();
		Iterator<String> itr = li.iterator();// view linklist
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
	}
}
