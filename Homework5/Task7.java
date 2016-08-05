import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter words");
		String words = sc.nextLine();

		String[] splited = words.split("\\W");
		System.out.print(splited.length + " words, ");

		int count = 0;
		int maxCount = 0;

		for (int i = 0; i < splited.length; i++) {
			String word = splited[i].toString();
			for (int j = 0; j < word.length(); j++) {
				count++;
			}
			if (count > maxCount) {
				maxCount = count;
			}
			count = 0;
		}
		System.out.print("the longest has " + maxCount + " symbols");
		sc.close();
	}

}
