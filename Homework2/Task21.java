import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		
		do{
		System.out.println("Enter a number between 1 and 52");
		a = sc.nextInt();
		}while( !(a > 0 && a < 53) );
		
		for(int card = a; card <= 52; card++){
			int cardNumber = (card - 1)/4 + 1;
			int cardSuit = card%4;
			
			switch(cardNumber){
				case 1:
					System.out.print("Two");
					break;
				case 2:
					System.out.print("Three");
					break;
				case 3:
					System.out.print("Four");
					break;
				case 4:
					System.out.print("Five");
					break;
				case 5:
					System.out.print("Six");
					break;
				case 6:
					System.out.print("Seven");
					break;
				case 7:
					System.out.print("Eight");
					break;
				case 8:
					System.out.print("Nine");
					break;
				case 9:
					System.out.print("Ten");
					break;
				case 10:
					System.out.print("Jack");
					break;
				case 11:
					System.out.print("Queen");
					break;
				case 12:
					System.out.print("King");
					break;
				case 13:
					System.out.print("Ace");
					break;
				}
				System.out.print(" ");
			
			switch(cardSuit){
				case 1:
					System.out.print("Clubs");
					break;
				case 2:
					System.out.print("Diamonds");
					break;
				case 3:
					System.out.print("Hearts");
					break;
				case 0:
					System.out.print("Spaders");
					break;
			}
			if(card<52){
				System.out.print(", ");
			}
			
			
		}
		
	}
	
}
