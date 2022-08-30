package construtor;

public class Parameterizedcons {
	int age;
	String name;
	Parameterizedcons (int a,String n)
	{
		age=a;
		name= n;
	}
	void show() {//method to display age and name
		System.out.println(age+ " "+name);
	}
	public static void main(String[] args) {
		Parameterizedcons d=new Parameterizedcons(50,"ram");
		Parameterizedcons d1=new Parameterizedcons(25,"laxman");
		d.show();
		d1.show();

}
}
