package Week11;

/**
 * Control of a variable initialisation
 * @author neilr
 *
 */
public class Footballer {
	
	// static class level variables
	public static int count;
	
	// instance variables
	String firstName;
	String lastName;
	int employerNumber = 0;
	int squadNumber = 0;
	
	public Footballer() {
		
	}
	
	public Footballer(String firstName, String lastName, int squadNumber, int employerNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employerNumber = employerNumber;
		// Setting via the setter (due to validation rule)
		this.setSquadNumber(squadNumber);
		count++;
	}
	
	/**
	 * Sets the squad number
	 * @param squadNumber the squad number to set (limited to 1 to 30)
	 * otherwise will be set to 0
	 */
	public void setSquadNumber(int squadNumber) {
		if (squadNumber >= 1 && squadNumber <= 30) {
			this.squadNumber = squadNumber;
		} else {
			this.squadNumber = 0;
			System.out.println("Sorry, the squad number was invalid.");
		}
	}
}
