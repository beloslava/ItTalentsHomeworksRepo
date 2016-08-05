import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7];
		
		for(int i = 0; i < arr.length; i++){
			System.out.println("Please enter a number for cell " + (i+1) + ":");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++){
			if(arr[i]% 5 == 0 && arr[i] > 5){
				System.out.print(arr[i] + " ");
			}
		}
	}
	
}
