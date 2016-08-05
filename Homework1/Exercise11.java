import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		int d = a*(10*10) + (b*10) + c;
				
		if((a < 9 && a > 0 && a != 0) && (b < 9 && b > 0 && b != 0) && (c < 9 && c > 0 && c != 0)){
			System.out.println(a + "" + b + "" + c);
		
		if((d % a == 0) && (d % b == 0) && (d % c == 0)){
			System.out.println("The number is divisioned by every single digit");
		}
			
		if(!(d % a == 0) || !(d % b == 0) || !(d % c == 0)){
			System.out.println("The number is not devisioned by every single digit");
		}
		}
	}
	
}
