package Week2;

import java.util.Scanner;

/**
 * @author neilr
 *
 */

public class Practical3Part3 {

	/**
	 * Program reads in the user's name, age and voting preference and returns
	 * various pre-defined responses.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int userAge = 0;
		String name = "";
		String vote = "";

		Scanner scanner = new Scanner(System.in);

		System.out.println("What age are you?");
		userAge = scanner.nextInt();

		if (userAge >= 17) {
			System.out.println("Please enter your name:");
			name = scanner.next();

			System.out.printf("Hello, %s, you are %d years old.\n", name, userAge);
			System.out
					.println("Please enter your voting preference: Enter 'con' for Conservative and 'lab' for Labour");

			vote = scanner.next();

			if (vote.equalsIgnoreCase("con")) {
				System.out.println("Voting registered for Conservative");
			} else if (vote.equalsIgnoreCase("lab")) {
				System.out.println("Voting registered for Labour");
			} else {
				System.out.println("Sorry voting party unrecognised");
			}
		}

		if (userAge < 17) {
			System.out.println("Too young to continue.");
		}
		scanner.close();
	}

}