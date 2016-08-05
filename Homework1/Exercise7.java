import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		
		double sum = sc.nextDouble();
		
		boolean sick = true;
		
		boolean healthy = false;
		
		if(sick){
			System.out.println("I won't go out");
		}
			else{
				
			if(healthy){
				System.out.println("I will go to see a movie with friends");
			}
			
			if((sum>0) && (sum < 10)){
				System.out.println("I will bye medicine");
			}
			if(sum < 0){
				System.out.println("I will stay home and drink tea");
			}
			if(sum > 10){
				System.out.println("I will go to a cafe");
			}
		}
			
		
	}
	
}
