import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		int b;

		do {
			System.out.println("Enter number A");
			a = sc.nextInt();
			System.out.println("Enter number B");
			b = sc.nextInt();
		} while (!(a < b));

		int sum = 0;

		for (int i = a; i <= b; i++) {

			if (i % 3 == 0) {
				System.out.print("skip " + i * i + ", ");
			} else {
				System.out.print(i * i + ", ");
			}
			sum = sum + i * i;
			if (sum > 200) {
				break;
			}
		}

	}

}
