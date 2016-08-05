import java.util.Scanner;

public class Exercise15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte hour = sc.nextByte();
		
		if((0 <= hour) && (hour <= 24)){
		   
		if((4 < hour) && (hour <= 9)){
			System.out.println("Good morning");
		}
		else{
		    if((9 < hour) && (hour <= 18)){
			System.out.println("Good day");
		    }
		    else{
		    	System.out.println("Good night");;
		 		}
		    }
		}
		
	}


}

