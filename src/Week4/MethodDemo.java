/**
 * 
 */
package Week4;

/**
 * @author neilr
 *
 */
public class MethodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("In main at start");
		
		// invoke the method using the method signature
		// Invoking a method
		printWhenITurnOneHundred();
		
		// Invoking a method with an argument
		printWhenOneHundred(25);
		outputName(15);
		countDown(11);
		
		// Invoking a method with multiple arguments
		countBetween(15, 22);
		min(17, 32);
		max(17, 32);
		avg(99, 80, 100, 12);
		
		// Returns a value
		int sum = addTwoNumbers(12, 13);
		System.out.println("addTwoNumbers: " + sum);
		
		System.out.println("The users name is: " + getUsersName());
		
		double number = 8;
		double power = 2;
		System.out.printf("%.2f to the power of %.2f is: %.2f\n", 
				number, power, exponentCalculation(number, power));
		
		System.out.println("In main at end");
	}
	
	// A method signature is simply the method name and parameter types
	
	/* 
	 * visibility [static] return-type method-name (parameter-list){
	 *			statements
	 * }
	 */
	public static void invokeMe() {
		System.out.println("This method was called");
	}
	
	/*	
	 * Visibility.
	 *  The visibility of a method determines whether the method is available to 
	 *  other classes. The options are
	 *  
	 *  - public		: Allows any other class to access the method
	 *  - private		: Hides the method from other classes
	 *  - protected		: Lets subclasses use the method but hides the method from
	 *  				  other classes outside the package 
	 */
	
	
	/*
	 * [static].
	 *  This optional keyword declares that the method is a static method,
	 *  which means that you can call it without first creating an instance
	 *  of the class in which it's defined
	 */
	
	/*
	 * Return Type.
	 *  The return type, indicates weather the method returns a value when it
	 *  is called - and if so, what type the value is e.g. int, double, String etc.
	 *  If the method doesn't return a value, specify void.
	 *  
	 *  If you specify a return type other than void, the method must end with
	 *  a return statement that returns a value of the correct type.
	 */
	
	/*
	 * Method Name.
	 *  The rules for making up method names are similar to variables : Use
	 *  any combination of letters and numbers, but to start with a letter
	 *  (lower case) and make it meaningful.
	 */
	
	/*
	 * Parameter List.
	 *  You can pass one or more values to a method by listing the values in
	 *  parentheses following the method name. The parameter list in the method
	 *  declaration lets Java know what types of parameters a method should
	 *  expect to receive and provides names so that the statements in the 
	 *  methods body can access the parameters as local variables.
	 *  
	 *  If the method doesn't accept parameters, you must still code the parentheses
	 *  that surround the parameter list. You just leave the parentheses empty.
	 */
	
	/*
	 * Statements.
	 *  One or more Java statements that comprise the method body, enclosed in
	 *  a set of braces. The method body requires you to use the braces even if the
	 *  body consists of only one statement.
	 */
	
	/**
	 * Print's my name to the screen 10 times
	 */
	public static void printMyName() {
		for (int i = 0; i < 10; i++) {
			System.out.println((i+1)+": Neil");
		}
	}
	
	/**
	 * Calculates the year when I turn 100
	 */
	public static void printWhenITurnOneHundred() {
		int myAge = 34;
		int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		
		System.out.printf("Neil will turn 100 in the year %d\n", (100 - myAge) + currentYear);
	}
	
	/*
	 * Declaring a method with a parameter
	 *  - Similarly, a method can require one or more parameters that represent
	 *    additional information it needs to perform its task.
	 *  - Parameters are defined in a comma-separated parameter list, which
	 *    is located inside the parentheses that follow the method name.
	 *  - Each parameter must specify a type and a variable name. The parameter
	 *    list may contain any number of parameters, including none at all.  
	 *  - Empty parentheses following the method name indicate that a method
	 *    does not require any parameters.
	 */
	
	/*
	 * Arguments to a method
	 *  A method call supplies values - called arguments - for each of the
	 *  method's parameters.
	 *  
	 *  For instance methods (methods that are not marked as static), firstly
	 *  create the class and then invoke with the correct arguments (correctly
	 *  ordered data types)
	 *  
	 *  Create the class
	 *  MethodsAndParametersExamples examples = new MethodsAndParametersExamples();
	 *  Invoke Methods
	 *  examples.weekOfYear();
	 *  examples.areaOfCircle(3.2);
	 *  examples.areaOfTriangle(2.1, 4.0);
	 */
	
	/**
	 * Calculate the year when turning 100 based on input age
	 * @param age
	 */
	public static void printWhenOneHundred(int age) {
		int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);

		System.out.printf("Someone who is %d this year,  will turn 100 in the year %d\n", age,
				(100 - age) + currentYear);
	}
	
	/**
	 * Print my name the number of specified times
	 * @param numberOfTimes
	 */
	public static void outputName(int numberOfTimes) {
		for (int i = 0; i < numberOfTimes; i++) {
			System.out.println("Neil");
		}
	}
	
	/**
	 * Count down to 0 from the input number
	 * @param startFrom
	 */
	public static void countDown(int start) {
		for (int i = start; i >= 1; i--) {
			System.out.println(i);
		}
	}
	
	/**
	 * Print the numbers in the input range (inclusive)
	 * @param start
	 * @param end
	 */
	public static void countBetween(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}
	
	/**
	 * Determines which number is smaller or if the numbers are the same
	 * @param num1
	 * @param num2
	 */
	public static void min(int num1, int num2) {
		if (num1 < num2) {
			System.out.printf("%d is smaller than %d\n", num1, num2);
		} else if (num2 < num1) {
			System.out.printf("%d is smaller than %d\n", num2, num1);
		} else {
			System.out.printf("%d is the same as %d\n", num1, num2);
		}
	}
	
	/**
	 * Determines which number is bigger or if the numbers are the same
	 * @param num1
	 * @param num2
	 */
	public static void max(int num1, int num2) {
		if (num1 > num2) {
			System.out.printf("%d is bigger than %d\n", num1, num2);
		} else if (num2 > num1) {
			System.out.printf("%d is bigger than %d\n", num2, num1);
		} else {
			System.out.printf("%d is the same as %d\n", num1, num2);
		}
	}
	
	/**
	 * Calculates the average of the 4 input numbers
	 * @param num1
	 * @param num2
	 * @param num3
	 * @param num4
	 */
	public static void avg(int num1, int num2, int num3, int num4) {
		int sum = num1 + num2 + num3 + num4;
		double avg = (double)sum/4;
		
		System.out.printf("The average is: %.2f\n", avg);
	}
	
	/*
	 * Returning a value from a method
	 *  - A method returns to the code that invoked it when it
	 *  	- Completes all the statements in the method
	 *  	- Reaches a return statement
	 *  	- throws an exception
	 *  - You declare a method's return type in it's method declaration
	 *  - Within the body of the method, you use the return statement to return
	 *    the value.
	 *  - Any method declared void doesn't return a value. It does not need
	 *    to contain a return statement
	 *  - Any method that is not declared void must contain a return statement with
	 *    a corresponding return value, like this:
	 *    - return returnValue;
	 *  - The data type of the return value must match the method's declared return
	 *    type; you can't return an int value from a method declared to return
	 *    a boolean.
	 */
	
	/**
	 * Exercise I - Returns the sum of the two input values
	 */
	public static int addTwoNumbers(int num1, int num2) {
		return num1 + num2;
	}
	
	/**
	 * Exercise II - Prompts the operator for a user name until entered
	 * @return
	 */
	public static String getUsersName() {

		String userName = "";
		java.util.Scanner scan = new java.util.Scanner(System.in);

		do {
			System.out.println("Please enter your username...");
			userName = scan.nextLine();
		} while (userName.length() <= 0); // or userName.equals("") or isBlank(), not userName == "" 

		scan.close();
		return userName;
	}
	
	/**
	 * Exercise III - Calculate the exponent
	 * @param number
	 * @param power
	 * @return
	 */
	public static double exponentCalculation(double number, double power) {
		return Math.pow(number, power);
	}
}
