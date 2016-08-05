
public class Task16 {

	public static void main(String[] args) {

		double[] arr = { -1.22, -2.43, 3, 4.2, 0, 2.5, -7.5, 9.1, -12, -4 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
			if (arr[i] == arr[arr.length - 1]) {
				System.out.println(arr[i]);
			}
		}
		System.out.println();

		double[] copy = new double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];

			if (copy[i] < -0.231) {
				copy[i] = ((i + 1) * (i + 1)) + 41.25;
			} else {
				copy[i] = copy[i] + (i + 1);
			}
			System.out.print(copy[i] + ", ");
			if (copy[i] == copy[copy.length - 1]) {
				System.out.println(copy[i]);
			}
		}
	}

}
