import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("Please enter a number of cells of the array");
			n = sc.nextInt();
		} while (n <= 0);

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a number for a cell " + (i + 1) + ":");
			arr[i] = sc.nextInt();
		}
		int[] resultArr = new int[arr.length];
		for (int i = 0; i < arr.length / 2; i++) {
			resultArr[i] = arr[i];
		}
		int resultIndex = arr.length / 2;
		for (int i = arr.length - 1; i >= arr.length / 2; i--) {
			resultArr[resultIndex] = arr[i];
			resultIndex++;
		}
		System.out.println("The new array is:");
		for (int i = 0; i < resultArr.length; i++) {
			System.out.print(resultArr[i] + " ");
		}
	}

}
