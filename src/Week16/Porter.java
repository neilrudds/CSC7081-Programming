package Week16;

/**
 * Practical 2 - OOP Interfaces
 * Porter, Extends Employee
 * @author neilr
 */

public class Porter extends Employee {
    
    /**
	 * The site the porter is assigned to
	 */
	private String site;
	
	/**
	 * Default constructor
	 */
	public Porter() {

	}

	/**
	 * Constructor with args
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Porter(String firstName, String lastName, double baseRate, String site) {
		super(firstName, lastName, baseRate);
		this.site = site;
	}

	/**
	 * Gets the site for the porter
	 * @return the site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * Sets the porter's site
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}
	
	/**
	 * Displays the porter's details
	 */
	@Override
	public void printAll(){
		System.out.printf("[%-10s] %-20s %-20s £%.2f Site : %s","Porter",this.getFirstName(), this.getLastName(), this.getBaseRate(), this.site);
	}
	
	/**
	 * Calculates the weekly salary for the Pharmacist
	 */
	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.printf(
				"%-10s %-10s [%-20s] : %.2fhrs * £%.2f  = £%.2f ",
				this.getFirstName(), this.getLastName(), "Porter", hours,
				this.getBaseRate(),
				(hours * this.getBaseRate()));
	}
}
