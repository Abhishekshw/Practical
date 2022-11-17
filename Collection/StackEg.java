package Collection.linklist;

import java.util.Stack;//importing stack

public class StackEg {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();// creating obj of Stack
		System.out.println("STACK IS EMPTY " + s.isEmpty());// cheking Stack is empty or not
		s.push(25);// Adding Element in Stack
		s.push(35);
		s.push(45);
		s.push(55);
		s.push(65);
		s.push(75);
		System.out.println("stack element is " + s);
		Integer digit = s.peek();// view Top Element
		Integer digit2 = s.pop();// view Top Element
		System.out.println("top element " + digit);
		System.out.println("top element " + digit2);
		int digit1 = s.search(35);// Searching For 35 index
		System.out.println("search element " + digit1);
		int x = s.size();// Size of Stack
		System.out.println("size is " + x);
		System.out.println("is empty " + s.empty());
	}
}
