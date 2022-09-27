package Array;
//to get class name of array
public class ClassNameArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3};//declaration & initialization of array
		Class c=arr.getClass();//getting class name
		String name=c.getName();
		System.out.println(c);//print the class name
		
	}

}
