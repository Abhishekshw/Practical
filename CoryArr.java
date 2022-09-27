package Array;

public class CoryArr {
public static void main(String[] args) {
	char c[]= {'a','b','c','d','e','f','g','h'};//array 
	char []d=new char[7];
	System.arraycopy(c, 0, d, 0, 7);//c is copy from d is copy to
	System.out.println(String.valueOf(d));
}
}
