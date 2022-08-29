package loop.dowhile;

import java.util.Scanner;

public class while2 {
	public static void main(String []Abhishek) {
		int sum=0;
		
		Scanner sc=new Scanner(System.in);//scannerclass
		System.out.println("enter the number");		
		int num=sc.nextInt();
		while(num>=0) {
			sum+=num;
			System.out.println(" enter number");
			 num=sc.nextInt();
		}System.out.println("sum is"+sum);
		sc.close();
	}

}
