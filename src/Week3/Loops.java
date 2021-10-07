package Week3;

/**
 * 
 * @author neilr
 *
 */
public class Loops {

	// Declaring a constant variable
	public static final double INTEREST_RATE = 0.05;

	/**
	 * Essentials of Counter-Controlled Repetition Elements Required
	 * 
	 * 1. A control variable (or loop counter). 2. the initial value of the control
	 * variable. 3. the increment (or decrement) by which the control variable is
	 * modified each time through the loop (also known as each iteration of the
	 * loop). 4. the loop-continuation condition that determines if looping should
	 * continue.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// While Loops....
		int count;
		count = 1;
		while (count < 11) {
			System.out.println("Count is: " + count);
			count++;
		}

		// never executed
		count = 20;
		while (count < 11) {
			System.out.println("Count is: " + count);
			count++;
		}

		// count backwards
		int countDown;
		countDown = 10;
		while (countDown != 0) {
			System.out.println(countDown);
			countDown--;
		}
		System.out.println("Blast Off!");

		// even numbers between 1 to 20
		int countEven = 1;
		while ((countEven <= 20)) {
			if (countEven % 2 == 0) {
				System.out.println("CountEven is: " + countEven);
			}
			countEven++;
		}

		// Do while loops....
		// The while loop tests the loop continuation condition at the beginning of the
		// loop before execution, the the result is false the body does not execute.
		// The do-while statement tests the continuation statement after executing the
		// loops body and therefore it always executes at least once.

		count = 1;
		do {
			System.out.println("Count is " + count);
			count++;
		} while (count < 11);

		int looper = 10;
		do {
			System.out.println("Count is " + looper);
			looper--;
		} while (looper >= 1);

		// Infinite Loop
		// int loop = -2147483000;
		// do {
		// System.out.println("Count is " + loop);
		// loop --;
		// } while (loop < 11);

		// for repetition statement
		for (int counter = 1; counter < 11; counter++) {
			System.out.println("Count is: " + counter);
		}

		// General format of a for repetition statement
		// for(initialisation; termination; increment){
		// statement(s); // loop body
		// }

		for (int i = 1; i <= 100; i++) {
			System.out.println("i= " + i);
		}

		for (int i = 100; i >= 1; i--) {
			System.out.println("i= " + i);
		}

		for (int i = 7; i <= 77; i += 7) {
			System.out.println("i= " + i);
		}

		for (int i = 20; i >= 2; i -= 2) {
			System.out.println("i= " + i);
		}

		for (int i = 2; i <= 20; i += 3) {
			System.out.println("i= " + i);
		}

		for (int i = 99; i >= 0; i -= 11) {
			System.out.println("i= " + i);
		}

		/****
		 * Scope of a for Statements Control Variable If the initialisation expression
		 * in the for header declares the control variable. The control variable can be
		 * used on in that for statement. It will not exist outside it. The restricted
		 * use is known as the variables scope. The scope of a variable defines where it
		 * can be used in a program.
		 * 
		 * All three expressions in a for header are optional.
		 * 
		 * If the loop continuation condition is omitted java assumes that the loop
		 * continuation condition is always true, thus creating an infinite loop.
		 * 
		 * You may omit the initialisation expression if the program initialises the
		 * control variable before the loop.
		 * 
		 * You may omit the increment expression if the program calculates the increment
		 * with statements in the loop's body or if no increment is needed.
		 * 
		 */

		// For statement to sum the even numbers from 2 to 20
		int total = 0;

		for (int number = 2; number <= 20; number += 2) {
			total += number;
			System.out.printf("Sum is %d\n", total);
		}

		// Compound interest solution
		// Constant to store the interest rate before class above...

		// the initial balance
		double balance = 1000;

		for (int year = 1; year <= 10; year++) {
			balance = balance * (1 + INTEREST_RATE);
			System.out.printf("%4d %20.2f\n", year, balance);
		}

		/****
		 * Formatting Strings with Field Widths and Justification System.out.printf(
		 * "%5d%, 20.2f\n", year, balance ); outputs the headers for two columns of
		 * output. The first column displays the year and the second column the amount
		 * on deposit at the end of that year. We use the format specifier %20s to
		 * output the String "Amount on Deposit". The integer 20 between the % and the
		 * conversion character s indicates that the value should be displayed with a
		 * field width of 20—that is, printf displays the value with at least 20
		 * character positions. If the value to be output is less than 20 character
		 * positions wide (17 characters in this example), the value is right justified
		 * in the field by default. If the year value to be output were more than four
		 * character positions wide, the field width would be extended to the right to
		 * accommodate the entire value—this would push the amount field to the right,
		 * upsetting the neat columns of our tabular output. To output values left
		 * justified, simply precede the field width with the minus sign (–) formatting
		 * flag (e.g., %-20s).
		 */

		// Nested loops
		for (int outer = 1; outer <= 3; outer++) {
			for (int inner = 1; inner <= 5; inner++) {
				System.out.printf("outer [%d] inner [%d] \n", outer, inner);
			}
		}

		/****
		 * break and continue, in addition to selection and repetition statements, java
		 * provides statements break and continue to alter the flow of control
		 *
		 * Break - Causes the loop to terminate
		 * 
		 * Continue - Skips the remaining statements in the loop body and proceeds to
		 * the next iteration (or loop-termination test)
		 */

		// Break
		int loop = 10;
		while (loop > 0) {
			if (loop == 3) {
				System.out.println("Launch aborted");
				break;
			}
			System.out.println(loop);
			loop--;
		}

		// Continue
		int exerciseCounter = 0;
		while (exerciseCounter < 10) {
			exerciseCounter++;
			if (exerciseCounter == 3 || exerciseCounter == 4) {
				System.out.println("Miss a few...");
				continue;
			}
			// This line is skipped if the continue statement is executed
			System.out.println("Yes  ... " + exerciseCounter);
		}

		/****
		 * Some programmers feel that break and continue violate structured programming.
		 * Since the same effects are achievable with structured programming techniques,
		 * these programmers do not use break or continue.
		 */

		loop = 88;
		while (loop < 93) {
			System.out.println(loop);
			++loop;
		}

		for (int i = 1; i < 20; i++) {
			System.out.println(i % 5);
		}

		// Infinite loop
		// count = 1;
		// do {
		// System.out.println(count);
		// } while(count < 10);

		for (int i = 25; i < 5; i--) {
			System.out.print(i);
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("All done");
	}

}
