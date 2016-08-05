import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.println("Please enter a number for the rows and columns of the array");
			n = sc.nextInt();
		} while (n <= 0);

		int m = n;

		int[][] matrix = new int[n][m];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Please enter a number for row " + (i + 1) + " and col " + (j + 1));
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("The first diagonal is: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("The second diagonal is: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i + j == matrix.length - 1) {
					System.out.print(matrix[i][j] + " ");
				}
			}

		}
	}

}
