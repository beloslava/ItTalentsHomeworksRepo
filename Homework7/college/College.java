package college;

public class College {

	public static void main(String[] args) {

		StudentGroup st1 = new StudentGroup();
		System.out.println(st1.students.length);
		st1.emptyGroup();
		System.out.println(st1.students.length);

		Student ivo = new Student("Ivo Atanasov", "dancer", 10);
		Student ivana = new Student("Ivana Andreeva", "dancer", 23);
		Student ana = new Student("Ana Ivanova", "swimingCoach", 19);
		Student petyo = new Student("Petyo Byndev", "swimingCoach", 19);
		Student mimi = new Student("Marya Nesheva", "dancer", 21);

		StudentGroup dancers = new StudentGroup("dancer");

		ivo.setYearInCollege(4);

		ivo.upYear();
		System.out.println("Ivo's year in college " + ivo.getYearInCollege());
		System.out.println("Petyo's year in college " + petyo.getYearInCollege());

		ana.receiveScholarship(3, 100);
		System.out.println("Ana's money: " + ana.getMoney());

		//mimi.receiveScholarship(0, 50);
		System.out.println("Marya's money: " + mimi.getMoney());

		dancers.addStudent(ivana);
		dancers.addStudent(mimi);
		dancers.addStudent(ivo);
		dancers.printStudentsInGroup();

		mimi.setGrade(5.4);
		mimi.setAge(20);
		mimi.setMoney(50);
		//mimi.receiveScholarship(0, 50);
		mimi.setMoney(mimi.receiveScholarship(1, 100));
		System.out.println("Marya's money  " + mimi.getMoney());
	

		System.out.println("Ivo's age: " + ivo.getAge());

		System.out.println("The best student in the group is: " + dancers.theBestStudent());
		System.out.println(dancers.freePlaces);
		
		dancers.printStudentsInGroup();
		
		ivana.setYearInCollege(2);
		System.out.println(ivana.getYearInCollege());


	}

}
