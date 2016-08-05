import java.util.Scanner;

public class Task14Recursion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number");
		int number = sc.nextInt();
		int fact = factorial(number);
		System.out.println("The factorial of number " + number + " is: "  + fact);
		sc.close();
	}

	static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
