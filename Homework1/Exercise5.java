import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		if((a > b) && (a > c) && (b > c)){
			
			System.out.println(a + " " + b  + " " + c);
		}
		
		if((a > b) && (a > c) && (b < c)){
			
			System.out.println(a + " " + c + " " + b);
		}
		
		if((b > c) && (b > a) && (a > c)){
			
			System.out.println(b + " " + a + " " + c);
		}
		
		if((b > a) && (b > c) && (a < c)){
			
			System.out.println(b + " " + c + " " + a);
		}
		
		if((c > a) && (c > b) && (a > b)){
			
			System.out.println(c + " " + a + " " + b);
		}
		
		if((c > a) && (c > b) && (a < b)){
			
			System.out.println(c + " " + b + " " + a);
		}
	}
	
}
