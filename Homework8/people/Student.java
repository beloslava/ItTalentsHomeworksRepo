package people;

public class Student extends Person {

	private double score;

	Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.name = name;
		this.age = age;
		this.isMale = isMale;
		this.setScore(score);
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score <= 6 && score >= 2) {
			this.score = score;
		}
	}

	/**
	 * method that shows student's info
	 */
	@Override
	public void showPersonInfo() {
		System.out.println("Student:");
		super.showPersonInfo();
		System.out.println("Score: " + this.getScore());
	}

}
