import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do{
			System.out.println("Please enter the number of cells for the first array");
			n = sc.nextInt();
		}
		while(n <= 0);
		
		int[] array = new int[n];
		
		for(int i = 0; i < array.length; i++){
			System.out.println("Please enter the number for the cell " + (i+1));
			array[i] = sc.nextInt();
		}
		
		int m;
		
		do{
			System.out.println("Please enter the number of cells for the second array");
			m = sc.nextInt();
		}
		while(m <= 0);
		
		int[] array2 = new int[m];
		
		for(int i = 0; i < array2.length; i++){
			System.out.println("Please enter the number for the cell " + (i+1));
			array2[i] = sc.nextInt();
		}
		
		boolean equalArrays = true;
		
		if(array.length == array2.length){
			for(int i = 0; i < array.length; i++){
				if(array[i] != array2[i]){
					equalArrays = false;
					break;
				}
			}
		}
		else{
			equalArrays = false;
		}
		System.out.println(equalArrays ? "The arrays are equal" : "The arrays are not equal");
	}
	
}
