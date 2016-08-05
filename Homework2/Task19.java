import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum;

		do {
			System.out.println("Enter a number between 10 and 99");
			sum = sc.nextInt();
		} while (!(sum >= 10 && sum <= 99));

		while (sum != 1) {

			if (sum % 2 == 0) {
				sum = sum / 2;
			} else {
				sum = (sum * 3) + 1;
			}
			System.out.print(sum + ", ");
		}

	}

}
