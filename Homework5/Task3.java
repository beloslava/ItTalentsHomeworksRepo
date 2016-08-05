
public class Task3 {

	public static void main(String[] args) {

		String word1 = "words";
		String word2 = "nurds";

		System.out.println((word1.length() == word2.length()) ? "The words are equal" : "The words are not equal");

		if ((word1.length() == word2.length()) || (word1.length() < word2.length())) {

			for (int i = 0; i < word1.length(); i++) {
				if (word1.charAt(i) != word2.charAt(i)) {
					StringBuilder builder = new StringBuilder();
					builder.append((i + 1) + " ");
					builder.append(word1.charAt(i));
					builder.append(" - ");
					builder.append(word2.charAt(i));
					System.out.println(builder);

				}
			}
		} else {
			for (int i = 0; i < word2.length(); i++) {
				if (word1.charAt(i) != word2.charAt(i)) {
					StringBuilder builder = new StringBuilder(i);
					builder.append((i + 1) + " ");
					builder.append(word1.charAt(i));
					builder.append(" - ");
					builder.append(word2.charAt(i));
					System.out.println(builder);

				}
			}
		}

	}

}
