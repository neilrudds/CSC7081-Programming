package Week2;

import java.util.Scanner;

/**
 * @author neilr
 *
 */
public class ScannerAgeExercise {

	/**
	 * Program reads in the user's age and advises if they are eligible to vote
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int userAge;
		userAge = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("What age are you?");
		userAge = scanner.nextInt();

		if (userAge >= 18) {
			System.out.println("You are able to vote");
		}

		if (userAge < 18) {
			System.out.println("Sorry you cannot vote");
		}
		scanner.close();

	}

}