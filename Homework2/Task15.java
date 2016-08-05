import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int n = sc.nextInt();
		int num = 1;
		int sum = 1;
		
		do{
			num++;
			sum += num;
		}while(num < n);
			System.out.println(sum);
	}
	
}
