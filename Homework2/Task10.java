import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int a = sc.nextInt();
		
		boolean primeNumber = true;
		
		for(int i = 2; i < a; i++){
			if(a%i==0){
				primeNumber = false;
				break;
			} 
		}
		
		System.out.println(primeNumber ? "The number is prime" : "The number is not prime");
		
	}
	
}
