package exceptionsTask;

public class DevideArraysIf {

	public static void main(String[] args) {

		int[] a1 = { 1, 8, 2, 0 };
		int[] a2 = { 0, 2, 5, 6, 4 };

		int[] a3 = devideArrays(a1, a2);
		printArray(a3);

	}

	static int[] devideArrays(int[] a1, int[] a2) {
		int[] a3;
		if (a1.length > a2.length) {
			a3 = new int[a2.length];
		} else {
			a3 = new int[a1.length];
		}

		for (int i = 0; i < a3.length; i++) {
			if (a2[i] == 0) {
				a3[i] = 0;
			} else {
				a3[i] = a1[i] / a2[i];
			}
		}

		return a3;

	}

	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
