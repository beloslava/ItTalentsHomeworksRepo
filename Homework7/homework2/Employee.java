package homework2;

public class Employee {

	private String name;
	private Task currentTask;
	private double hoursLeft;

	Employee(String name) {
		if (name != null && !(name.equals(""))) {
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !(name.equals(""))) {
			this.name = name;
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	public double getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(double hoursLeft) {
		if (hoursLeft < 18 && hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		}
	}
	
	public void work(){
		if(currentTask != null){
			if(this.hoursLeft > currentTask.getWorkingHours()){
				this.hoursLeft -= currentTask.getWorkingHours();
				currentTask.setWorkingHours(0);
			}
			else{
				currentTask.setWorkingHours(currentTask.getWorkingHours() -  this.hoursLeft);
				this.hoursLeft = 0;
			}
			showReport();
		}
		
	}
	
	public void showReport(){
		System.out.println("The name of employee: " + this.getName());
		System.out.println("The name of current task: " + this.currentTask.getName());
		System.out.println("Working hours left: " + this.getHoursLeft());
		System.out.println("Hours left to get job done: " + this.currentTask.getWorkingHours());
		
	}

}
