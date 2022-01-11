package Week12;

public class Surgeon extends Doctor {
	
	private String speciality;

	public Surgeon(String firstName, String lastName, int ward, String speciality) {
		super(firstName, lastName, ward);
		this.setSpeciality(speciality);
	}

	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
