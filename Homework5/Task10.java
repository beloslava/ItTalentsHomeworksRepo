import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a word");
		String word = sc.next();

		for (int i = 0; i < word.length(); i++) {
			char newletter = (char) (word.charAt(i) + 5);
			System.out.print(newletter);
		}
		System.out.println();
		sc.close();
	}

}
