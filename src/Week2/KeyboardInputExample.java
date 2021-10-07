/**
 * 
 */
package Week2;

import java.util.Scanner; // Importing a package member, you can use a wildcard (*) to import an entire package

/**
 * @author neilr
 *
 */
public class KeyboardInputExample {

	/**
	 * Program reads in the user's name and displays a welcome message
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String name = "";

		// Get the user's name.
		System.out.print("Hi, please enter your name ... ");
		name = scanner.next();
		System.out.println();

		System.out.println("Hello: " + name + " !");
		scanner.close();

	}

}