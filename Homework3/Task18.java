import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do{
			System.out.println("Please enter a number for cells of the array 1");
			n = sc.nextInt();
		}
		while(n <= 0);
		
		int[] array1 = new int[n];
		for(int i = 0; i < array1.length; i++){
			System.out.println("Please enter a number for cell " + (i+1) + ":");
			array1[i] = sc.nextInt();
		}
		
		int m;
		
		do{
			System.out.println("Please enter a number for cells of the array 2");
			m = sc.nextInt();
		}
		while(m <= 0);
		
		int[] array2 = new int[m];
		for(int i = 0; i < array2.length; i++){
			System.out.println("Please enter a number for cell " + (i+1) + ":");
			array2[i] = sc.nextInt();
		}
		
		for(int i = 0; i < array1.length; i++){
		System.out.print(array1[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < array2.length; i++){
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		int[] array3;
		if(array1.length < array2.length){
			array3 = new int[array1.length];
		}
		else{
			array3 = new int[array2.length];
		}
		
		for(int i = 0; i < array3.length; i++){
			if(array1[i] > array2[i]){
			array3[i] = array1[i];
			}
			else{
			array3[i] = array2[i];
			}
		}
		for(int i = 0; i < array3.length; i++){
			System.out.print(array3[i] + " ");
		}
	}
	
}
 