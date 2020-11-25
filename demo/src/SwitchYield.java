
public class SwitchYield {

	public static void main(String[] args) {

		int code = 1;
		int qty = 10;
		int disrate;

		disrate = switch (code) {
		case 1:
			if (qty > 5)
				yield 20;
			else
				yield 10;
		case 2, 3, 4:
			if (qty > 10)
				yield 20;
			else
				yield 10;
		default:
			yield 5;
		};

	}

}
