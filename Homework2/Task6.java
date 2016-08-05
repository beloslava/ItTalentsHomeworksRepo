import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int num = 1;
		int sum = 1;
		
		while(num<n){
			num++;
			sum+=num;
		}
		System.out.println("The result is " + sum);
	}

}
