import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Enter a number of cells");
			n = sc.nextInt();
		} while (n <= 0);

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a number for a cell " + (i + 1) + ":");
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				if (arr[i] < min) {
					min = arr[i];

				}
			}

		}
		System.out.println("The smallest number from the array multiple by three is: " + min);

	}

}
