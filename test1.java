package control_statment;
import java.util.*;
	
public class test1 {
	

		   public static void main(String[] args) {
			   int n=2;
Scanner sc=new Scanner(System.in);
		   System.out.println("enter no");    
 
n= sc.nextInt();
if(n%2==0)
{
	System.out.println("not ok");
	if(n>100){
	System.out.println("ok");
	}
	}
else {
	if(n>5&&n<10) {
		System.out.println("not ok");
	}
	else if(n>11&&n<101) {
		System.out.println(" ok");
	}
	else if (n>100) {
		System.out.println("x>100");
	}
	
	
}

		   }

		      }
