import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[7];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a number for cell " + (i + 1) + ":");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int avg = sum / arr.length;
		System.out.println("The avarage is " + avg);

		int[] substractions = new int[arr.length];
		for (int i = 0; i < substractions.length; i++) {
			int sub = arr[i] - avg;
			int absSub = sub < 0 ? 0 - sub : sub;
			substractions[i] = absSub;
		}
		int minSub = substractions[0];
		int minIndex = 0;
		for (int i = 1; i < substractions.length; i++) {
			if (minSub > substractions[i]) {
				minSub = substractions[i];
				minIndex = i;
			}
		}
		System.out.println("The element closest to avarage is " + arr[minIndex]);
	}

}
