/**
 * 
 */
package Challenges;

import java.util.Scanner;

/**
 * 
 * Provide an ASCII display / converter program
 * @author neilrutherford
 *
 */
public class AsciiConverter {

	// using a constant here!
	public static final int SPACE_CHAR = 32;
	
	/**
	 * Start point for app... ASCII to text converter. 
	 * Takes user input to translate 
	 * text to ASCII and other display conversions
	 *
	 * @param args 
	 */
	public static void main(String[] args) {

		// vars
		int userOption = 0;
		String usersName, charToASCIIInput;
		
		// initialise scanner
		Scanner scanner = new Scanner(System.in);
		
		do {

			// present options to the user
			System.out.println("\nASCII Convertor Menu................");
			System.out.println("1. Show ASCII Table");
			System.out.println("2. Convert a Character to ASCII");
			System.out.println("3. Convert your name to ASCII");
			System.out.println("4. Quit");

			System.out.println("Enter a number and return");

			// get a user's option
			userOption = scanner.nextInt();
			scanner.nextLine(); // this clears out the return character (nextInt takes just the int entered)
			
			// process the selected option
			switch (userOption) {
            case 1:  printAsciiTable();
                     break;
            case 2:  System.out.println("Please enter a character to be converted to ASCII and return"); 
            		 charToASCIIInput = scanner.next();
            		 // now get the first char
            		 char character = charToASCIIInput.charAt(0);
            		 System.out.println((int)character);
            		 break;
            case  3: System.out.println("Please enter your name to be converted to ASCII and return");
            		 usersName = scanner.nextLine();
            		 printStringToASCII(usersName);
            		 break;
            default: System.out.println("Goodbye...");
                     break;
			}

		} while (userOption != 4);

		scanner.close();
	}
	
	public static void printAsciiTable() {
		System.out.println("-------------------------------------");
        System.out.printf("%10s %20s%n", "ASCII", "CHARACTER");
        System.out.println();
        System.out.println("-------------------------------------");
		for(int i = SPACE_CHAR; i < 127; i++) {
			System.out.printf("%10s %20s%n", i, (char)i);
		}
		System.out.println("-------------------------------------");
	}
	
	public static void printStringToASCII(String str) {
		System.out.println("-------------------------------------");
        System.out.printf("%10s %20s%n", "ASCII", "CHARACTER");
        System.out.println();
        System.out.println("-------------------------------------");
		for(int i = 0; i < str.length(); i++) {
			System.out.printf("%10s %20s%n", (int)str.charAt(i), str.charAt(i));
		}
		System.out.println("-------------------------------------");
	}

}