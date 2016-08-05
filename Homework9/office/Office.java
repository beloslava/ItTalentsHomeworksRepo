package office;

public class Office {

	public static void main(String[] args) {

		int day = 1;

		Task task1 = new Task("writing report", 6);
		Task task2 = new Task("making cofee", 1);
		Task task3 = new Task("calling clients", 5);
		Task task4 = new Task("finding new clients", 12);
		Task task5 = new Task("doing week's report", 10);
		Task task6 = new Task("calling partners", 5);
		Task task7 = new Task("cleaning descs", 4);
		Task task8 = new Task("finding solution for problem 1", 15);
		Task task9 = new Task("finding solution for problem 2", 10);
		Task task10 = new Task("writing mails to new clients", 12);

		AllWork allWork = new AllWork();

		allWork.addTask(task1);
		allWork.addTask(task2);
		allWork.addTask(task3);
		allWork.addTask(task4);
		allWork.addTask(task5);
		allWork.addTask(task6);
		allWork.addTask(task7);
		allWork.addTask(task8);
		allWork.addTask(task9);
		allWork.addTask(task10);

		Employee.setAllWork(allWork);
		Employee angel = new Employee("Angel");
		Employee gogo = new Employee("Georgi");
		Employee mila = new Employee("Mila");

		do {
			System.out.println("Day " + day + ":");

			angel.startWorkingDay();
			gogo.startWorkingDay();
			mila.startWorkingDay();

			angel.work();
			gogo.work();
			mila.work();

			day++;
		} while (!allWork.isAllWorkDone());

	}

}
