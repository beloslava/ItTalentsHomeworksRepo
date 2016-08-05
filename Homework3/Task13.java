import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number");
		int a = sc.nextInt();
		int temp = a;
		int digits = 0;

		while (temp != 0) {
			temp /= 2;
			digits++;
		}
		if (digits == 0) {
			digits = 1;
		}
		int[] arr = new int[digits];
		for (int i = arr.length - 1; i >= 0; i--) {
			int digit = a % 2;
			arr[i] = digit;
			a /= 2;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
