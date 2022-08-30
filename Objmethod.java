package Object_creation;
public class Objmethod {
	int age;
	String name;
	void input(int a, String n) {//insert reacord method
		age=a;
		name=n;}
	void display() {// display method
		System.out.println(age+" "+name);
	}}
class objectmeth{//initialisized obj by reff
	public static void main(String []args) {
	Objmethod obj1= new Objmethod();
	Objmethod obj2= new Objmethod();
	obj1.input(14,"ram");//input
	obj2.input(12,"laxman");
	obj1.display();//print 
	obj2.display();
}}