package inheritance;

public class Overridingex {//parent class
int marks() {//method 
	return 0;
}
}
class Computer extends Overridingex{//child of parent class
	int marks() {//over ride method 1
		return 80;
	}
}
class Math extends Overridingex{//2nd child of parent class
	int marks() {//over ride method 1
		return 70;
	}}
class Science extends Overridingex{//3 rd child of parent class
	int marks() {//over ride method 1
		return 50;
	}}
class Eng extends Overridingex{//4th child of parent class
	int marks() {//over ride method 1
		return 90;
	}
	public static void main(String []args) {
		Computer c=new Computer();
		Math m=new Math();
		Science s=new Science();
		Eng e=new Eng();
		System.out.println("computer marks is"+c.marks());
		System.out.println("math marks is"+m.marks());
		s.marks();
		e.marks();
		
		
}}
