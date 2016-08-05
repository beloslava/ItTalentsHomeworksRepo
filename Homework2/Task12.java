
public class Task12 {

	public static void main(String[] args) {

		for (int x = 100; x <= 999; x++) {
			int ones = x % 10;
			int tens = (x / 10) % 10;
			int huns = x / 100;

			if (!(ones == tens || ones == huns || tens == huns)) {
				System.out.println(x);
			}

		}

	}

}
