package exceptionsTask;

public class DivArraysExc {

	public static void main(String[] args) {

		int[] a1 = { 2, 8, 10, 0, 12, 45, 1, 6 };
		int[] a2 = { 0, 2, 5, 6, 3, 15 };

		int[] a3 = devideArrays(a1, a2);

		printArray(a3);

	}

	static int[] devideArrays(int[] a1, int[] a2) {
		int[] a3;
		try {
			a3 = new int[a1.length];
			if (a1.length > a2.length) {
				throw new ArrayLengthException();
			}

		} catch (ArrayLengthException e) {
			a3 = new int[a2.length];
		}

		for (int i = 0; i < a3.length; i++) {
			try {
				a3[i] = a1[i] / a2[i];
			} catch (ArithmeticException x) {
				
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
