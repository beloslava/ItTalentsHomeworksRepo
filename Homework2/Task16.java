import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		do{
			System.out.println("Please enter number 1");
			a = sc.nextInt();	
		}while(!((a >= 10) && (a <= 5555)));
		
		int b;
		do{
			System.out.println("Please enter number 2");
			 b = sc.nextInt();
		}while(!((b >= 10) && (b <= 5555)));
			
			if(a > b){
				int c = a;
				a = b;
				b = c;
			}
			for(int i = b; i >= a; i--){
				if(i%50 == 0){
					System.out.print(i + " ");
				}
			}
		
	}
	
}
