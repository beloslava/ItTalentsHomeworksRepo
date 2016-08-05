
public class Task4Another {

	public static void main(String[] args) {
		
		int[][] arr = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 7, 8, 9 },
				{ 6, 2, 1, 0 }, 
				{ 5, 7, 0, 1 } 
		};

		for (int col = 0; col < arr[0].length; col++) {
			for (int row = arr.length - 1; row >= 0; row--) {
				System.out.print(arr[row][col] + " ");
			}
			
			System.out.println();
		}
	}
	
}
