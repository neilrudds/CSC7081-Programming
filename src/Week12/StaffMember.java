package Week12;

/**
 * Inheritance & Abstraction - Staff Member SuperClass
 * @author neilr
 */

public abstract class StaffMember {
	
	private String firstName;
	private String lastName;
	
	/*public StaffMember() {
		// Empty default constructor
	}*/
	
	/**
	 * @param firstName
	 * @param lastName
	 */
	public StaffMember(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("StaffMember [firstName=%s, lastName=%s]", firstName, lastName);
	}
}
