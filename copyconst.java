package construtor;

public class copyconst {
	//variable along with datatype
int age;
String name;
//construtor & intialized
copyconst(int a,String n){//con creation
	age =a;
	name=n;
}
/*copyconst(copyconst c){
	age =c.age;
	name=c.name;
}*/
//method
copyconst(){}//cons 2
void show() {
	System.out.println(age+" "+name);}

public static void main(String[] args) {
	copyconst c1=new copyconst(22,"Abhi");//passing value
	copyconst c2=new copyconst();
	c2.age=c1.age;// copying value
	c2.name=c1.name;
	c1.show();
	c2.show();
		// TODO Auto-generated method stub bhai call pe hu \\nhi ok

	}

}
