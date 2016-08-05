
public class Task7 {

	public static void main(String[] args) {
		
		int[][] table = {
				{1,2,3,4,5,6},
				{0,7,8,9,2,10},
				{11,4,7,1,30,0},
				{7,3,7,3,1,10},
				{12,3,5,10,4,2},
				{1,20,9,5,5,1}
		};
		
		int sum = 0;
		int sumRow = 0;
		
		for(int i = 0; i < table.length; i++){
			for(int j = 0; j < table[i].length; j++){
				if((i + j) % 2 == 0){
					sum += table[i][j];
					sumRow += table[i][j];
					System.out.print(table[i][j] + ", ");
					}	
			}
			System.out.println(", the sum of the elements in the row is: " + sumRow);
			sumRow = 0;
		}
		System.out.println("The sum of the elements is: " + sum);
	}
	
}
