package Array;
//Anonymous array in java
public class Anonymous {
public static void main(String[] args) {
	display(new int [] {10,20,30,40,50});}// passing Anonymous array
//creating a method which receives an array as parameter
	static void display(int arr[]) {
		//no need to declare the array while passing an array to the method
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	
}
}
