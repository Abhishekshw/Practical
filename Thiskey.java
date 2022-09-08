package construtor;

class Thiskey1 {

		int rollno;
		String name;
		 //String collage="Fit";
		float fee;
		Thiskey1(int rollno,String name, float fee){
			this.rollno=rollno;
			this.name=name;
			this.fee=fee;
		}
	 	void display() {
			System.out.println(rollno+" "+name+" "+fee);
		}}
	class Thiskey{
			public static void main(String[] args) {
			Thiskey1 s1=new Thiskey1(111,"Abhi",5000);
			Thiskey1 s2=new Thiskey1(545,"Sh",5220);
		
		
			// TODO Auto-generated method stub
	s1.display();
	s2.display();	}}


