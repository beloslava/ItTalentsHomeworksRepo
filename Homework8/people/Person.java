package people;

public class Person {

	protected String name;
	protected int age;
	protected boolean isMale;
	protected boolean isEmployee = false;

	Person(String name, int age, boolean isMale) {
		if (name != null && !(name.equals(""))) {
			this.name = name;
		}
		if (age > 0) {
			this.age = age;
		}
		this.isMale = isMale;
	}

	/**
	 * method that shows person's info
	 */
	public void showPersonInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Sex: " + (this.isMale ? "Male" : "Female"));
	}

}
