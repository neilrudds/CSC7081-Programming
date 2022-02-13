/**
 * 
 */
package Challenges;

import java.util.Random;
import java.util.Scanner;

/**
 * @author neilr
 *
 */
public class PenaltyShootOut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Initialise classes and vars
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		int shotCount = 1;
		int maxShots = 5;
		int usersShot = 0;
		int goals = 0;
		int goalKeeperPosition = 0;
				
		System.out.println("Welcome to the penalty shoot out game!");
				
		while (shotCount <= maxShots) {
			
			System.out.printf("Penalty number: %d out of %d\n", shotCount, maxShots);

			printTheGoalMap();
			
			// Randomly select the keepers position
			goalKeeperPosition = r.nextInt(9) + 1;

			// keep checking for a valid user input
			do {
				System.out.println("Select your shot...");
				usersShot = s.nextInt();
			} while (usersShot < 1 || usersShot > 9);

			System.out.print("Placing the ball ... ");
			delay(1000);
			System.out.print("Walking back ... ");
			delay(1000);
			System.out.print("Run up... ");
			delay(1000);
			System.out.println("SHOOT !");
			delay(1000);

			// did the keeper save the shot
			if (usersShot == goalKeeperPosition) {
				System.out.println("SAVE!\n\n");
			} else {
				System.out.printf("GOAL! Keeper when to %d\n\n", goalKeeperPosition);
				goals++;
			}
			shotCount++;
		}
		System.out.printf("Goals scored: %d/%d\n", goals, maxShots);
		printThePerformanceMsg(goals);
		System.out.println("Thanks for playing...");
		s.close();
	}
	
	public static void printTheGoalMap() {
		System.out.println();
		System.out.println("\t   _______________________");
		System.out.println("\t   |  1       2        3  |");
		System.out.println("\t   |  4       5        6  |");
		System.out.println("\t   |  7       8        9  |");
		System.out.println("______________________________________________");
		System.out.println("");
		System.out.println("\t\t      X");
		System.out.println();
	}
	
	public static void printThePerformanceMsg(int goals) {
		String performanceMessage;
		switch (goals) {
		case 0:
			performanceMessage = "You have disgraced your country and family!";
			break;
		case 1:
			performanceMessage = "You have disgraced your country and family!";
			break;
		case 2:
			performanceMessage = "Back to training for you!";
			break;
		case 3:
			performanceMessage = "Try using your good foot!";
			break;
		case 4:
			performanceMessage = "Not bad - but not perfect!";
			break;
		case 5:
			performanceMessage = "Fluke and the keeper is not very good anyway!";
			break;
		default:
			performanceMessage = "I don't know what to say about that one";
		}
		System.out.printf(performanceMessage + "\n");
	}
	
	/**
	 * Uses Thread sleep to add a configurable delay
	 * 
	 * @param millisecs
	 */
	private static void delay(int millisecs) {
		try {
			Thread.sleep(millisecs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
