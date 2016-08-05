package college;

public class StudentGroup {

	private String groupSubject;
	Student[] students;
	int freePlaces;

	StudentGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	StudentGroup(String groupSubject) {
		this();
		this.groupSubject = groupSubject;

	}

	public String getGroupSubject() {
		return groupSubject;
	}

	public void setGroupSubject(String groupSubject) {
		if (groupSubject != null && !(groupSubject.equals(""))) {
			this.groupSubject = groupSubject;
		}
	}

	void addStudent(Student student) {
		if (student.getSubject().equals(this.groupSubject) && this.freePlaces > 0) {
			students[students.length - freePlaces--] = student;

			// for (int i = 0; i < students.length; i++) {
			// if(students[i] == null){
			// students[i] = student;
			// break;
			// }
			// }
			// freePlaces--;
		}
	}

	void emptyGroup() {
		// for (int i = 0; i < students.length; i++) {
		// students[i] = null;
		// }
		students = new Student[5];
		freePlaces = 5;
	}

	String theBestStudent() {
		double maxGrade = 0;
		Student bestStudent = null;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getGrade() > maxGrade) {
				maxGrade = students[i].getGrade();
				bestStudent = students[i];
			}

		}
		return bestStudent.getName();
	}

	void printStudentsInGroup() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println("Name: " + students[i].getName());
				System.out.println("Student's subject: " + students[i].getSubject());
				System.out.println("Stusent's grade: " + students[i].getGrade());
				System.out.println("Student's year in college: " + students[i].getYearInCollege());
				System.out.println("Student's age: " + students[i].getAge());
				System.out.println("Student's status of degree: " + students[i].isDegree);
				System.out.println("Student's money: " + students[i].getMoney());
				System.out.println();
			}
		}
	}

}
