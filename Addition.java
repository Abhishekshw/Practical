package method;
import java.util.*;
public class Addition {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);//Creating SCanner class
		System.out.println("Enter 1St num");//taking input
		int a=Sc.nextInt();
		System.out.println("Enter 1St num");
		int b=Sc.nextInt();
		Add(a,b);//method calling
	}
public static void Add(int a,int b) {//method creation
	int c=a+b;
	System.out.println(c);//print result
}
}

