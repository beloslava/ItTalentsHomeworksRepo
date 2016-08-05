import java.util.Scanner;

public class Task8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int x = sc.nextInt();
		int p = x-1;
		
		for(int row = 1; row <= x; row++){
			
			for(int j = 1; j <= x; j++){
				
				System.out.print(p);
			    }
			p += 2;
			System.out.println();
		}	
			
		}
		
	}


