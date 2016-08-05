import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter a number");
		int n = sc.nextInt();
		
		for(int x = 3; n > 0; n--){
			System.out.print(x + ",");
			x+=3;
			if(n == 1){
				System.out.println(x);
			}
			
		}
		
	}
	
}
