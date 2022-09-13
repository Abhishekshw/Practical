package inheritance;

public class Student_hasa {
int id;
String name;
Address_hasa Add ;
public Student_hasa (int id,String name,Address_hasa Add ) {
	this.id=id;
	this.name=name;
	this.Add=Add;
	}
void show(){
	System.out.println(id+ " "+name);
	System.out.println(Add.city+" "+Add.state+" "+Add.country+" "+Add.area);
}
public static void main(String []args) {
	Address_hasa ad=new Address_hasa("kol","west bengal","india","barrackpore");
	Student_hasa Sd=new Student_hasa(98,"Abhi",ad);
	Sd.show();
	
}
}
