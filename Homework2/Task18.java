
import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		do{
			System.out.println("Enter a number 1 between 1 and 9");
			a = sc.nextInt();
		}while( !(a > 0 && a < 10 ) );
			
		int b;
		do{
			System.out.println("Enter number 2 between 1 and 9");
			b = sc.nextInt();
		}while( !(b > 0 && b < 10) );
		
			for(int i = 1; i <= a; i++){
				for(int j = 1; j <= b; j++){
					System.out.println(i + "*" + j + "=" + (i*j));
				}
			}
		
	}
	
}
