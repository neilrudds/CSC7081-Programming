package Week13;

/***
 * Extends the Abstract Class Employee and overrides the calculateSalary method
 * @author neilr
 */

public class Lecturer extends Employee {
	
	private String school;

	public Lecturer() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}
	
	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	
	/**
	 * @Override is an annotation which:
	 * When a method in a subclass has the same name, same parameters or signature, and same 
	 * return type(or sub-type) as a method in its super-class, then the method in the subclass
	 *  is said to override the method in the super-class. Method overriding is one of the way 
	 *  by which java achieve Run Time Polymorphism.
	 */
	
	@Override
	public void calculateSalary(int rate, int hours) {
		System.out.println("Salary for Lecturer : " + (rate*hours*2));
	}
	
	/**
	 * Abstract method implemented in the child class
	 */
	public void calculateAverageHoursPerDay(int totalHoursWorked, int totalDaysWorked) {
		System.out.println("Average hours worked : " + (totalHoursWorked/totalDaysWorked));
	}

}
