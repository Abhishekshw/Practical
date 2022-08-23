package switch_break;

public class Day_string {

	public static void main(String[] args) {
		int day=7;
		String daystring="";
		switch(day) {
		case 1: daystring="1-sunday";
		break;
		case 2: daystring="2-monday";
		break;
		case 3: daystring="3-tuesday";
		break;
		case 4: daystring="4-wednesday";
		break;
		case 5: daystring="5-thrusday";
		break;
		case 6: daystring="6-friday";
		break;
		case 7: daystring="7-saturday";
		break;
		default: System.out.println("invalid day");
		}
		// TODO Auto-generated method stub
		System.out.println(daystring);

	}

}
