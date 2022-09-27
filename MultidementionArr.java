package Array;

public class MultidementionArr {
	public static void main(String[] args) {
//int a[][]=new int [2][3];
//int [][]b=new int [2][3];
int b[][]= {{1,2},{1,5},{8,5}};//declaration of 2D array
for(int i=0;i<3;i++) {//column
	for(int j=0;j<2;j++) {//row
		System.out.print(b[i][j]);
	}
	System.out.println();
	}
}}
