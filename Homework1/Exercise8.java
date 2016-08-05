import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		int d = sc.nextInt();
		
		int ad = (a*10) + d;
		
		int bc = (b*10) + c;
		
		if((a < 9) && (a > 0) && (b < 9) && (b > 0) && (c < 9) && (c > 0)){
			System.out.println(a + "" + b + "" + c + "" + d);
		}
		if(ad > bc){
			System.out.println("bigger (" + ad + ">" + bc + ")");
		}
		if(ad < bc){
			System.out.println("smaller (" + ad  + "<" + bc + ")");
		}
		if(ad == bc){
			System.out.println("equal (" + ad  + "=" + bc + ")");
		}
	}
	
	
}
