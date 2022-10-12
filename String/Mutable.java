package String;

//append,insert,replace,delete,reverse(String builder,string buffer)
public class Mutable {
	public static void my() {
		StringBuffer s = new StringBuffer("hello");// string builser with hello
		s.append("god");// adding god with hello
		System.out.println("String is :" + s);
		s.insert(2, "abhi");// inserting abhi in 2nd index
		System.out.println("insert is " + s);
		s.replace(2, 5, "ram");// replayong 2nd indedx to 5
		System.out.println("replace is :" + s);
		System.out.println("thr capacfity is " + s.capacity());// cheking capacity
		StringBuilder s1 = new StringBuilder("world");// crteting Stringbuilder world
		s1.replace(1, 3, "love");// replacing index 1 to 3
		System.out.println("replace  is :" + s1);
		s1.delete(1, 04);// deleting 1 to 3 index
		System.out.println("delete is :" + s1);
		s1.reverse();// ewvwersing thew string
		System.out.println("reverse  is :" + s1);

	}

	public static void main(String[] args) {
		my();
	}
}
