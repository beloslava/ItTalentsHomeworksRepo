import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = sc.next();

		boolean palindrome = true;

		for (int i = 0; i < (word.length() + 1) / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
				palindrome = false;
				break;
			}
		}
		System.out.println(palindrome ? "The word is palindrome" : "The word is not palindrome");
		sc.close();
	}

}
