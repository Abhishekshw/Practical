package Exeption;

//invoke method on null pointer
public class Nullpointer {
	public static Nullpointer inti() {
		return null;
	}

	String str = null;// String valur null
	int arr[] = null;// array obj null

	String convert(String S) {
		return S.toUpperCase();

	}

	public static void main(String[] args) {
		Nullpointer obj = new Nullpointer();
		// nullponter obj=new Nllpointerram();
		System.out.println(obj.convert(null));// through method passing argument as null
		System.out.println(obj.arr.length);
		System.out.println(obj.equals("abhi"));
		// System.out.println(obj.a);
	}
}
