/**
 * 
 */
package Week4;
import java.util.Calendar;
import java.util.Scanner;
/**
 * @author neilr
 * Practical 5 - Methods
 */
public class MethodsPractical {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Part 1.
		isOddOrEven(10);
		isOddOrEven(1);
		isOddOrEven(2);
		isOddOrEven(3);
		convertToLower('A');
		convertToLower('a');
		isMultiple(8, 4);
		isMultiple(11, 2);
		createTenRandomNumbers();
		countDownFromNumber();
		printNumberInWordNestedIfElse(7);
		printNumberInWordNestedIfElse(40);
		printNumberInWordSwitch(4);
		printNumberInWordSwitch(11);
		counter(100);
		timeOfDay();
		
		// Part 2.
		System.out.printf("The area of the rectangle is: %d\n", areaOfRectangle(10, 3));
		System.out.println(nameOfMonth(5));
		System.out.printf("The average of the numbers is: %.2f\n", averageOfNumbers(50, 100, 200));
		System.out.printf("%s has a capital city %s \n", "Germany",	countryCapital("Germany"));
		System.out.printf("%s has a capital city %s \n", "Germany",	countryCapitalUsingASwitch("Germany"));
		coinToss("Heads");
	}
	
	/**
	 * Part.1 Check if an integer is odd or even
	 * @param num
	 */
	public static void isOddOrEven(int num) {
		System.out.println((num % 2) == 0 ? "Even" : "Odd"); // All evens will divide by 2 without a remainder
		System.out.println((num & 1) == 0 ? "Even" : "Odd"); // Zero all the bits but leave the least significant bit unchanged and check if the result is 0
	}
	
	/**
	 * Part.1 Convert an upper case letter to lower case, checking if it is already lower case.
	 * @param ch
	 * @return
	 */
	public static void convertToLower(char ch) {
		if (Character.isUpperCase(ch)) {
			System.out.println("The character was converted to lower case: " + Character.toLowerCase(ch)) ;
		} else {
			System.out.println("The character is already lower case: " + Character.toLowerCase(ch));
		}	
	}
	
	/**
	 * Part.1 When passed a pair of integers, will determine if the second is a
	 * multiple of the first.
	 * 
	 * @param num1
	 * 			base number
	 * @param num2
	 * 			number to check id is multiple of base number
	 */
	public static void isMultiple(int num1, int num2) {
		if (num2 % num1 == 0) {
			System.out.printf("%d is a multiple of %d\n", num1, num2);
		} else {
			System.out.printf("%d is not a multiple of %d\n", num1, num2);
		}
	}
	
	/***
	 * Part.1 Generate a set of 10 random numbers between 1 and 100 (inclusive)
	 */
	public static void createTenRandomNumbers() {
		java.util.Random rand = new java.util.Random();
		
		System.out.println("Generating 10 random integers in range 1..100");
		for(int i=0; i <= 10; i++) {
			System.out.printf("Generated: %d\n", rand.nextInt(100) + 1);
		}
	}
	
	/**
	 * Part.1 Prompt the user for a number (between 5 and 50 (inclusive)). Then output
	 * to screen a count down of the numbers starting with the given number and
	 * include on the same line the same number of asterisks.
	 */
	public static void countDownFromNumber() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number between 5 - 50 (inclusive)");
		int num = scan.nextInt();
				
		if (num >= 5 && num <= 50) {
			for (int i = num; i >= 0; i--) {
				System.out.printf("%d", i);
				for (int j = i; j >= 1; j--) {
					System.out.print(j > 1 ? "*" : "*\n");
				}
			}
			System.out.println();
		} else {
			System.out.println("Sorry, the number input number is out of bounds.");
		}
		scan.close();
	}
	
	/**
	 * Part.1 prints "ONE", "TWO",... , "NINE", or "OTHER" if an int variable (passed
	 * as a parameter) is 1, 2,... , 9, or other, respectively. Coded here using
	 * an if else ...
	 * 
	 *  @param num
	 */
	public static void printNumberInWordNestedIfElse(int num) {
		if (num == 1) {
			System.out.println("ONE");
		} else {
			if (num == 2) {
				System.out.println("TWO");
			} else {
				if (num == 3) {
					System.out.println("THREE");
				} else {
					if (num == 4) {
						System.out.println("FOUR");
					} else {
						if (num == 5) {
							System.out.println("FIVE");
						} else {
							if (num == 6) {
								System.out.println("SIX");
							} else {
								if (num == 7) {
									System.out.println("SEVEN");
								} else {
									if (num == 8) {
										System.out.println("EIGHT");
									} else {
										if (num == 9) {
											System.out.println("NINE");
										} else {
											System.out.println("OTHER");
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	/**
	 * Part.1 prints "ONE", "TWO",... , "NINE", or "OTHER" if an int variable (passed
	 * as a parameter) is 1, 2,... , 9, or other, respectively. Coded here using
	 * a switch case ...
	 * 
	 * @param num
	 */
	public static void printNumberInWordSwitch(int num) {

		switch (num) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");
		}
	}
	
	/**
	 * Part.1 Prints the sum of 1+2+3, ..., to an upper bound determined by user input
	 * (e.g. 100). The method should computes and displays the average of these
	 * numbers.
	 * 
	 * @param num
	 */
	public static void counter(int num) {
		
		int total = 0;
		for(int i = 1; i <= num; i++) {
			total+=i;
		}
		System.out.printf("The total up to %d is %d and the average is: %.2f\n", num, total, (double)total / (double)num);		
	}
	
	/**
	 * Part.1 Determines if it is currently AM or PM. If AM then it output is “Good
	 * morning” and if PM then “I hope the morning went well for you. Enjoy the
	 * rest of your day.”
	 */
	public static void timeOfDay() {
		java.util.Calendar cal = java.util.Calendar.getInstance();
		
		if (cal.get(Calendar.AM_PM) > 0) {
			System.out.println("I hope the morning went well for you. Enjoy the rest of your day");
		} else {
			System.out.println("Good morning");
		}
	}
	
	/**
	 * Part.2 Calculates and returns the area of a rectangle, given the height and
	 * base.
	 * 
	 * @param height
	 * @param base
	 * @return the area of the rectangle
	 */
	public static int areaOfRectangle(int height, int base) {
		return height*base;
	}
	
	/**
	 * Part.2 Given a number from 1-12, returns the name of the appropriate month.
	 * 
	 * @param numericalMonth
	 * @return the name of the Month
	 */
	public static String nameOfMonth(int numericalMonth) {
		switch (numericalMonth) {
		case 1:
			return "Jan";
		case 2:
			return "Feb";
		case 3:
			return "Mar";
		case 4:
			return "Apr";
		case 5:
			return "May";
		case 6:
			return "Jun";
		case 7:
			return "Jul";
		case 8:
			return "Aug";
		case 9:
			return "Sep";
		case 10:
			return "Oct";
		case 11:
			return "Nov";
		case 12:
			return  "Dec";
		default:
			return "Invalid";
		}
	}
	
	/**
	 * Part.2 Method that takes three int arguments and returns the average of the
	 * numbers as a double.
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public static double averageOfNumbers(int num1, int num2, int num3) {
		return (double)(num1 + num2 + num3) / 3;
	}
	
	/**
	 * Part.2 Takes as an argument the name of a G8 country. Then returns the capital
	 * city of the country as a string
	 * 
	 * @param country
	 * @return the capital city
	 */
	public static String countryCapital(String country) {

		String capital = null;

		if (country.equalsIgnoreCase("France")) {
			capital = "Paris";
		} else if (country.equalsIgnoreCase("Germany")) {
			capital = "Berlin";
			// etc etc
		} else {
			System.out.println("Unknown");
		}
		return capital;
	}
	
	/**
	 * Part.2 Takes as an argument the name of a G8 country. Then returns the capital
	 * city of the country as a string
	 * 
	 * @param country
	 * @return the capital city
	 */
	public static String countryCapitalUsingASwitch(String country) {

		String capital = null;

		switch (country) {
		case "France":
			capital = "Paris";
			break;
		case "Germany":
			capital = "Berlin";
			break;
		// etc .. etc
		default:
			System.out.println("Unknown country");

		}
		return capital;
	}
	
	public static void coinToss(String call) {

		int callConvert = 0;
		if (call.equalsIgnoreCase("Heads")) {
			callConvert = 1;
		} else if (call.equalsIgnoreCase("Tails")) {
			callConvert = 2;
		} else {
			System.out.println("Oops, " + call + " is not a valid input.");
		}

		java.util.Random rand = new java.util.Random();
		int toss = rand.nextInt(2) + 1;

		// show the result of the coin toss
		if (toss == 1) {
			System.out.print("Heads..");
		} else {
			System.out.print("Tails..");
		}

		// check if user called it correctly
		if (callConvert == toss) {
			System.out.println(" you win");
		} else {
			System.out.println(" you lose");
		}
	}
}
