
public class Task13 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4 };
		int[] array2 = { 4, 3, 2, 1, 0 };
		int[] arr = mergeArray(array, array2);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	static int[] mergeArray(int[] array1, int[] array2) {
		int count = array1.length;

		int[] array3 = new int[array1.length + array2.length];

		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		}

		for (int i = 0; i < array2.length; i++) {
			array3[count] = array2[i];
			count++;
		}

		return array3;
	}

}
