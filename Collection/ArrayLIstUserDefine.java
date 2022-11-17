package Collection;

import java.util.ArrayList;
import java.util.Iterator;

class Bank {// creating bank class
	long Acno;
	String CName;
	double balance;
	int Age;

	Bank(long Acno, String CName, double balance, int Age) {// paremeterised cons
		this.Acno = Acno;
		this.CName = CName;
		this.balance = balance;
		this.Age = Age;
	}
}

public class ArrayLIstUserDefine {
	public static void main(String[] args) {
		Bank b = new Bank(12345, "mamta", 5744.3, 25);// paiisng value in constructor
		Bank b1 = new Bank(12346, "salu", 5874.3, 28);// paiisng value in constructor
		Bank b2 = new Bank(12347, "bharti", 8544.3, 15);// paiisng value in constructor
		Bank b3 = new Bank(12348, "jaya", 52514.3, 85);// paiisng value in constructor
		Bank b4 = new Bank(12349, "susma", 51257.3, 95);// paiisng value in constructor
		Bank b5 = new Bank(12350, "nirma", 57456, 65);// paiisng value in constructor
		ArrayList<Bank> al = new ArrayList<Bank>();// arraylist objecct
		al.add(b);// adding elements
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(b5);
		Iterator itr = al.iterator();// Iterator object
		while (itr.hasNext()) {// view the array list
			Bank obj = (Bank) itr.next();
			System.out.println("Ac number is " + obj.Acno + "  name is " + obj.CName + " balance " + obj.balance
					+ " age is " + obj.Age);
		}

	}
}
