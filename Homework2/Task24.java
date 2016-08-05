import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.println("Please enter a number between 10 and 30000");
			n = sc.nextInt();
		} while (!(n <= 30000 && n >= 10));

		if (n <= 99 && n >= 10) {
			int ones = n % 10;
			int tens = n / 10;
			if (ones == tens) {
				System.out.println(n + " is palindrome");
			} else {
				System.out.println(n + " is not palindrome");
			}
		}
		if (n <= 999 && n >= 100) {
			int ones = n % 10;
			int huns = n / 100;
			if (ones == huns) {
				System.out.println(n + " is palindrome");
			} else {
				System.out.println(n + " is not palindrome");
			}
		}
		if (n <= 9999 && n >= 1000) {
			int ones = n % 10;
			int tens = (n / 10) % 10;
			int huns = (n / 100) % 10;
			int thous = n / 1000;
			if ((ones == thous) && (tens == huns)) {
				System.out.println(n + " is palindrome");
			} else {
				System.out.println(n + " is not palindrome");
			}
		}
		if (n <= 30000 && n >= 10000) {
			int ones = n % 10;
			int tens = (n / 10) % 10;
			int thous = (n / 1000) % 10;
			int thousends = n / 10000;
			if ((ones == thousends) && (tens == thous)) {
				System.out.println(n + " is palindrome");
			} else {
				System.out.println(n + " is not palindrome");
			}
		}

	}

}
