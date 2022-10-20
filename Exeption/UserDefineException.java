package Exeption;

//under the throwable class user define exeption
class UserDefineException1 extends Exception {// parent exception
	public UserDefineException1(String str) {
		super(str);// call the exception
	}
}

public class UserDefineException {
	public static void main(String[] args) {
		try {
			throw new UserDefineException1("user defined exception");
		} catch (UserDefineException1 u) {
			System.out.println("got the eception");
			System.out.println(u.getMessage());
		}
	}

}
