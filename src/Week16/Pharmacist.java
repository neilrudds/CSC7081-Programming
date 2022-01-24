package Week16;

/**
 * Practical 2 - OOP Interfaces
 * Pharmacist, Extends Employee
 * @author neilr
 */

public class Pharmacist extends Employee implements AdministerDrugs {

    private int grade;
    private double bonus;

    /**
     * Default constructor
     */
    public Pharmacist() {

    }

    /**
     * Argument based constructor
     * @param firstName
     * @param lastName
     * @param baseRate
     * @param grade
     * @param bonus
     */
    public Pharmacist(String firstName, String lastName, double baseRate, int grade, double bonus){
        super(firstName, lastName, baseRate);
        this.grade = grade;
        this.bonus = bonus;
    }

    /**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	/**
	 * Displays the Pharmacist's details
	 */
	@Override
	public void printAll() {
		System.out.printf(
				"[%-10s] %-20s %-20s £%.2f Grade : %d, Bonus : £%-20.2f",
				"Pharmacist", this.getFirstName(), this.getLastName(),
				this.getBaseRate(), this.grade, this.bonus);
	}

    /**
	 * Calculates the weekly salary for the Pharmacist
	 */
	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.printf(
				"%-10s %-10s [%-20s] : %.2fhrs * £%.2f + £%.2f = £%.2f ",
				this.getFirstName(), this.getLastName(), "Pharacist", hours,
				this.getBaseRate(), this.bonus,
				(hours * this.getBaseRate() + this.bonus));
	}

    @Override
    public boolean adminControlledDrug() {
        return true;
    }

    @Override
    public boolean adminNoncontrolledDrug() {
        return true;
    }
}
