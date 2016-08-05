import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
	
		if((a > 999) || (a < 100)){
			System.out.println("The number is incorrect");
		}
		int a1 = a % 10;
		
		int a2 = (a / 10) % 10;
		
		int a3 = (a / 100) % 10;
		
		if((a1 == a2) && (a2 == a3)){
			System.out.println("The numbers are equal");
		}
		if((a1 < a2) && (a2 < a3)){
			System.out.println("The numbers are in descending order");
		}
		if((a1 > a2) && (a2 > a3)){
			System.out.println("The numbers are in ascending order");
		}
		
		
	}
	
	}
	

