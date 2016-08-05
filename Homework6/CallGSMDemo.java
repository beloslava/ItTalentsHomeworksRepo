
public class CallGSMDemo {

	public static void main(String[] args) {

		// Call call1 = new Call();

		GSM gsm1 = new GSM();
		gsm1.model = "Nokia";
		String number = gsm1.simMobileNumber = "0899898949";

		GSM gsm2 = new GSM();
		gsm2.model = "LG";
		gsm2.simMobileNumber = "0845648441";

		gsm1.insertSimCard(number);
		System.out.println(gsm1.hasSimCard);
		// gsm1.removeSimCard();
		// System.out.println(gsm1.hasSimCard);

		gsm2.insertSimCard("0845648441");
		System.out.println(gsm2.hasSimCard);

		gsm1.call(gsm2, 256);
		gsm2.call(gsm1, 15);
		gsm2.call(gsm1, 10);
		System.out.println(gsm1.outgoingCallsDuration);
		System.out.println(gsm2.outgoingCallsDuration);
		System.out.println(gsm1.lastIncomingCall.duration);
		gsm1.printInfoForTheLastIncomingingCall();
		System.out.println("====");
		gsm1.printInfoForTheLastOutgoingCall();
		System.out.println("====");
		gsm2.printInfoForTheLastIncomingingCall();

		//gsm2.getSumForCall();

	}

}
