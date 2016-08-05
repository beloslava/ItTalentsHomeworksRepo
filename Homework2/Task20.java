
public class Task20 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int j = i; j <= 10; j++) {
				if (j == 10) {
					System.out.print("0");
				} else {
					System.out.print(j);
				}
			}
			for (int k = 1; k < i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
