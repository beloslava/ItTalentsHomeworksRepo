
public class Task14 {
	
	public static void main(String[] args) {
		
		double[] arr = {7, -1, 3.6, 2, 4, 0.3, 7.5, 18.6, 1.78};
		
		int n = 0;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] <= 2.99 && arr[i] >= -2.99){
				n++;
			}
		}
		double[] arr2 = new double[n];
		int x = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] <= 2.99 && arr[i] >= -2.99){
				arr2[x] = arr[i];
				x++;
			}
		}
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i] + "; ");
			if(arr2[i] == arr2[arr2.length-1]){
				System.out.print(arr2[i]);
			}
		}
		
		
	}

}
