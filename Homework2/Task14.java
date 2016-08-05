import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		do{
			System.out.println("Enter a number between 10 and 200");
			n = sc.nextInt();
		}while(!(n <= 200 && n >= 10));
		
			for(int i = n; i > 10; i--){
				if(i%7==0){
					System.out.print(i + " ");
				}
			}
		
	}
	
}
