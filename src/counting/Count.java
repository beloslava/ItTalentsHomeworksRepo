package counting;

import java.util.ArrayList;
import java.util.Comparator;

public class Count {

	public static void main(String[] args) {

		String str = "My name is Slim Shady!";
		symbols(str);
	}

	static void symbols(String text) {
		String str = text.toUpperCase();
		char ch = str.charAt(0);
		int arrMin = ch;
		int arrMax = ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch > arrMax) {
				arrMax = ch;
			}
			if (ch < arrMin) {
				arrMin = ch;
			}
		}
		int[] helper = new int[arrMax - arrMin + 1];
		for (int i = 0; i < str.length(); i++) {
			helper[str.charAt(i) - arrMin]++;
		}

		int num = 0;
	
		for (int i = 0; i < helper.length; i++) {
			if (helper[i] > 0 && (i + arrMin) > 64 && (i + arrMin) < 91) {
				System.out.print((char) (i + arrMin) + ": " + helper[i] + " ");
				num = (100 / str.length()) * helper[i];
				for (int j = 0; j < num; j++) {
					System.out.print("#");
				}
				System.out.println();

			}
		}

	}

}
