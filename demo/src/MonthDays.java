
public class MonthDays {

	public static void main(String[] args) {

		int month = 4, nodays;

		switch (month) {

		case 2:
			nodays = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			nodays = 30;
			break;
		default:
			nodays = 31;

		}

		nodays = switch (month) {
     		case 2 -> 28;
	    	case 4, 6, 9, 11 -> 30;
  	    	default -> 31;
		};

		System.out.println(nodays);

	}

}
