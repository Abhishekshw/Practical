package Collection.linklist;

import java.util.Vector;//importing vector

public class vectorEg {

	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>(4);// creating objecct of Vector
		vc.add("dog");// Adding obj in vector
		vc.add("cat");
		vc.add(0, "tiger");
		vc.add("lion");

		System.out.println("Size :" + vc.size());// cheking Size
		System.out.println("capacity :" + vc.capacity());// cheking Size
		vc.addElement("cow");// adding more element
		vc.addElement("goad");
		System.out.println("after addinmg the element");
		System.out.println("Size :" + vc.size());// new Size
		System.out.println("capacity :" + vc.capacity());// new capacity
		System.out.println(vc);
		if (vc.contains("cat")) {// cjekinmg Avaiable or not
			System.out.println("cat avaible");
		} else {
			System.out.println("cat not vaible");
		}
		System.out.println("Frist eliment " + vc.firstElement());// First element of vector
		System.out.println("last  eliment " + vc.lastElement());// last element of vectoe
		System.out.println("index :" + vc.indexOf("cat"));// cheking index of a element
	}
}
