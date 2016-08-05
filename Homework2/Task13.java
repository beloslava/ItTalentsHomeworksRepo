import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum;

		do {
			System.out.println("Please enter a number between 2 and 27");
			sum = sc.nextInt();
		} while (!(sum <= 27 && sum >= 2));

		for (int x = 100; x <= 999; x++) {
			int ones = x % 10;
			int tens = (x / 10) % 10;
			int huns = x / 100;
			if ((ones + tens + huns) == sum) {
				System.out.print(x + ", ");
			}
		}

	}

}
