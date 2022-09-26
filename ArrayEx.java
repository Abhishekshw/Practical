package Array;

public class ArrayEx {
	public static void main(String[] args) {
		/*int a[]=new int [3];//declaration array And object creation
		//initialization
		a[0]=10;
		a[1]=3;
		a[2]=5;*/
		int a[]= {10,3,5};//Initialized declaration And object creation
		//traversing array
		for(int i=0;i<a.length;i++) 
			System.out.println(a[i]);
			//traversing array using foe each loop
			for(int i:a)
			System.out.println(i);
		}


}
