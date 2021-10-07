package Week2;

import java.util.Random; // Import of a Class

/**
 * @author neilr Class used to demo import statements using a random number
 *         generator
 */
public class RandomNumberGenerator {

	/**
	 * Main method ... generates a range of random numbers using the Java API Random
	 * class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int randomInt;

		System.out.println("Generating 5 random integers in range 0..99.");

		// note a single random object is reused here
		Random randomGenerator = new Random(); // Instantiation of the imported class
		for (int loop = 1; loop <= 5; loop++) {
			randomInt = randomGenerator.nextInt(100);
			System.out.println("Generated : " + randomInt);
		}
		System.out.println("Done");

	}

}