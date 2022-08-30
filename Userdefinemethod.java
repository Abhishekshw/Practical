package method;
import java.util.*;
public class Userdefinemethod {

	public static void main(String[] args) {
		// Scanner class creation
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=Sc.nextInt();//taking input
		CheckEvenOdd(num);//method calling
		}

public static void CheckEvenOdd(int num){//creating method
	if(num%2==0)//logic 
		System.out.println(num+" is even");
	else 
		System.out.println(+num + " is odd number");
}
}
