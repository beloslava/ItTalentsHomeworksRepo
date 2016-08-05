import java.util.Scanner;

public class Task7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do{
			System.out.println("Please enter a number for cells");
			n = sc.nextInt();
		}
		while(n <= 0);
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++){
			System.out.println("Please enter a number for cell " + (i+1));
			arr[i] = sc.nextInt();
		}
		
		int[] copyArr = new int[arr.length];
		
		copyArr[0] = arr[0];
		copyArr[arr.length-1] = arr[arr.length-1];
		
		for(int i = 1; i < arr.length-1; i++){
			copyArr[i] = arr[i-1] + arr[i+1];
		}
		System.out.println("The new array is:");
		for(int i = 0; i < arr.length; i++){
			System.out.print(copyArr[i] + " ");
		}
 	}

}
