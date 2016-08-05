import java.util.Scanner;

public class Task5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		int a = sc.nextInt();
		
		System.out.println("Please enter the second number");
		int b = sc.nextInt();
		
		if(a>b){
			
			int c = a;	
			a = b;
			b = c;
		} 
		for(int i = a; i <= b; i++){
			System.out.print(i + " ");
		}
		
		
	}

}
