import java.util.Scanner;

public class Task11Extra {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number of rows");
		int rows = sc.nextInt();
		int spaces = 1;

		for (int row = 1; row <= rows; row++) {
			for (int i = 1; i <= rows - row; i++) {
				System.out.print(" ");
			}
			if (row == 1) {
				System.out.print("*");
				System.out.println();
			} else if (row == rows) {
				for (int j = 1; j <= rows; j++) {
					System.out.print("* ");
				}
			} else {
				System.out.print("*");
				for (int j = 1; j <= spaces; j++) {
					System.out.print(" ");

				}
				System.out.print("*");
				System.out.println();
				spaces += 2;
			}
		}

	}

}
