import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		
		double number1 = sc.nextDouble();
		
		System.out.println("Please enter the second number");
		
		double number2 = sc.nextDouble();
		
		System.out.println("Please enter the third number");
		
		double number3 = sc.nextDouble();
		
		if((number1 < number3) && (number2 > number3) || (number1 > number3) && (number2 < number3)){
			
			System.out.println(number3 + " is between " + number1 + " and " + number2);
		}
		
		else{
			
			System.out.println(number3 + " is not between " + number1 + " and " + number2);
		}
		
	}
	
}
