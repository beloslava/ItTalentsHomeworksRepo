package college;

public class Student {

	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	boolean isDegree;
	private double money;

	Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;

	}

	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		if (age > 18 && age < 100) {
			this.age = age;
		} else {
			this.age = 18;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if (subject != null && !(subject.equals(""))) {
			this.subject = subject;
		}
		this.subject = subject;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		if(grade > 0 && grade < 10){
			this.grade = grade;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 18 && age < 100 ){
			this.age = age;
		}
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		if(money > 0){
			this.money = money;
		}
	}

	public int getYearInCollege() {
		return yearInCollege;
	}

	public void setYearInCollege(int yearInCollege) {
		if (yearInCollege > 0 && yearInCollege < 5 && this.yearInCollege < yearInCollege) {
			this.yearInCollege = yearInCollege;
		}
	}

	void upYear() {
		if (yearInCollege >= 5) {
			isDegree = true;
			System.out.println(this.name + " is degreed");
		}
		if (isDegree == false) {
			yearInCollege++;
		}

	}

	double receiveScholarship(double minGrade, double amount) {
		if (minGrade > 0 && amount > 0) {
			if (grade >= minGrade && (age < 30 && age > 18)) {
				money += amount;
			}
		}
		return money;
	}

}
