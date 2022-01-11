package Week13;

/**
 * Makes use of the Lecturer and Research classes which both extend the Employee class
 * @author neilr
 */

public class CreateStaff {

	public static void main(String[] args) {
		
		// Lecturer Ref
		Lecturer lect1 = new Lecturer();
		lect1.setFirstName("Aidan");
		lect1.setLastName("McG");
		lect1.calculateSalary(10, 40);
		
		// Employee Ref
		Lecturer emp1 = new Lecturer();
		emp1.setFirstName("Albert");
		emp1.setLastName("Einstein");
		emp1.calculateSalary(10, 40);
		
		// Reader Ref
		Reader r = new Reader();
		r.calculateSalary(10, 40);
	}

}
