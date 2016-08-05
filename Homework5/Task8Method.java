
public class Task8Method {
	
	public static void main(String[] args) {
		
		String str = "lool";
		int[]arr = {1,2,1};
		System.out.println(palindrome(str));
		System.out.println(palindrome(arr));
		
	}
	
	static boolean palindrome(String word){
		for (int i = 0; i < (word.length() + 1) / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
				return false;
				
			}
			
		}
		return true;
	}
	
	static boolean palindrome(int[]arr){
		for (int i = 0; i < (arr.length+1)/2; i++) {
			if(arr[i] != arr[arr.length-i-1]){
				return false;
			}
		}
		return true;
	}

}
