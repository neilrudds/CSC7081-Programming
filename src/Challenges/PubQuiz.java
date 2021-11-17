/**
 * 
 */
package Challenges;
import java.util.Random;
import java.util.Scanner;

/**
 * @author neilrutherford
 *
 */
public class PubQuiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		String userInput = "";
		int usersScore, questionsAsked;
		usersScore = 0;
		questionsAsked = 0;
		
		// declaring the questions and answers
		String[] jokeQuestions = { "Largest planet ? ", "Worse song ever ? ", "Capital of Peru?",
		"Roman god of War ?" };
		String[] jokeAnswers = { "Jupiter", "Castles in the Sky", "Lima", "Mars" };
		
		// Keep a record of asked questions
		boolean[] questionAsked = new boolean[4];
		
		System.out.println("General knowledge quiz...");
		
		do {
			
			int question;
			do {
				// Pick a random question and print to the user and check if already asked
				question = r.nextInt(4);
			} while(questionAsked[question]);
			questionAsked[question] = true;
			
			System.out.println(jokeQuestions[question]);
			System.out.println("Your answer...");
			questionsAsked++;
			
			// Read the users response
			userInput = s.nextLine();
			
			// Check it
			if (userInput.equalsIgnoreCase(jokeAnswers[question])) {
				// Correct
				System.out.println("Well done!");
				usersScore++;
			} else {
				// Incorrect
				System.out.println("Not a bad guess, but it was " + jokeAnswers[question]);
			}
			System.out.printf("You scored %d out of %d%n", usersScore, questionsAsked);
			
			System.out.println("Another question? (Y or N)");
			// Read the users response
			userInput = s.nextLine();
			
		}
		while(userInput.equalsIgnoreCase("Y") && !allQuestionsAsked(questionAsked));
		System.out.println("You have exited the game or you have answered all questions...");
		System.out.println("Goodbye...");
		s.close();
	}

	public static boolean allQuestionsAsked(boolean[] flags) {
		boolean result = true;
		for(int i = 0; i < flags.length; i++) {
			if (flags[i] == false) {
				result = false;
			}
		}
		return result;
	}
	
}
