package Week10;

/**
 * 
 * @author neilr
 *
 */

public class GreetingsManager {

	public static void main(String[] args) {
		System.out.println("Greetings Manager App ... start");
		
		// Create an object of type MessageCentre
		MessageCentre myMessageCentre = new MessageCentre();
		
		// Invoking method of MessageCentre
		myMessageCentre.displayWelcomeMessage("pm");
		
		System.out.println("Greetings Manager App ... close");
	}

}
