package people;

public class Demo {

	public static void main(String[] args) {

		Person[] people = new Person[10];

		Person eli = new Person("Eli", 15, false);
		Person mario = new Person("Mario", 21, true);
		Student sasho = new Student("Aleksandar", 20, true, 3.2);
		Student sani = new Student("Sani", 23, false, 4.5);
		Employee straho = new Employee("Strahil", 30, true, 50);
		Employee desi = new Employee("Desi", 28, false, 40);

		people[0] = eli;
		people[1] = mario;
		people[2] = sasho;
		people[3] = sani;
		people[4] = straho;
		people[5] = desi;

		for (int i = 0; i < people.length; i++) {
			if (people[i] != null) {
				people[i].showPersonInfo();

			}

		}

		System.out.println("---------");
		
		for (int i = 0; i < people.length; i++) {
			if (people[i] instanceof Employee) {
				Employee employee = (Employee) people[i];
				System.out.println(employee.name + " due overtime money for two hours: " + employee.calculateOvertime(2));
			}
		}

	}

}
