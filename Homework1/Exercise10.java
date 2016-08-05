import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int litters = sc.nextInt();
		
		int litterBin2l = litters/5;
		
		int litterBin3l = litters/5;
		
		if((litters > 10) && (litters < 9999)){
			System.out.println(litters);
		}
		if(litters%5 == 0){
			System.out.println(litterBin2l + " with 2 litters");
			System.out.println(litterBin3l + " with 3 litters");
		}
		if(litters%5 == 2){
			System.out.println(litterBin2l + " with 2 litters");
			System.out.println(litterBin3l + " with 3 litters");
			System.out.println("+ 1 with 2 litters");
		}
		if(litters%5 == 3){
			System.out.println(litterBin2l + " with 2 litters");
			System.out.println(litterBin3l + " with 3 litters");
			System.out.println(" + 1 with 3 litters");
		}
		if(litters%5 == 4){
			System.out.println(litterBin2l + " with 2 litters");
			System.out.println(litterBin3l + " with 3 litters");
			System.out.println(" + 2 with 2 litters");
		}
		if(litters%5 == 1){
			System.out.println(litterBin2l + " with 2 litters");
			System.out.println(litterBin3l + " with 3 litters");
		
		}
	}
	
	
}
