package Week2;

import java.util.Scanner;

/**
 * @author neilr
 *
 */
public class SquareRootCalculator {

	/**
	 * Program calculates the sqrt of a number
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		double inputNum;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number...");
		// read from the keyboard
		inputNum = scanner.nextDouble();
		// output the value
		System.out.println("Square root is: " + Math.sqrt(inputNum));
		scanner.close();
	}

}