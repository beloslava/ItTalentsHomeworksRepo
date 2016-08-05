
public class Task3 {

	public static void main(String[] args) {
		int[][] arr = {
				{3,2,4,6},
				{10,5,0},
				{6,1}
		};
		
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				sum += arr[i][j];
				count++;
			}
		}
		int avg = sum/count;
		System.out.println("The sum of the numbers in the array is: " + sum);
		System.out.println("The avarage value of the numbers is: " + avg);
	}
	
}
