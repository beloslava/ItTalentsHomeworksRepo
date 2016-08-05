
public class Task6 {

	public static void main(String[] args) {

		String sentence = "cooL man exeRcise";
		String[] words = sentence.split("\\W");

		for (int i = 0; i < words.length; i++) {
			String word = words[i].toString();
			String a = word.substring(0, 1);
			String b = word.substring(1, word.length());
			System.out.print(a.toUpperCase() + b.toLowerCase() + " ");
		}

	}

}
