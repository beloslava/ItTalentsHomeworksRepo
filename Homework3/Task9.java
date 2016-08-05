import java.util.Scanner;

public class Task9 {

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

		int[] copy = new int[array.length];
		int index = 0;

		for (int i = array.length - 1; i >= 0; i--) {
			copy[index] = array[i];
			index++;
		}

		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
	}

}
