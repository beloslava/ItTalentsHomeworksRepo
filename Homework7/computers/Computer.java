package computers;

public class Computer {
	
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	Computer(){
		isNotebook = false;
		operationSystem = "WIN XP";
	}
	
	Computer(int year, double price, int hardDiskMemory, double freeMemory){
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}
	
	Computer(int year, double price, boolean isNotebook, int hardDiskMemory, 
			double freeMemory, String operationSystem){
		this(year, price, hardDiskMemory, freeMemory);
		
	}
	
	int comparePrice(Computer computer2){
		if(this.price == computer2.price){
			System.out.println("The prices of computers are equal");
			return 0;
		}
		if(this.price > computer2.price){
			System.out.println("The first computer is more expensive than the second computer");
			return -1;
		}
		else{
			System.out.println("The second computer is more expensive than the first computer");
			return 1;
		}
	}

}
