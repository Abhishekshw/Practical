package Collection.linklist;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityqueEx {
	public static void main(String[] args) {
		PriorityQueue<String> Pq = new PriorityQueue<String>();
		Pq.add("Akash");
		Pq.add("Abhi");
		Pq.add("Ram");
		Pq.add("Lakhan");
		Pq.add("Shyam");
		Pq.add("Akaash");
		System.out.println(Pq);
		System.out.println("head :" + Pq.element());
		System.out.println("head :" + Pq.peek());
		System.out.println("iretataing loop");
		Iterator itr = Pq.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		Pq.remove();
		Pq.poll();
		System.out.println("after removing ");
		Iterator<String> itr1 = Pq.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
