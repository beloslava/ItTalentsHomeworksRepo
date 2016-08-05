import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Please enter a number between 1 and 999");
			n = sc.nextInt();
		} while (!(n >= 1 && n <= 999));

		int i = 1;
		while (i <= 10) {

			if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
				System.out.print(i + ":" + n + " ");
				i++;
			}
			n++;
		}

	}

}
