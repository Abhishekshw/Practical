package Object_creation;
class Objectmethod1{//object class
	int age;
   String name; 
}
class Objmethod1{// main class
	public static void main(String []args) {
		Objectmethod1 A=new Objectmethod1();//object create
		Objectmethod1 B=new Objectmethod1();
		Objectmethod1 C=new Objectmethod1();
		A.age=25;//values enter
		A.name="Shekhar";
		B.age=26;
		B.name="Sharma";
		C.age=29;
		C.name="Shaw";
		System.out.println(A.age+"  "+A.name);//print
		System.out.println(B.age+"  "+B.name);
		System.out.println(C.age+"  "+C.name);
	}
}


