package Week16;

/**
 * Practical 2 - OOP Interfaces
 * @author neilr
 */

public class PayrollManager {

    // Static variable to hold employees
	public static Employee[] employees = new Employee[6];

	public static int HOURS_PER_WEEK = 35;

	/**
	 * Constructor for class
	 * @return 
	 */
	public void PayrollManger() {

    }

	public static void main(String[] args) {

		// create all employees
		Porter porter1 = new Porter("Ivana", "Patient", 10.50, "Royal");
		Porter porter2 = new Porter("Amanda", "Pushabed", 10.50, "BCH");
		Surgeon surgeon1 = new Surgeon("Jack", "Ripper", 55.25, "Renal", 650.00);
		Surgeon surgeon2 = new Surgeon("Edward", "Lister", 55.25, "Vascular", 800.00);
		Pharmacist pharmacist = new Pharmacist("Poppy", "Pill", 30.50, 7, 750);

		// call method to handle adding the employees to the list
		addEmployeeToList(porter1);
		addEmployeeToList(porter2);
		addEmployeeToList(surgeon1);
		addEmployeeToList(surgeon2);
		addEmployeeToList(pharmacist);

		// show all employees
		displayAllEmployees();
		System.out.println();
		// run payroll
		processWeeklyPayroll();

        System.out.println("Surgeon : Admin Controlled Drug : " + surgeon1.adminControlledDrug());
        System.out.println("Surgeon : Admin Noncontrolled Drug : " + surgeon1.adminNoncontrolledDrug());

        System.out.println("Pharmacist : Admin Controlled Drug : " + pharmacist.adminControlledDrug());
        System.out.println("Pharmacist : Admin Noncontrolled Drug : " + pharmacist.adminNoncontrolledDrug());

	}

	/**
	 * Adds new employee type to the list. Checks if there is room in the list
	 * before doing so.
	 * 
	 * @param employee
	 */
	public static void addEmployeeToList(Employee employee) {

		for (int loop = 0; loop < employees.length; loop++) {
			if (employees[loop] == null) {
				// add the employee to the empty array index
				employees[loop] = employee;
				break;
			}
		}

	}

	/**
	 * Displays details of all employees in the system
	 */
	public static void displayAllEmployees() {
		System.out.println("Display all employees ________________________________");
		int totalEmployees = 0;
		System.out.printf("[%-10s] %-20s %-20s %-6s %s \n", "Type",
				"First name", "Last name", "Rate", "Other", "Consultation Fee");
		for (Employee e : employees) {
			// check if the array index is not null
			if (e != null) {
				e.printAll();
				totalEmployees++;
				System.out.println(); // line break
			} else {
				// no more records so quit loop
				break;
			}
		}
		System.out.println("Total employees in system : " + totalEmployees);
		System.out.println("______________________________________________________");
	}

	/**
	 * Processes the weekly salary for each employee
	 */
	public static void processWeeklyPayroll() {
		System.out.println("Payroll run..... _____________________________________");
		int totalEmployees = 0;
		for (Employee e : employees) {
			// check if the array index is not null
			if (e != null) {
				e.calculateWeeklySalary(HOURS_PER_WEEK);
				totalEmployees++;
				System.out.println(); // line break
			} else {
				// no more records so quit loop
				break;
			}
		}
		System.out.println("Total records processed : " + totalEmployees);
		System.out.println("______________________________________________________");
	}
}