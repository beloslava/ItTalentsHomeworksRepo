package office;

public class Employee {

	private static final int WORKING_HOURS_PER_DAY = 8;
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allWork;

	Employee(String name) {
		if (name != null && !(name.equals(""))) {
			this.name = name;
		}
		this.setCurrentTask(Employee.allWork.getNextTask());
		Employee.allWork.setCurrentUnassignedNotFinishedTask();
	}

	public String getName() {
		return name;
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask == null) {
			return;
		}
		this.currentTask = currentTask;
		this.currentTask.setOwner(this);
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft < 0) {
			return;
		}
		if (hoursLeft > WORKING_HOURS_PER_DAY) {
			System.out.println("This worker has 8 hour working day");
			this.hoursLeft = WORKING_HOURS_PER_DAY;
		}

		this.hoursLeft = hoursLeft;
	}

	public void startWorkingDay() {
		this.hoursLeft = WORKING_HOURS_PER_DAY;
	}

	public static AllWork getAllWork() {
		return allWork;
	}

	public static void setAllWork(AllWork allWork) {
		if (allWork == null) {
			return;
		}
		Employee.allWork = allWork;
	}

	public void work() {

		for (int i = 0; i < Employee.allWork.getMaxNumberOfPlacesForTasks(); i++) {
			if (this.hoursLeft != 0) {
				if (this.currentTask == null) {
					return;
				}
				this.showReport();
				int hours = this.hoursLeft - this.currentTask.getWorkingHours();

				if (hours >= 0) {
					this.currentTask.toString();
					this.setHoursLeft(hours);
					this.currentTask.setWorkingHours(0);
					this.showReport();
					this.currentTask.removeOwner();
					this.currentTask = null;
					this.setCurrentTask(Employee.allWork.getNextTask());
					Employee.allWork.setCurrentUnassignedNotFinishedTask();

				} 
				else {
					this.currentTask.toString();
					this.currentTask.setWorkingHours(hours * (-1));
					this.setHoursLeft(0);
					this.showReport();

				}

			}

		}

	}

	public void showReport() {
		System.out.print(this.name + " has " + this.hoursLeft + " hoursleft to go. ");
		if (this.currentTask != null) {
			System.out.println(this.name + "'s current task is " + this.currentTask.toString());
			return;
		}
		System.out.println(this.name + " has no current task");

	}

}
