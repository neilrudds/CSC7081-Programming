/**
 * 
 */
package Week1;

/**
 * @author neilr
 */
public class DataTypes {

	/**
	 * An example of all primitive java datatypes and there assignments
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// byte (8-bit Signed -128 (-2^7), 127 (2^7-1))
		byte myByte;
		myByte = 16;
		System.out.println("My Byte is " + myByte);

		// short (16-bit Signed -32,768 (-2^15), 32,767 (2^15-1)
		short myShort;
		myShort = 128;
		System.out.println("Short value " + myShort);

		// int (32-bit Signed -2,147,483,648 (-2^31), 2,147.483,647 (2^15-1))
		int myInt;
		myInt = 345678;
		System.out.printf("MyInt value is %d\n", myInt);

		// long (64-bit Signed -9,223,372,036,854,775,808 (-2^63),
		// 9,223,372,036,854,775,807 (2^63-1)
		long myLong;
		myLong = 34567834L;
		System.out.printf("MyLong value is %d\n", myLong);

		// float (single-precision 32-bit IEEE 754 floating point)
		float myFloat;
		myFloat = 3.14728f;
		System.out.printf("My Float value : %.2f\n", myFloat);

		// double (double-precision 64-bit IEEE 754 floating point)
		double myDouble;
		myDouble = 3.12347;
		System.out.printf("My Double value : %f\n", myDouble);

		// boolean (One bit of information, true or false, on or off, 1 or 0)
		boolean myBool;
		myBool = true;
		System.out.println("My Bool is " + myBool);
		myBool = false;
		System.out.printf("My Bool is %b now\n", myBool);

		// char (Single 16-bit Unicode character '\u0000' (or 0), '\uffff' 65,535)
		char myChar;
		myChar = 'a';
		System.out.printf("My Char is : %c\n", myChar);

		// String (Not a primitive type)
		String forename = "Neil";
		String surname = "Rutherford";

		String myString;
		myString = forename + " " + surname;
		System.out.printf("My Name is: %s\n", myString);

		int myStringLength = myString.length();
		System.out.printf("My name is %d characters long\n", myStringLength);

		System.out.println("The first character in the string is: " + myString.charAt(0));
		System.out.println("The second character in the string is: " + myString.charAt(1));

		System.out.println("Changing all lowercase letters to uppercase: " + myString.toUpperCase());
		System.out.println("Replacing e with % looks like: " + myString.replace('e', '%'));
		System.out.println("The character 'u' first occurs in position : " + myString.indexOf('u'));

		// Right justifies the characters by the stated number of characters
		System.out.printf("%25s \n", "Hello World!");

		System.out.println("First Witch    \t When shall thee meet again?");
		System.out.println("\t \t In thunder, lightening, or in rain?\n");

		// Left justifies the characters
		System.out.printf("%-24s %-40s \n", "First Witch", "When shall thee meet again");
		System.out.printf("%-24s %-40s \n\n", "", "In thunder, lightening, or in rain?");

		// Math Operators
		// Add
		int result = 0;
		result = 1 + 2;
		System.out.println(result);

		// Subtract
		result = result - 1;
		System.out.println(result);

		// Multiply
		result = result * 2;
		System.out.println(result);

		// Divide
		result = result / 2;
		System.out.println(result);

		// Add
		result = result + 8;
		System.out.println(result);

		// Modulus
		result = result % 7;
		System.out.println(result);

		if (result == 3) {
			System.out.println("The result is equal to 3");
		} else {
			// Nothing will happen here...
		}

		if (result != 5) {
			System.out.println("The result is not equal to 5");
		} else {
			// Nothing will happen here...
		}

		// Declare multiple variables
		int num1, num2, num3, num4;

		// Give values
		num1 = 5;
		num2 = 10;
		num3 = 12;
		num4 = 12;

		if (num1 < num2) {
			System.out.println(num1 + " is the less than " + num2);
		}

		if (num1 > num2) {
			// not executed
			System.out.println(num1 + " is the bigger than " + num2);
		}

		if (num1 == num2) {
			// not executed
			System.out.println(num1 + " is the same size as " + num2);
		}

		if (num1 != num2) {
			System.out.println(num1 + " is not the same size as " + num2);
		}

		if (num3 == num4) {
			System.out.println(num3 + " is the same size as " + num4);
		}

		// Area Square
		int length = 6;
		System.out.printf("The area of the square is %d cm2\n", length * length);

		// Area Circle
		double radius, area;
		final double pi = 3.142;
		radius = 9.0;

		area = pi * (radius * radius);
		System.out.printf("The area of the circle is %.2f cm2\n", area);

		int number1, number2;
		number1 = 10;
		number2 = 15;

		// Ternary
		String strLargest = number1 > number2 ? "number1" : "number2";
		// Ternary in the printf
		System.out.printf("The largest value is: %s, its value is: %d\n", strLargest,
				number1 > number2 ? number1 : number2);

		/**
		 * Switch Statement Switch - fall through Each break statement terminates the
		 * enclosing switch statement, with out break statements switch blocks fall
		 * through. See output.
		 */
		int number = 2;
		switch (number) {
		case 1:
			System.out.println("Value is one");
			break;
		case 2:
			System.out.println("Value is two");
			// break;
		case 3:
		case 4:
		case 5:
			System.out.println("Value is three or four or maybe 5");
			break;
		default:
			System.out.println("Invalid number...");
		}
	}

}
