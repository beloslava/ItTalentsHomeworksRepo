package homework2;

public class Demo {
	
	public static void main(String[] args) {
		
		Task work = new Task("work1", 10);
		System.out.println(work.getName());
		work.setWorkingHours(95);
		System.out.println(work.getWorkingHours());
		
		Task work2 =  new Task("work2", 5);
		
		Employee nadq = new Employee("Nadq");
		Employee emo = new Employee("Emo");
		Employee ivan = new Employee("Ivan");
		nadq.setCurrentTask(work);
		System.out.println(nadq.getCurrentTask().getName());
		System.out.println(nadq.getCurrentTask().getWorkingHours());
		nadq.setHoursLeft(6);
		nadq.work();
		System.out.println("------");
		emo.setHoursLeft(15);
		emo.setCurrentTask(work);
		emo.work();
		System.out.println("------");
		ivan.setHoursLeft(2);
		ivan.setCurrentTask(work2);
		ivan.work();
		
		
		
		
	}
	
	

}
