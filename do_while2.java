package loop.dowhile;
import java.util.*;

public class do_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0,num=0;
Scanner sc= new Scanner(System.in);
do {
	sum+=num;
	System.out.println("enter number");
	num=sc.nextInt();

}while(num>0);
System.out.println("sum is"+sum);
	}

}
