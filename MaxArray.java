package Array;
//max of array
public class MaxArray {
	 public static int largeno(int[] a) {//method to get max of array
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}return max;
	}
	public static void main(String[] args) {
		int a[]= { 10,20,658,54,52};//Declaring array 
System.out.println(largeno(a));


	}
}
