package office;

public class AllWork {

	private static final int DEFAULT_NUMBER_OF_TASKS = 10;
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	private int indexForAdding;

	public AllWork() {
		this.tasks = new Task[DEFAULT_NUMBER_OF_TASKS];
		this.freePlacesForTasks = DEFAULT_NUMBER_OF_TASKS;
		this.currentUnassignedTask = -1;
		this.indexForAdding = 0;
	}

	public void addTask(Task task) {
		if (task == null) {
			return;
		}
		this.tasks[indexForAdding] = task;
		this.freePlacesForTasks --;
		indexForAdding = (indexForAdding + 1) % this.tasks.length;
		this.setCurrentUnassignedNotFinishedTask();

	}

	public void setCurrentUnassignedNotFinishedTask() {
		for (int i = 0; i < this.tasks.length; i++) {
			if (this.tasks[i] != null && this.tasks[i].hasNoOwner() && this.tasks[i].getWorkingHours() != 0) {
				this.currentUnassignedTask = i;
				return;
			}
		}
		this.currentUnassignedTask = -1;
	}

	public Task getNextTask() {
		if (this.currentUnassignedTask == -1) {
			return null;
		}
		Task temp = this.tasks[currentUnassignedTask];
		return temp;
	}

	boolean isAllWorkDone() {
		for (int i = 0; i < tasks.length; i++) {
			if (this.tasks[i] != null && tasks[i].getWorkingHours() != 0) {
				return false;
			}
		}
		return true;
	}

	public void showAllTasks() {
		for (int i = 0; i < tasks.length; i++) {
			if (this.tasks[i] != null) {
				System.out.println(this.tasks[i].toString());
			}

		}
	}

	public int getMaxNumberOfPlacesForTasks() {
		return this.tasks.length;
	}

	public int getFreePlacesForTasks() {
		return this.freePlacesForTasks;
	}

}
