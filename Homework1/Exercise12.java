import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter day");
		
		int day = sc.nextInt();
		
		System.out.println("Please enter month");
		
		int month = sc.nextInt();
		
		System.out.println("Please enter year");
		
		int year = sc.nextInt();
		
		boolean leap = false;
		
		if((year % 4 == 0) && (year % 100 != 0)){
			leap = true;
		}
		if(year % 400 == 0){
			leap = true;
		}
		
		if((day == 31) && ((month == 4) || (month == 6) || (month == 9) || (month == 11))){
			System.out.println("You have entered invalid date");
		}
		if(((day == 31) || (day == 30)) && (month == 2)){
			System.out.println("You have entered invalid date");
		}

		if((day == 29) && (month == 2) && (leap == false)){
			System.out.println("You have entered invalid date");
		}

		if(!((day >= 1 && day <= 31) && (month >= 1 && month <= 12) && (year > 0))) {
			System.out.println("You have entered invalid date");
		}

		
		if((day > 0 && day <= 31) && (month > 0 && month <= 12) && (year > 0)){
			
			if(day == 28 && month == 2 && leap == true){
				day++;
				System.out.println(day + "." + month + "." + year);
			}
			if(day == 29 && month == 2 && leap == true){
				day = 1;
				month++;
				System.out.println(day + "." + month + "." + year);
			}
			if(day == 28 && month == 2 && leap == false){
				day = 1;
				month++;
				System.out.println(day + "." + month + "." + year);
			}
			if((day == 30) && ((month == 4) || (month == 6) || (month == 9) || (month == 11))){
				day = 1;
				month++;
				System.out.println(day + "." + month + "." + year);
			}
			if((day == 31) && ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10))){
				day = 1;
				month++;
				System.out.println(day + "." + month + "." + year);
			}
			if(day == 31 && month == 12){
				day = 1;
				month = 1;
				year++;
				System.out.println(day + "." + month + "." + year);
			}
			
			if(day >= 1 && day <= 30){
				day++;
				System.out.println(day + "." + month + "." + year);
			}
			
		}
		
			
	}
	
		
}
