import java.util.Scanner;

public class Exercise9 {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = a*b;
		
		if((a <= 99) && (a >= 10) && (b <= 99) && (b >= 10)){
			
		if(c % 2 == 0){
			System.out.println(c + "," + c % 10 + " is even");
		}
			else{
				
			if((c % 2 < 0) || (c % 2 > 0)){
				System.out.println(c + "," + c % 10 + " is uneven");
			}
		}
	}
	}
	
}
