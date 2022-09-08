package construtor;

public class Defaultcon {// method default value
	int age;
	String name;
	void show() {//method to display age and name
		System.out.println(age+ " "+name);
	}
	public static void main(String[] args) {
		Defaultcon d=new Defaultcon();//object 1
		Defaultcon d1=new Defaultcon();//  object 1
		d.show();//method call
		d1.show();//method call
		
	}

}
