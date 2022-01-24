package Week16;

/**
 * Practical 2 - OOP Interfaces
 * Surgeon, Extends Employee
 * @author neilr
 */

public class Surgeon extends Employee implements AdministerDrugs {
    
    /**
	 * The specialist area for the surgeon
	 */
	private String specialistArea;
	
	/**
	 * The consultation fee
	 */
	private double consultationFee;

	/**
	 * Default constructor
	 */
	public Surgeon() {

    }

	/**
	 * Constructor with args
	 * 
	 * @param specialistArea
	 * @param consultationFee
	 */
	public Surgeon(String firstName, String lastName, double baseRate,
			String specialistArea, double consultationFee) {
		super(firstName, lastName, baseRate);
		this.specialistArea = specialistArea;
		this.consultationFee = consultationFee;
	}

	/**
	 * @return the specialistArea
	 */
	public String getSpecialistArea() {
		return specialistArea;
	}

	/**
	 * @param specialistArea the specialistArea to set
	 */
	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}

	/**
	 * @return the consultationFee
	 */
	public double getConsultationFee() {
		return consultationFee;
	}

	/**
	 * @param consultationFee the consultationFee to set
	 */
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}

	// @Override
	public void calculateWeeklySalary(double hours) {
		System.out.printf(
				"%-10s %-10s [%-20s] : %.2fhrs * £%.2f + £%.2f = £%.2f ",
				this.getFirstName(), this.getLastName(), "Surgeon", hours,
				this.getBaseRate(), this.consultationFee,
				(hours * this.getBaseRate() + this.consultationFee));
	}

	/**
	 * Displays the surgeon's details
	 */
	@Override
	public void printAll() {
		System.out
				.printf("[%-10s] %-20s %-20s £%.2f Specialist Area : %s, Consultation Fee :£%.2f",
						"Surgeon", this.getFirstName(), this.getLastName(),
						this.getBaseRate(), this.getSpecialistArea(),
						this.getConsultationFee());
	}

    @Override
    public boolean adminControlledDrug() {
        return false;
    }

    @Override
    public boolean adminNoncontrolledDrug() {
        return true;
    }
}