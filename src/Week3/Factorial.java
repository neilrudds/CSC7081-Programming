package Week3;

/**
 * @author neilr
 *
 */
public class Factorial {

	public static void main(String[] args) {

		/****
		 * Factorial function (symbol: !) means to multiply a series of descending
		 * natural numbers 4! = 4 x 3 x 2 x 1 = 24
		 * 
		 * @param args
		 */

		// declare vars
		int number, total;

		// the factorial number (simulated from user input)
		number = 7;

		// set the number to the first part of the calculation eg 4 * 3 etc
		total = number;

		System.out.print(number + "! = " + number + " x ");

		for (int loop = number - 1; loop >= 1; loop--) {

			System.out.print(loop);
			// check if last number (if so don't output the x)
			if (loop != 1) {
				System.out.print(" x ");
			} else {
				System.out.print(" = ");
			}
			// do the maths
			total *= loop;
			// or total = total * loop;
		}
		// output the final value
		System.out.println(total);

	}

}
