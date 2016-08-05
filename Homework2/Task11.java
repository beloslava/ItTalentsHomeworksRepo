import java.util.Scanner;

public class Task11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number of rows");
		int rows = sc.nextInt();
		int stars = 1;
		
		for(int row = 1; row <= rows; row++) {
			for(int i = 1; i <= rows - row; i++){
				System.out.print(" ");
			}
			for(int j = 1; j <= stars; j++){
				System.out.print("*");
			}
			System.out.println();
			stars += 2;
		}
		
	}

}
