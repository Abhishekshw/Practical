package String;

import java.util.StringTokenizer;//importing tokenizer 

public class StringTokenzer {
	public static void my() {// my method
		StringTokenizer t = new StringTokenizer("Anudip foundation Skill and carree development center");
		while (t.hasMoreTokens()) {// bollean method check if there is more token avaible or not
			System.out.println(t.nextToken(" "));
		}

		StringTokenizer ts = new StringTokenizer("I am Abhishek, from fit");
		while (ts.hasMoreTokens()) {
			System.out.println(ts.nextToken(","));
		}

	}

	public static void main(String[] args) {
		my();
	}
}
