
public class Task14 {

	public static void main(String[] args) {

		int n = 5;
		int factorialN = multiplicateF(n);
		System.out.println("The factorial of number " + n + " is: " + factorialN);
	}

	static int multiplicateF(int n) {
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}

}
