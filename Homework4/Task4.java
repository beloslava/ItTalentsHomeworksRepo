import java.util.Arrays;

public class Task4 {

	public static void main(String[] args) {

		int[][] arr = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 7, 8, 9 },
				{ 6, 2, 1, 0 }, 
				{ 5, 7, 0, 1 } 
		};
		
		int[][] arrCopy = new int[arr.length][arr[0].length];

		for (int col = 0; col < arr[0].length; col++) {
			for (int row = arr.length - 1; row >= 0; row--) {
				arrCopy[col][arrCopy.length - 1 - row] = arr[row][col];
			}
		}
		for (int row = 0; row < arrCopy.length; row++) {
			for (int col = 0; col < arrCopy[row].length; col++) {
				System.out.print(arrCopy[row][col] + " ");

			}
			System.out.println();
		}

	}

}
