import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.println("Please enter a number for the cells of the array");
			n = sc.nextInt();
		} while (n <= 0);

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a number for the cell " + (i + 1) + ":");
			arr[i] = sc.nextInt();
		}

		int count = 1;
		int maxCount = 0;
		int maxValue = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				count++;
			} else {
				if (count > maxCount || i == arr.length ) {
					maxCount = count;
					maxValue = arr[i - 1];
				}
				count = 1;
			}
		}
		System.out.println("The most repeated number in the array is repeated " + maxCount + " times");
		System.out.println(maxValue);

	}

}
