package Week2;

import java.util.Scanner;

/**
 * @author neilr
 *
 */
public class Practical3Part1 {

	/**
	 * Program reads in a decimal number and performs calculations using static
	 * classes
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		double userInput = 0.0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a decimal point number in the format xx.xxxx e.g. 12.3456");
		userInput = scanner.nextDouble();
		System.out.println();

		System.out.printf("Number rounded (two decimal places)\t : %.2f\n", userInput);
		System.out.printf("Number squared (three decimal places)\t : %.3f\n", Math.pow(userInput, 2));
		System.out.printf("Number cubed (two decimal places)\t : %.3f\n", Math.pow(userInput, 3));
		System.out.printf("Square root (four decimal places)\t : %.4f\n", Math.sqrt(userInput));

		scanner.close();
	}

}
