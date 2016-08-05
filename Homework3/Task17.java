import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.println("Please enter a number for the cells of the array");
			n = sc.nextInt();
		} while (n <= 0);

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a number for cell " + (i + 1) + ":");
			arr[i] = sc.nextInt();
		}
		boolean up = true;

		for (int i = 1; i < arr.length - 1; i++) {
			if (!((arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) || (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]))) {
				up = false;
				break;
			}
		}
		System.out.println(up ? "True" : "False");
	}

}
