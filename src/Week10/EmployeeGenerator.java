package Week10;

/**
 * 
 * @author neilr
 *
 */

public class EmployeeGenerator {

	public static void main(String[] args) {
		// Create Employee
		Employee emp1 = new Employee("Ashley", "Young");
		
		// Create another Employee
		Employee emp2 = new Employee("Gareth", "Bale");
		
		// Show All
		emp1.displayDetails();
		emp2.displayDetails();
	}

}
