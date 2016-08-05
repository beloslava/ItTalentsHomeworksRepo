import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number1 = sc.nextInt();
		
		int number2 = sc.nextInt();
		
		if(number1 < number2){
			
			System.out.println(number1);
			System.out.println(number2);
		}
			else{
			
			System.out.println(number2);
			System.out.println(number1);
		}
	}
	
}
