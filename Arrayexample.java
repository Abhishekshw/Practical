package Array;
//return an array from a method
public class Arrayexample {//creating method which return the array
	static int[] printarray() {
return new int[]{20,55,56,78,22};//Anonymous array
}
public static void main(String[] args) {
	int array[]=printarray();//method calling
	for(int i=0;i<array.length;i++) {//Traversing array
		System.out.println(array[i]);
	}
}

}