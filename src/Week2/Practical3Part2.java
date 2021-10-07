package Week2;

import java.util.Scanner;

/**
 * @author neilr
 *
 */
public class Practical3Part2 {

	/**
	 * Program reads in the user's exam mark and uses different IF statements to
	 * return the same results
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int score = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your mark: ");
		score = scanner.nextInt();
		System.out.println();

		// Option 1 - Nested IF..ELSE
		if (score < 0) {
			System.out.println("Sorry, the number entered is out of range...");
		} else {
			if (score <= 49) {
				System.out.println("Fail");
			} else {
				if (score <= 59) {
					System.out.println("Pass");
				} else {
					if (score <= 69) {
						System.out.println("Merit");
					} else {
						if (score <= 100) {
							System.out.println("Distinction");
						} else {
							System.out.println("Sorry, the number entered is out of range...");
						}
					}
				}
			}
		}

		// Option 2 - Only IF's, skip over where not true
		if (score >= 0 && score <= 49) {
			System.out.println("Fail");
		}

		if (score > 49 && score <= 59) {
			System.out.println("Pass");
		}

		if (score > 59 && score <= 69) {
			System.out.println("Merit");
		}

		if (score > 69 && score <= 100) {
			System.out.println("Distinction");
		}

		if (score > 100 || score < 0) {
			System.out.println("Sorry, the number entered is out of range...");
		}

		// Option 3 - ELSE..IF
		if (score >= 0 && score <= 49) {
			System.out.println("Fail");
		} else if (score > 49 && score <= 59) {
			System.out.println("Pass");
		} else if (score > 59 && score <= 69) {
			System.out.println("Merit");
		} else if (score > 69 && score <= 100) {
			System.out.println("Distinction");
		} else {
			System.out.println("Sorry, the number entered is out of range...");
		}

		// Ternary
		System.out.println(score >= 0 && score <= 49 ? "Fail"
				: (score > 49 && score <= 59 ? "Pass"
						: (score > 59 && score <= 69 ? "Merit"
								: (score > 69 && score <= 100 ? "Distinction"
										: "Sorry, the number entered is out of range..."))));

		scanner.close();

		// Research Chain of Responsibility for large IF..ELSE statements
	}
}