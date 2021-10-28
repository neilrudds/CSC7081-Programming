/**
 * 
 */
package Week5;

import java.util.Scanner;

/**
 * @author neilr
 *
 */
public class ArraysPractical {
	
	public static final double PAY_RATE = 11.50;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Practical 1 & 4.
		// declare and print the hours and wages
		int[] hours = {8, 7, 9, 7, 4, 7};
		hoursAndWages(hours); // you could declare the array here e.g., new int[]{8, 7, 9, 7, 4}
		
		System.out.println();
		System.out.println();
		
		// Practical 2
		// declare temperatures and print the average
		temperaturesAndAverage(new double[] {3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1});
		
		System.out.println();
		System.out.println();
		
		// Practical 3
		// declare the heights and display the statistics
		studentHeightStatistics(new double[] {1.4, 1.9, 1.31, 1.2});
		
		System.out.println();
		System.out.println();
		
		// Practical 4
		// declare temperatures and print the average
		temperaturesAndAverageUpdate(new double[] {3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1});
		
		System.out.println();
		System.out.println();
		
		// Practical 5
		// Ask a user for there name and count the vowels
		vowelsInString();
		
		System.out.println();
		System.out.println();
		
		// Practical 6
		// Create and array that will be populated with all the even numbers from 1 to 100.  
		// Output the contents of the array and the total of all the even numbers.
		printEvenNumbers();
		
		System.out.println();
		System.out.println();
		
		// Practical 8
		// Create a method that will output the contents of an array of ints (of any size) to screen.  
		printArrayOfAnySize(new int[] {5, 6, 7, 9, 1});
		
		System.out.println();
		System.out.println();
		
		// Practical 8
		// Print statistics for Two assignments
		evaluateAssigmentMarks();
		
		System.out.println();
		System.out.println();
		
