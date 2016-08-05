package office;

public class Task {

	private String name;
	private int workingHours;
	private Employee owner;

	Task(String name, int workingHours) {
		if (name != null && !(name.equals(""))) {
			this.name = name;
		}
		if (workingHours >= 0 && workingHours < 18) {
			this.workingHours = workingHours;
		}
	}

	public void setOwner(Employee owner) {
		if (owner == null) {
			return;
		}
		this.owner = owner;
	}

	public void removeOwner() {
		this.owner = null;
	}

	public String getName() {
		return name;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if (workingHours >= 0 && workingHours < 18) {
			this.workingHours = workingHours;
		}
		else{
			return;
		}
	}

	public boolean hasNoOwner() {
		if (this.owner == null) {
			return true;
		}
		return false;

	}

	@Override
	public String toString() {

		return this.getName() + " - " + this.getWorkingHours() + " hours left to done it.";

	}

}
