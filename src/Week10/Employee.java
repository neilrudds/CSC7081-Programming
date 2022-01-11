package Week10;

/**
 * 
 * @author neilr
 *
 */

public class Employee {

	private String firstName;
	private String lastName;
	private int employeeNumber;
	public static int count = 0; // Static Variable Declaration, set at 0 initially
	
	/**
	 * Constructor with arguments. Sets details including employee number
	 * @param firstNameP
	 * @param lastNameP
	 */
	public Employee(String firstNameP, String lastNameP) {
		
		// new employee - update count (set globally) each time an employee is created
		// the employee count is updated and the value assigned to the new employee's 
		// staff number
		count++;
		this.firstName = firstNameP;
		this.lastName = lastNameP;
		employeeNumber = count;
	}
	
	/**
	 * Show all details
	 */
	public void displayDetails() {
		System.out.println("Employee [firstName=" + firstName + ", lastName=" + lastName + 
				", employeeNumber=" + employeeNumber + "]");
	}
	
}
