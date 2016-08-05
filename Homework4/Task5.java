
public class Task5 {

	public static void main(String[] args) {
		
		int[][] matrix = {
				{6,4,1,2},
				{1,4,2,1,},
				{2,5,1,0},
				{3,4,5,2}
		};
		
		int sumRow = 0;
		int sumCol = 0;
		int maxSumRow = 0;
		int maxSumCol = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sumRow += matrix[i][j];
				 
				if(sumRow > maxSumRow){
					maxSumRow = sumRow;
				}
			}
			sumRow = 0;
		}
		System.out.println("The maximum sum in the rows is: " + maxSumRow);
		
		for(int j = 0; j < matrix[0].length; j++) {
			for(int i = 0; i < matrix.length; i++){
				sumCol += matrix[i][j];
				if(sumCol > maxSumCol){
					maxSumCol = sumCol;
				}
			}
			sumCol = 0;
		}
		System.out.println("The maximum sum in the columns is: " + maxSumCol);
		
		if(maxSumRow > maxSumCol){
			System.out.println("The maximum sum in rows is > form the maximum sum in columns");
		}
		else{
			if(maxSumRow < maxSumCol){
				System.out.println("The maximum sum in rows is < form the maximum sum in columns");
			}
			else{
				System.out.println("The maximum sum in rows is = to the maximum sum in columns");
			}
		}
		
		
	}
	
}
