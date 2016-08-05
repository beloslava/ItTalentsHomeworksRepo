package homework2;

public class Task {

	private String name;
	private double workingHours;

	Task(String name, double workingHours) {
		if (name != null && !(name.equals(""))) {
			this.name = name;
		}
		if (workingHours >= 0 && workingHours < 18) {
			this.workingHours = workingHours;
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

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		if (workingHours >= 0 && workingHours < 18) {
			this.workingHours = workingHours;
		}
	}

}
