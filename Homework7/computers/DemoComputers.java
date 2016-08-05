package computers;

public class DemoComputers {
	
	public static void main(String[] args) {
		
		Computer computer1 = new Computer(2015, 2000, 1000, 56.5);
		Computer computer2 = new Computer(2013, 850.9, 512, 80);
		Computer computer3 = new Computer(2014, 1500, true, 1000, 512.6, "Linux");
		Computer computer4 = new Computer(2014, 3000, true, 2000, 800.1, "Windows");
		Computer computer5 = new Computer();
		computer5.price = 1500;
		
		computer1.comparePrice(computer2);
		computer1.comparePrice(computer5);
		computer3.comparePrice(computer4);
		computer5.comparePrice(computer3);
		
	}

}
