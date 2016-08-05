import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int firstP = sc.nextInt();
		
		int secondP = sc.nextInt();
		
		int thirdP = sc.nextInt();
		
		int fourthP = sc.nextInt();
		
		int result1 = firstP+secondP;
		
		int result2 = fourthP+thirdP;
		
		if((firstP <= 8) && (firstP >= 1) && (secondP <= 8) && (secondP >= 1) 
				&& (thirdP <= 8) && (thirdP >= 1) && (fourthP <= 8) && (fourthP >= 1) ){
			System.out.println(firstP + " " + secondP + " " + thirdP + " " + fourthP );
		
		if(((result1 % 2 == 0) && (result2 % 2 == 0)) || ((result1 % 2 != 0) && (result2 % 2 != 0))){
			System.out.println("The positions are the same color");
		}
		if(((result1 % 2 == 0) && (result2 % 2 != 0)) || ((result1 != 0) && (result2 == 0))){
			System.out.println("The positions are not the same color");
		}
		}
	}
	
}
