package construtor;
 class Staticmethod1 {
	 int rollno;
		String name;
		float fee;
		static String collage="FIT";
		static void change() {
			collage="SNA";
		}
		Staticmethod1(int rollno,String name,float fee ){
			this.rollno=rollno;
			this.name=name;
			this.fee=fee;
		}
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+collage);
	}}
	public class Staticmethod { 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Staticmethod1.change();
			Staticmethod1 s1=new Staticmethod1(111,"Abhi",5880);
			Staticmethod1 s2=new Staticmethod1(121,"Abhiek",5850);
			s1.display();
			s2.display();
		}}
	 


