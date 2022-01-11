package Week10;

/**
 * OOP Practical - Exercise 3
 * @author neilr
 *
 */

public class CalculatorUnitTester {

	public static void main(String[] args) {

		// test data
		int num1 = 10;
		int num2 = 5;

		// create a calculator object
		Calculator cal = new Calculator();
		cal.addNumbers(num1, num2);
		cal.subtractNumbers(num1, num2);
		cal.multiplyNumbers(num1, num2);
		cal.divideNumbers(num1, num2);
		cal.squareRoot(num1);
		cal.setMemory(num1);
		System.out.println(cal.getMemory());
		cal.clearMemory();

		// fun calculator test - ie the updates
		FunCalculator calF = new FunCalculator();
		System.out.println(calF.addNumbers(num1, num2));
		System.out.println(calF.subtractNumbers(num1, num2));
		System.out.println(calF.multiplyNumbers(num1, num2));
		System.out.println(calF.divideNumbers(num1, num2));
		System.out.println(calF.squareRoot(num1));
		System.out.println(calF.randonNumber());
		calF.addToMemory(num1);
		System.out.println(calF.recallFromMemory());
		calF.clearMemory();

	}

}
