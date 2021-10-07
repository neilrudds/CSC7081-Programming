/**
 * 
 */
package Week2;

import java.util.Scanner;

/**
 * @author neilr.
 *
 */
public class AreaOfSquare {

	/**
	 * Input the length of a side on a square and calculate the perimiter and the
	 * area.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		double side = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the side of the square (in cms) ?");
		side = scanner.nextDouble();

		System.out.printf("Perimiter: %.2f %s", side * 4, " cm \n");
		System.out.printf("Area     : %.2f %s", Math.pow(side, 2), " cm2");

		scanner.close();

	}

}