package Week3;

import java.util.Scanner;
import java.util.Random;

/***
 * 
 * @author neilr
 *
 */

public class LoopsGuessTheNumber {

	/**
	 * Guess the number game
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int randomNumber, userGuess, maxGuessAllowed, guessCount;

		// default value
		userGuess = -1;
		maxGuessAllowed = 3;
		guessCount = 0;

		// get the random number
		randomNumber = rand.nextInt(10);
		randomNumber++;

		while ((userGuess != randomNumber) && (guessCount < 3)) {
			System.out.println("Please enter your guess(1-10): ");
			userGuess = scan.nextInt();
			guessCount++;
		}

		System.out.println(guessCount != maxGuessAllowed ? "Congratulations, you guessed correctly!"
				: "Opps, you tried " + guessCount + " times!");
		scan.close();
	}

}
