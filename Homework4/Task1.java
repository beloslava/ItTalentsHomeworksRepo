
public class Task1 {

	public static void main(String[] args) {
		
		int[][] matrix = {
				{3,4,5,6,7,},
				{6,-3,4,7,0},
				{16,7,8,4,0},
				{2,48,71,1,7},
				{-16,0,5,5,4},
				{15,5,1,1,-25}	
		};
		
		int min = matrix[0][0];
		int max = matrix[0][0];
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				if(matrix[i][j] < min){
					min = matrix[i][j];
				}
				if(matrix[i][j] > max){
					max = matrix[i][j];
				}
			}
		}
		System.out.println("The min value of the matrix is " + min);
		System.out.println("The max value of the matrix is " + max);
	}
	
}
