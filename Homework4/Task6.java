
public class Task6 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{1,2,3,1,2,1},
				{1,1,8,5,4,1},
				{7,9,8,11,4,2},
				{10,2,2,3,3,5},
				{8,9,14,4,11,9},
				{15,3,3,4,1,0}
				
		};
		
		int sum = 0;
		int sumRow = 0;
		
		for(int i = 1; i < arr.length; i+=2){
			for(int j = 0; j < arr[i].length; j++){
				sum += arr[i][j];
				sumRow += arr[i][j];
				
				if(j == arr.length-1){
					System.out.print(arr[i][j] + " ");
				}
				else{
				System.out.print(arr[i][j] + ", ");
				}
			}
			
			System.out.println("the sum is " + sumRow);
			sumRow = 0;
		}
		
		System.out.println("The sum of the elements from even rows is " + sum);
	}
	
}
