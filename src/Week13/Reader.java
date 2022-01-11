package Week13;

/***
 * Extends the Abstract Class Employee
 * @author neilr
 */

public class Reader extends Employee {
	
	private String research;
	
	/**
	 * @return research
	 */
	public String getResearch() {
		return research;
	}
	
	/**
	 * @param research the research to set
	 */
	public void setResearch(String research) {
		this.research = research;
	}
	
	/**
	 * Abstract method implemented in the child class
	 */
	public void calculateAverageHoursPerDay(int totalHoursWorked, int totalDaysWorked) {
		System.out.println("Average hours worked : " + (totalHoursWorked/totalDaysWorked));
	}

}
