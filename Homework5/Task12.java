import java.util.Arrays;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.println("Please enter a number for the cells of the array");
			n = sc.nextInt();
		} while (n <= 0);

		int[] arr = generateArray(n);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	static int[] generateArray(int n) {
		int[] array = new int[n];
		int count = 1;
		for (int i = 0; i < array.length; i++) {
			array[i] = count;
			count++;
		}
		return array;
	}

}
