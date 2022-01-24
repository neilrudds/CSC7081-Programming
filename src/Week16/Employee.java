package Week16;

/**
 * Practical 2 - OOP Interfaces
 * General Employee Definition
 * @author neilr
 */

public abstract class Employee {

    private String firstName;
    private String lastName;
    private double baseRate;

    /**
     * Default constructor
     */
    public Employee() {

    }

    /**
     * Argument based constructor
     * @param firstName
     * @param lastName
     * @param baseRate
     */
    public Employee(String firstName, String lastName, double baseRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseRate = baseRate;
    }
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName firstName will be set
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
     * @param lastName lastName will be set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the baseRate
     */
    public double getBaseRate() {
        return baseRate;
    }

    /**
     * @param baseRate The baseRate will be set
     */
    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public abstract void calculateWeeklySalary(double hours);

    public void printAll() {
        System.out.printf("[%-10s] %-20s %-20s £%.2f","Employee", this.firstName, this.lastName, this.baseRate);
    }

}