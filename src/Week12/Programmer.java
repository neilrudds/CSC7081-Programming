package Week12;

/**
 * Inheritance - SubClass
 * @author neilr
 *
 */

public class Programmer extends StaffMember {
	
	private String language;

	/**
	 * Constructor for programmer, just names. Language defaults to "UNDECLARED"
	 * @param firstName
	 * @param lastName
	 */
	public Programmer(String firstName, String lastName) {
		super(firstName, lastName);
		this.language = "UNDECLARED";
	}
	
	/**
	 * Constructor to set all fields of a Programmer Object
	 * @param firstName
	 * @param lastName
	 * @param language
	 */
	public Programmer(String firstName, String lastName, String language) {
		super(firstName, lastName);
		this.setLanguage(language);
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String toString() {
		return "A Programmer called "+ this.getFirstName()+ " " +
				this.getLastName() + " specialising in " + this.language;
	}

}
