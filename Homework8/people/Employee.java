package people;

public class Employee extends Person {
	
	static final double WORKING_HOURS_PER_DAY = 8;
	private double daySalary;
	private double moneyOvertime;

	Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.name = name;
		this.age = age;
		this.isMale = isMale;
		this.setDaySalary(daySalary);
		this.isEmployee = true;
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary > 0) {
			this.daySalary = daySalary;
		}
	}

	/**
	 * method that calculate due overtime money
	 * @param overtime hours that employee worked
	 * @return due overtime money
	 */
	public double calculateOvertime(double hours) {
		if (this.age < 18) {
			moneyOvertime = 0;
			return moneyOvertime;
		} else {
			moneyOvertime = (daySalary / WORKING_HOURS_PER_DAY) * 1.5;
			return hours * moneyOvertime;
		}
	}

	/**
	 * method that shows employee's info
	 */
	@Override
	public void showPersonInfo() {
		System.out.println("Employee:");
		super.showPersonInfo();
		System.out.println("Daysalary: " + this.getDaySalary());
	}

}
