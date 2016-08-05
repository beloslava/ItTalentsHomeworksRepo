import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.println("Please enter a number for the cells of the array");
			n = sc.nextInt();
		} while (n <= 0);

		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter a number for cell " + (i + 1));
			array[i] = sc.nextInt();
		}
		boolean mirrored = true;
		for (int i = 0; i < (array.length + 1) / 2; i++) {
			if (array[i] != array[n - i - 1]) {
				mirrored = false;
				break;
			}
		}
		System.out.println(mirrored ? "The array is mirrored" : "The array is not mirrored");
	}

}
