package construtor;

public class Defaultcon {// method default value
	int age;
	String name;
	void show() {//method to display age and name
		System.out.println(age+ " "+name);
	}
	public static void main(String[] args) {
		Defaultcon d=new Defaultcon();
		Defaultcon d1=new Defaultcon();
		d.show();
		d1.show();
		
	}

}
