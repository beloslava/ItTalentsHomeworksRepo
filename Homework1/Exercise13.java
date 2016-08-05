import java.util.Scanner;

public class Exercise13 {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int temperature = sc.nextInt();
		
		if((temperature < 100) && (temperature > -273)){
		
			if(temperature < -20){
				System.out.println("It's freezing");
			}
			if((temperature < 0) && (temperature > -20 )){
				System.out.println("It's cold");
			}
			if((temperature > 0) && (temperature < 15)){
				System.out.println("It's cool");
			}
			if((temperature > 15) && (temperature < 25)){
				System.out.println("It's warm");
			}
			if(temperature > 25){
				System.out.println("It's hot");
			}
	}
	}
	
}
