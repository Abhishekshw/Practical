package String;

//represent any object to string
public class Hascode {
	int roll_no;// int type vereiable
	String name, Add;// String

	Hascode(int roll_no, String name, String Add) {// parameterized construtor
		this.roll_no = roll_no;
		this.name = name;
		this.Add = Add;
	}

	public String toStrng() {// return object string
		// return super.toString();//this is return hascode
		return roll_no + " " + name + " " + Add;
	}

	public static void main(String[] args) {
		Hascode s1 = new Hascode(1, "ram", "mumbai");
		Hascode s2 = new Hascode(2, "abhi", "kolkata");
		System.out.println(s1);
		System.out.println(s2);

	}
}
