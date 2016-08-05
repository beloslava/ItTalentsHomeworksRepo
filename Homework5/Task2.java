import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word1;
		do {
			System.out.println("Please enter the first word");
			word1 = sc.next();
		} while (word1.length() > 20 || word1.length() < 10);

		String word2;
		do {
			System.out.println("Please enter the second word");
			word2 = sc.next();
		} while (word2.length() > 20 || word2.length() < 10);

		if (word1.length() > word2.length()) {

			String word3 = word2.substring(0, 5).concat(word1.substring(5));
			System.out.println(word3.length() + " " + word3);
		} else {

			String word3 = word1.substring(0, 5).concat(word2.substring(5));
			System.out.println(word3.length() + " " + word3);
		}
		sc.close();
	}

}
