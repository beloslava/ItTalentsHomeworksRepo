package callGSM;

public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	
	
	void insertSimCard(String mobileNumber){
		String regex = "(08)[0-9]{8}";
		if (!mobileNumber.matches(regex)) {
	        System.err.println("Invalid phone number");
	    }
		else{
			simMobileNumber = mobileNumber;
			hasSimCard = true;
		}
	}
	
	void removeSimCard(){
		hasSimCard = false;
	}
	
	void call(GSM receiver, int duration){
		if(duration<0)
			System.err.println("The call duration is not valid");

		else if(receiver.simMobileNumber.matches(simMobileNumber))
			System.err.println("You can't call yourself");
		
		else if(!(hasSimCard && receiver.hasSimCard))
			System.err.println("One or both phones don't have a sim card");
		
		else{
			Call call = new Call();
			call.duration = duration;
			call.caller = simMobileNumber;
			call.receiver = receiver.simMobileNumber;
			outgoingCallsDuration = outgoingCallsDuration + duration;
			lastOutgoingCall = call;
			receiver.lastIncomingCall = call;
		}
	}
	
	int getSumForCalls(){
		int sum = outgoingCallsDuration*Call.priceForAMinute;
		return sum;
	}
	
	void printForLastOutgoingCall(){
		System.out.println("Outgoing call log for " + model);
		System.out.println("The last number called is " + lastOutgoingCall.receiver);
		System.out.println("The call was " + lastOutgoingCall.duration + " minutes long");
		System.out.println("The price of the call was " + lastOutgoingCall.duration*Call.priceForAMinute);
		System.out.println("---------------");
	}
	
	void printForLastIncomingCall(){
		System.out.println("Incoming call log for " + model);
		System.out.println("The last number that called you is " + lastIncomingCall.caller);
		System.out.println("The call was " + lastIncomingCall.duration + " minutes long");
		System.out.println("The price of the call was " + lastIncomingCall.duration*Call.priceForAMinute);
		System.out.println("---------------");
	}
	
}
