
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter two full names split with ','");
		String names = sc.nextLine();
		String[] name = names.split(",");

		String name1 = name[0];
		String name2 = name[1];

		int count1 = 0;
		for (int i = 0; i < name1.length(); i++) {
			count1 += (int) name1.charAt(i);
		}

		int count2 = 0;
		for (int i = 0; i < name2.length(); i++) {
			count2 += (int) name2.charAt(i);
		}

		if (count1 > count2) {
			System.out.println(name1);
		} else {
			System.out.println(name2);
		}
		sc.close();
	}

}
