
public class Task7With1Loop {

	public static void main(String[] args) {
		int[][] array = new int[6][3];
		int[] arraySum = new int[6];
		int sum = 0;
		int[][] arr = { 
					{ 11, 12, 13, 14, 15, 16 },
					{ 21, 22, 23, 24, 25, 26 }, 
					{ 31, 32, 33, 34, 35, 36 },
					{ 41, 42, 43, 44, 45, 46 },
					{ 51, 52, 53, 54, 55, 56 }, 
					{ 61, 62, 63, 64, 65, 66 } 
				};

		int i = 0;
		boolean p = false;
		for (int j = 0; j < arr[i].length; j++) {
			if (p) {
				j--;
			}
			if ((i + j) % 2 == 0) {
				arraySum[i] += arr[i][j];
				array[i][j / 2] = arr[i][j];
			}
			p = false;
			if (j == arr[i].length - 1 && i < arr.length) {
				i++;
				j = 0;
				p = true;
			}
			if (j == 0 && i == arr.length) {
				break;
			}
		}

		int s = 0;
		boolean q = false;
		for (int k = 0; k < array[0].length; k++) {
			if (q) {
				k--;
			}
			System.out.print(array[s][k] + ", ,");
			q = false;
			if (k == array[0].length - 1 && s < array.length) {
				System.out.println("сума от елементи за реда: " + arraySum[s]);
				s++;
				k = 0;
				q = true;
			}
			if (k == 0 && s == array.length) {
				break;
			}
		}

		for (int k = 0; k < array.length; k++) {
			sum += arraySum[k];
		}
		System.out.println("Сума на елементите: " + sum);
	}

}
