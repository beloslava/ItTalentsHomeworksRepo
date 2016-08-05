
public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutcomingCall;

	void insertSimCard(String simMobileNumber) {
		for (int i = 0; i < simMobileNumber.length(); i++) {
			if (!(simMobileNumber.startsWith("08")) || simMobileNumber.length() != 10
					|| !(simMobileNumber.charAt(i) < 58 && simMobileNumber.charAt(i) > 47)) {
				hasSimCard = false;
				break;
			} else {
				this.simMobileNumber = simMobileNumber;
				hasSimCard = true;
			}
		}
	}

	// void insertSimCard(String simMobileNumber) {
	// if(simMobileNumber.matches("(08)[0-9]{10}")){
	// this.simMobileNumber = simMobileNumber;
	// hasSimCard = true;
	// }
	// }

	void removeSimCard() {
		hasSimCard = false;
	}

	//Call callEx = new Call();

	void call(GSM receiver, int duration) {

		if (duration <= 0 || this.equals(receiver) || !(receiver.hasSimCard == true) || !(this.hasSimCard == true)) {
			System.out.println("Invalid data");
		} else {
			Call callEx = new Call();
			callEx.duration = duration;
			this.lastOutcomingCall = callEx;
			receiver.lastIncomingCall = callEx;
			this.outgoingCallsDuration += duration;
		}
	}

	double getSumForCall() {
		double sum = 0;
		sum = this.outgoingCallsDuration * Call.PRICE_FOR_A_MIN;
		System.out.println("The sum of the outgoing calls is: " + sum);
		return sum;
	}

	void printInfoForTheLastOutgoingCall() {
		if (lastOutcomingCall != null) {
			System.out.println("The model of the telefon is: " + this.model);
			System.out.println("Sim Mobile Number of the telefon is: " + this.simMobileNumber);
			//System.out.println("Sim Mobile Number of the receiver is: " + this.lastOutcomingCall.receiver.simMobileNumber);
			System.out.println("The duration of the call is: " + this.lastOutcomingCall.duration);
		}
	}

	void printInfoForTheLastIncomingingCall() {
		System.out.println("The model of the telefon is: " + this.model);
		System.out.println("Sim Mobile Number of the telefon is: " + this.simMobileNumber);
		// System.out.println("Sim Mobile Number of the receiver is: " + lastIncomingCall.caller.simMobileNumber);
		System.out.println("The duration of the call is: " + this.lastIncomingCall.duration);

	}

}
