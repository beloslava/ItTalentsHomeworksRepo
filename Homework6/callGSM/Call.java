package callGSM;

public class Call {

	static int priceForAMinute = 2;
	String caller;
	String receiver;
	int duration;
	public static void main(String[] args) {
		
		GSM one = new GSM();
		one.model = "Nokia";
		one.insertSimCard("0889123456");
		
		GSM two = new GSM();
		two.model = "Samsung";
		two.insertSimCard("0885548970");
		
		two.call(one,2);
		two.call(one,5);
		two.call(one,10);
		one.call(two,10);
		one.call(two,8);
		one.call(two,7);
		
		one.printForLastOutgoingCall();
		one.printForLastIncomingCall();
		two.printForLastOutgoingCall();
		two.printForLastIncomingCall();
		
		System.out.println("The total sum for the calls of " + one.model + " is " + one.getSumForCalls());
		System.out.println("The total for the calls of " + two.model + " is " + two.getSumForCalls());
		
		//testing the errors with call parameters
				one.call(one,2);
				one.call(two,-1);
		//testing the removeSimCard method
		one.removeSimCard();
		one.call(two,2);
		//testing invalid simCardNumber error
		one.insertSimCard("abd123abc");
	}
	
}
