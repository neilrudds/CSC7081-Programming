package Week13;

/**
 * Abstract Class
 * 
 * Using the word abstract to declare a class abstract
 * Trying to instantiate this class would result in the "Cannot instantiate the type Employee" compile error
 * 
 * Abstraction refers to the ability to make a class abstract in OOP.
 * An abstract class is one that cannot be instantiated.
 * All other functionality of the class still exists, and its fields, methods, and constructors are all
 * 	accessed in the same manner.
 * You just cannot create an instance of the abstract class.
 * 
 * If a class is abstract and cannot be instantiated, the class does not have much use unless it is subclassed.
 * This is typically hos abstract classes come about during the design phase.
 * A parent class contains the common functionality of a collection of child classes, but the parent class itself is
 * 	too abstract to be used on its own.
 * 
 * @author neilr
 */

public abstract class Employee { 
	
	private String firstName;
	private String lastName;
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
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
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @param rate the hourly rate
	 * @param hours the number of hours
	 */
	public void calculateSalary(int rate, int hours) {
		System.out.println("Salary : " + (rate*hours));
	}
	
	/**
	 * Abstract Methods - If you want a class to contain a particular method but you want
	 * 	the actual implementation of that method to be determined by child classes, you can
	 *  declare the method in the parent class as abstract.
	 * The abstract keyword is also used to declare a method as abstract. An abstract method
	 *  consists of a method signature, but no method body.
	 *  
	 * Declare abstract method - Abstract method would have no definition, and its signature
	 *  is followed by a semicolon, not curly braces.
	 * 
	 * Declaring a method as abstract has two results:
	 * 1 - The class must also be declared as abstract
	 * 2 - Any child class must either override the abstract method or declare
	 * 	itself abstract. A child class that inherits an abstract method must override
	 * 	it. If they do not, they must be abstract and any of their children must override it.
	 * 	Eventually, a descendant class has to implement the abstract method; otherwise, you
	 * 	would have a hierarchy of abstract classes that cannot be instantiated. 
	 * 
	 * @param totalHoursWorked number of hours worked in this period
	 * @param totalDaysWorked number of consecutive days worked in this period
	 */
	public abstract void calculateAverageHoursPerDay(int totalHoursWorked, int totalDaysWorked);

}
