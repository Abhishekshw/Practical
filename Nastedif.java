package control_statment;

public class Nastedif {

	public static void main(String[] args) {
		 int year =7;	// total years of service
		 int sal= 5000;// variable to store emp salary.
		 System.out.println("Enter total Years of services=7   ");
		  
		
		 
		 if(year>5)
		 {
			 System.out.println("Congrats..YES..! your total year of services more than 5 years> ");
			 
			 System.out.println("YOUR SALARY IS= "+sal);
			 System.out.println("YOUR 5% BONUS  IS= "+sal*0.05);
			 System.out.println("YOUR NET BONUS WITH SALARY IS= "+(sal+(sal*0.05)));
		  }
		 
		 else
		 {
			 System.out.println("NO BONUS..");
		 }
	}
}

		