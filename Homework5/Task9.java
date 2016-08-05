
public class Task9 {

	public static void main(String[] args) {

		String str = "5new -15q we-4rty-2 5list0z-1bang80 4";
		str = str.replaceAll("[^-?0-9]+", " ");
		String[] result = str.split(" ");

		int sum = 0;

		for (int i = 0; i < result.length; i++) {
			String num = result[i].trim();
			if (num.isEmpty()) {
				continue;
			}
			int x = Integer.parseInt(num);
			sum += x;

		}

		System.out.println("The numbers are: " + str.trim());
		System.out.println("The sum of all numbers in the String is: " + sum);

	}

}
