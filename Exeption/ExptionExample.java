package Exeption;

public class ExptionExample {
	public void show() {
		String a = "i am error";
		System.out.println(a);
		try {
			// int i = 50 / 0;//arithmetic exeption
			// System.out.println(i);
			String s = "Riya";
			System.out.println(s.length());
			/*
			 * int arr[] = new int[3]; arr[4] = 24;
			 */// Array index out Of bound exeption
			int m = Integer.parseInt(s);// NumberFormatException:
			System.out.println(m);
		} catch (Exception e) {
			System.out.println(e);
		}
		String b = "i cannot be handle";
		System.out.println(a + " " + b);// i am error + i cant be handeled
	}

	public static void main(String[] args) {
		ExptionExample op = new ExptionExample();
		op.show();
	}
}
