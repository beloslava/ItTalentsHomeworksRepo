
public class DemoComputer {

	public static void main(String[] args) {

		Computer asus = new Computer();
		Computer lenovo = new Computer();

		asus.year = 2015;
		asus.price = 3200;
		asus.hardDiskMemory = 1000;
		asus.freeMemory = 520.60;
		asus.operationSystem = "Linux";
	

		lenovo.year = 2012;
		lenovo.price = 850;
		lenovo.isNotebook = true;
		lenovo.hardDiskMemory = 256;
		lenovo.freeMemory = 100.50;
		lenovo.operationSystem = "Windows";

		double memory = 100;
		String newOperationSystem = "Windows";

		lenovo.useMemory(memory);
		asus.changeOperationSystem(newOperationSystem);

		lenovo.showCharacteristics();
		asus.showCharacteristics();

	}

}
