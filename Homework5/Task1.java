import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the first string");
		String s1 = sc.nextLine();
		System.out.println("Please enter the second string");
		String s2 = sc.nextLine();

		System.out.println(s1.toUpperCase() + " " + s1.toLowerCase());
		System.out.println(s2.toUpperCase() + " " + s2.toLowerCase());
		sc.close();

	}

}
