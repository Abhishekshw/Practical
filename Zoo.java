package poly;
//runtime poly
 class Zoo1 {
	 int a=10;
void bark() {
	System.out.println("barking");
}
}
class Cat extends Zoo1{
int a=20;
	void bark(){
		System.out.println("meow");
		}
}
class Dog extends Zoo1{
	void bark(){
		System.out.println("baff");
		}
}
class Zoo{
	public static void main(String []args) {
		//reffrence veriable of parent class with the child class object
		Zoo1 Z;
		Z=new Cat();
		Z.bark();
		System.out.println(Z.a);
		 Z=new Dog();
		 Z.bark();
		 Z=new Zoo1();
		 Z.bark();
		 }
}
