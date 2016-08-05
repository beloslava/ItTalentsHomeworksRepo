import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int a = sc.nextInt();
		int factorial = 1;
		int i = 1;

		do {
			factorial *= i;
			i++;
		} while (i <= a);
		System.out.println(factorial);
	}

}
