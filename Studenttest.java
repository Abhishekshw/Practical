package Object_creation;
 
class Studenttest{
	
	//field
			int age;
			String name;
}
class student{
	public static void main(String []args) {//main method
		Studenttest sc=new Studenttest();//object creation
		
		System.out.println(sc.age);//print line
		System.out.println(sc.name);
	}
}

