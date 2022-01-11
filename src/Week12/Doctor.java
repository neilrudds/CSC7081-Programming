package Week12;

/**
 * Inheritance - SubClass
 * @author neilr
 *
 */

public class Doctor extends StaffMember {
	
	private int ward;

	/**
	 * @param firstName
	 * @param lastName
	 */
	public Doctor(String firstName, String lastName, int ward) {
		super(firstName, lastName);
		this.setWard(ward);
	}

	/**
	 * @return the ward
	 */
	public int getWard() {
		return ward;
	}

	/**
	 * @param ward the ward to set
	 */
	public void setWard(int ward) {
		this.ward = ward;
	}

	@Override
	public String toString() {
		return String.format("Doctor [firstName=%s, lastName=%s, ward=%s]", this.getFirstName(),
				this.getLastName(), this.ward);
	}
}
