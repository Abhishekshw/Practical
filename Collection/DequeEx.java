package Collection.linklist;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("Ram");
		dq.add("Shyam");
		dq.add("GhanShyam");
		dq.add("Ravan");
		for (String a : dq) {
			System.out.println(a);
		}
		dq.addFirst("Suta");
		dq.addLast("Barat");
		System.out.println("new list--------------------------------");
		for (String a : dq) {
			System.out.println(a);
		}
		dq.removeFirst();
		dq.removeLast();
		System.out.println("After removing list---------------------");
		for (String a : dq) {
			System.out.println(a);
		}
	}
}
