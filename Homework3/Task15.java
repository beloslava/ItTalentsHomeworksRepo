import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.println("Please enter a number for the cells of the array");
			n = sc.nextInt();
		} while (n <= 0);

		double[] array = new double[n];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter a number for cell " + (i + 1) + ":");
			array[i] = sc.nextDouble();
		}
		double maxSum = 0;
		double orig1 = 0;
		double orig2 = 0;
		double orig3 = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if (array[i] == array[j] || array[i] == array[k] || array[j] == array[k]) {
						continue;
					}
					double abs1 = array[i] < 0 ? 0 - array[i] : array[i];
					double abs2 = array[j] < 0 ? 0 - array[j] : array[j];
					double abs3 = array[k] < 0 ? 0 - array[k] : array[k];

					double sum = abs1 + abs2 + abs3;

					if (sum > maxSum) {
						maxSum = sum;
						orig1 = array[i];
						orig2 = array[j];
						orig3 = array[k];

					}
				}
			}
		}
		System.out.print(orig1 + "; " + orig2 + "; " + orig3);
	}

}
