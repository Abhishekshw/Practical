package Overloading;

public class Typepermotion {//class 
	void add(int a,int b) {//method 1
		System.out.println( a+b); }
	void add(long a,long b) {//method 2
		System.out.println( a+b); }
	public static void main(String []args) {
		Typepermotion obj=new Typepermotion();
		obj.add(2, 3);
	}
}
