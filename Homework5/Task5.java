
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the first word");
		String word1 = sc.next();
		System.out.println("Please enter the second word");
		String word2 = sc.next();

		int row = 0;
		int col = 0;

		boolean commonLetter = false;

		for (int i = 0; i < word1.length(); i++) {
			int indexLetter = word2.indexOf(word1.charAt(i));
			if (indexLetter >= 0) {
				commonLetter = true;
				col = i;
				row = indexLetter;
				break;
			}
		}

		char[][] crossword = new char[word2.length()][word1.length()];
		for (int i = 0; i < crossword.length; i++) {
			for (int j = 0; j < crossword[i].length; j++) {
				crossword[i][j] = ' ';
			}
		}

		for (int i = 0; i < word1.length(); i++) {
			crossword[row][i] = word1.charAt(i);
		}

		for (int i = 0; i < word2.length(); i++) {
			crossword[i][col] = word2.charAt(i);
		}

		if (commonLetter == true) {
			for (int i = 0; i < crossword.length; i++) {
				for (int j = 0; j < crossword[i].length; j++) {
					System.out.print(crossword[i][j]);
				}
				System.out.println();
			}
		} else {
			System.out.println("There is no common letter in the two words");
		}

		sc.close();
	}

}