		// Practical 9
		// Print information regarding a quote
		printQuoteInformation();
	}

	/**
	 * calculates the salary for an employee who has worked the supplied
	 * hours in a five day week
	 * @param hours -  array of the hours worked
	 */
	public static void hoursAndWages(int[] hours) {
		
		int totalHours = 0;
		for (int day = 0; day < hours.length; day++) {
			System.out.printf("Day %d, hours %d\n", day+1, hours[day]);
			totalHours += hours[day];
		}
		System.out.printf("Total hours %d, Weekly salary £%.2f\n", totalHours, (double)totalHours * PAY_RATE);
	}
	
	/**
	 * Method that given an array of temperatures  then outputs the average temperature
	 * @param temps
	 */
	public static void temperaturesAndAverage(double[] temps) {
		
		double totalTemps = 0.0;
		for (int temp = 0; temp < temps.length; temp++) {
			totalTemps += temps[temp];
		}
		System.out.printf("The average temperature is: %.2f\n", totalTemps / temps.length);
	}
	
	/**
	 * Method given above 4 students heights will then calculate 
	 * the average height and the tallest and smallest height
	 * @param heights
	 */
	public static void studentHeightStatistics(double[] heights) {
		
		double totalHeights = 0.0;
		double tallest, smallest;
		tallest = heights[0];
		smallest = heights[0];
		for (int height = 0; height < heights.length; height++) {
			totalHeights += heights[height];
			if (heights[height] > tallest) {tallest = heights[height];};
			if (heights[height] < smallest) {smallest = heights[height];};
		}
		System.out.printf("Smallest : %.2f \n",smallest);
		System.out.printf("Tallest : %.2f \n",tallest);
		System.out.printf("The average height is: %.2f\n", totalHeights / heights.length);
	}
	
	/**
	 * Update to Method that given an array of temperatures  then outputs the average temperature
	 * and the highest and lowest
	 * @param temps
	 */
	public static void temperaturesAndAverageUpdate(double[] temps) {
		
		double min, max;
		min = temps[0];
		max = temps[0];
		double totalTemps = 0.0;
		for (int temp = 0; temp < temps.length; temp++) {
			totalTemps += temps[temp];
			if (temps[temp] < min) {min = temps[temp];};
			if (temps[temp] > max) {max = temps[temp];};
		}
		System.out.printf("Min : %.2f \n", min);
		System.out.printf("Max : %.2f \n", max);
		System.out.printf("The average temperature is: %.2f\n", totalTemps / temps.length);
	}
	
	/**
	 * Prompts the user to enter first name, then the total 
	 * number of occurrences for each vowel is calculated and displayed.
	 */
	public static void vowelsInString() {
		
		// Vars
		String usersName = "";
		int totalA, totalE, totalI, totalO, totalU;
		totalA = 0;
		totalE = 0;
		totalI = 0;
		totalO = 0;
		totalU = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your name and then return");
		usersName = scan.nextLine();
		
		for (int ch = 0; ch < usersName.length(); ch++) {
			switch(usersName.charAt(ch)) {
			
				case 'a':
	            case 'A':
	            	totalA++;
	            	break;
	            case 'e':
	            case 'E':
	            	totalE++;
	            	break;
	            case 'i':
	            case 'I':
	            	totalI++;
	            	break;
	            case 'o':
	            case 'O':
	            	totalO++;
	            	break;
	            case 'u':
	            case 'U':
	                totalU++;
	                break;
	            default:
	                // not a vowel;
			}
		}
		System.out.printf("Total A : %d\n", totalA);
		System.out.printf("Total E : %d\n", totalE);
		System.out.printf("Total I : %d\n", totalI);
		System.out.printf("Total O : %d\n", totalO);
		System.out.printf("Total U : %d\n", totalU);
		scan.close();
	}
	
	/**
	 * Method populates an array with all the even numbers from 1 to 100.  
	 * Outputs the contents of the array and the total of all the even numbers
	 */
	public static void printEvenNumbers() {
		
		int[] even = new int[50];
		int nextLocation = 0;
		int total = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i%2 == 0) {
				even[nextLocation] = i;
				nextLocation++;
			}
		}
		
		// this is an enhanced for loop or FOR EACH loop
	    for (int i : even){
	        total+=i;
	    }
	    System.out.println("total is : "+total);
	}
	
	/**
     * Outputs int array contents to screen
     * @param myArray
     */
	public static void printArrayOfAnySize(int[] inputArray) {
		for(int i=0; i<inputArray.length; i++) {
			System.out.printf("Value at index[%d]: %d\n", i, inputArray[i]);
		}
	}
	
	/**
     * Method takes as a parameter two assignments marks.
     * Outputs the average mark of each Assignment (to one decimal place)
     * The overall average mark in both assignments ie Average A1 + average A2
     * The assignment with the best average.
     */
	public static void evaluateAssigmentMarks() {
		
		int[] assignmentOne = {24, 42, 29, 66, 77};
		int[] assignmentTwo = {79, 68, 31, 22, 42};
		
		double averageOne = totalMarks(assignmentOne)/assignmentOne.length;
		double averageTwo = totalMarks(assignmentTwo)/assignmentTwo.length;
		
		System.out.printf("The average mark for Assignment One is: %.1f\n", averageOne);
		System.out.printf("The average mark for Assignment Two is: %.1f\n", averageTwo);
		
		System.out.printf("The overall average is: %.1f\n", (averageOne+averageTwo)/2);
		
		if (averageOne > averageTwo) {
			System.out.println("Assignment One has the best average.");
		} else if (averageOne < averageTwo) {
			System.out.println("Assignment Two has the best average.");
		} else {
			System.out.println("Both assignments have the same average mark.");

		}
	}
	
    /**
     * Outputs the total in any given int array
     * @param inputArray
     * @return
     */
	public static int totalMarks(int[] inputArray) {
		
		int totalMarks = 0;
		
		for (int i = 0; i<inputArray.length; i++) {
			totalMarks += inputArray[i];
		}
		return totalMarks;
	}
	
	/**
    * Outputs the following for the famous quote
    *  The full quote, The number of words, The number of letters
    *  The smallest word(s), The largest word(s)
    */
	public static void printQuoteInformation() {

		int noWords = 0;
		int noLetters = 0;
		String smallestWord;
		String largestWord;
		
		String[] myQuote = {"Continuous", "effort", "not", "strength", "nor",
				"intelligence", "is", "the", "key", "for", "unlocking", "our", "potential"};
		
		smallestWord = myQuote[0];
		largestWord = myQuote[0];
		
		for (int i=0; i<myQuote.length; i++) {
			System.out.print(myQuote[i] + " ");
			noWords++;
			noLetters+=myQuote[i].length();
			
			if (smallestWord.length() > myQuote[i].length()) {
				smallestWord = myQuote[i];
			}
			
			if (largestWord.length() < myQuote[i].length()) {
				largestWord = myQuote[i];
			}
		}
		
		System.out.println("");
    	System.out.println("Stats ___________________________");
    	System.out.println("Number of words   : "+ noWords);
    	System.out.println("Number of letters : "+ noLetters);
    	System.out.println("Largest word : "+ largestWord);
    	System.out.println("Smallest word : "+ smallestWord);
	}
}