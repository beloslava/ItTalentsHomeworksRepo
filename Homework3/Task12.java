
public class Task12 {

	public static void main(String[] args) {
		
		int[] arr = {1, 5, 8, 3, 4, 7, 6};
		
		System.out.println("The new array is:");
		
		for(int i = 0; i < arr.length; i++){
			if(i == 0){
				int temp;
				temp = arr[0];
				arr[0] = arr[1];
				arr[1] = temp;
				System.out.print(arr[0] +  " " + arr[1] + " ");
			}
			if(i == 2){
				arr[2] = arr[2] + arr[3];
				arr[3] = arr[2] - arr[3];
				arr[2] = arr[2] - arr[3];
				System.out.print(arr[2] + " " + arr[3] + " ");
			}
			if(i == 4){
				arr[4] = arr[4] * arr[5];
				arr[5] = arr[4] / arr[5];
				arr[4] = arr[4] / arr[5];
				System.out.print(arr[4] + " " + arr[5] + " " + arr[6]);
			}	
		}
		
		
		
	}
	
}
