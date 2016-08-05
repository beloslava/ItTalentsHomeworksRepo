
public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	void changeOperationSystem(String newOperationSystem) {
		if (newOperationSystem != null && !newOperationSystem.equals("")) {
			operationSystem = newOperationSystem;
		}
	}

	void useMemory(double memory) {
		if (freeMemory < memory || memory < 0) {
			System.out.println("Not enough free memory");
		} else {
			freeMemory = freeMemory - memory;
		}
	}

	void showCharacteristics() {
		System.out.println("Year - " + this.year);
		System.out.println("Price - " + this.price);
		System.out.println("Notebook - " + this.isNotebook);
		System.out.println("Hard Disk Memory - " + this.hardDiskMemory);
		System.out.println("Free Memory - " + this.freeMemory);
		System.out.println("Operation System - " + this.operationSystem);
	}

}
