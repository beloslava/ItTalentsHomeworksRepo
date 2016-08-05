import java.util.Random;

public class TestTasks {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		int seven = 0;
		int counter = 0;
		while(seven <= 7){
			System.out.println("Please enter dice 1");
			int dice1 = r.nextInt(6);
			System.out.println(dice1);
			System.out.println("Please enter dice 2");
			int dice2 = r.nextInt(6);
			System.out.println(dice2);
			
			if((dice1 + dice2) == 7){
				seven++;
			}
			else{
				seven = 0;
			}
			counter++;
		}
		System.out.println(counter);
	}

}
