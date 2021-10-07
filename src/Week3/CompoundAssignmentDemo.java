package Week3;

/**
 * @author neilr
 *
 */
public class CompoundAssignmentDemo {

	/**
	 * Program demonstrates the use of compound assignment operators
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int number = 10;

		System.out.println("Number is " + number);

		// number = number + 3;
		number += 3; // Adding 3
		number = +3; // Assigning a positive 3

		// System.out.println("Number is now " + (number+=3));
		System.out.println("Number is now " + number);

		// Arithmetic Compound Operators
		number = 10;
		System.out.println(number + "+=4: " + (number += 4));
		number = 10;
		System.out.println(number + "-=4: " + (number -= 4));
		number = 10;
		System.out.println(number + "*=4: " + (number *= 4));
		number = 10;
		System.out.println(number + "/=4: " + (number /= 4));
		number = 10;
		System.out.println(number + "%=3: " + (number %= 3));

		// Increment
		number = 10;
		number++;
		System.out.println("10++: " + (number));

		// Decrement
		number = 10;
		number--;
		System.out.println("10--: " + (number));

		// postfix
		number = 10;
		System.out.println(number); // prints 10
		System.out.println(number++); // prints 10 then increments
		System.out.println(number); // prints 11

		// prefix
		number = 10;
		System.out.println(number); // prints 10
		System.out.println(++number); // increments then prints 11
		System.out.println(number); // prints 11

	}

}
