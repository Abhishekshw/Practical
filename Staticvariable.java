
class Staticvariable1 {
	int rollno;
	String name;
	float fee;
	static String collage="FIT";
	
	Staticvariable1(int rollno,String name,float fee ){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
void display() {
	System.out.println(rollno+" "+name+" "+fee+" "+collage);
}
public class Staticvariable { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticvariable1 s1=new Staticvariable1(111,"Abhi",5880);
		Staticvariable1 s2=new Staticvariable1(121,"Abhishek",5850);
		s1.display();
		s2.display();
	}}}


