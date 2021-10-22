/**
 * 
 */
package Week5;

/**
 * @author neilr
 *
 * Data Structures - collections of related data items. Arrays
 * are data structures consisting of related data items of the
 * same type.
 * 
 * Arrays make it convenient to process related groups of values.
 * 
 * Arrays remain the same length once they're created, although
 * an array variable may be reassigned such that it refers to a
 * new array of a different length.
 */
public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("Average is %.2f\n", getAverageShoeSize(2, 4, 6, 3, 12, 8));		
		
		int[] shoes = new int[6];
		
		shoes[0] = 2;
		shoes[3] = 5;
		//shoes[6] = 8; // Deliberate attempt to reference an out of range index
		shoes[5] = 8;
		
		System.out.println(shoes[2]);
		System.out.println(shoes[3+2]);
		System.out.println(shoes[3]+2);
		
		// Creating on one line - not pretty!
		//String[] anArray = new String[100], anotherArray = new String[27];
		
		// But difficult to read, so avoid the above
		//String[] anArray = new String[100]
		//String[] anotherArray = new String[27];
		
		iterateAnArray();
		arrayInitialiser();
		dynamicallyPopulatingArrayI();
		dynamicallyPopulatingArrayII();
		sumArrayElements();
		arraysExerciseI();
		
		// Passing the reference of an array into a method
		int[] hourlyTemperatures = { 3, 6, 1, 7, 2, 9 };
		modifyArray(hourlyTemperatures);
		showArray(hourlyTemperatures);
		
		int[] heights = { 123, 145, 120 };
		showArray(heights);
	}

/**
 * Recap..Methods
 *  Create a method that will return the average of shoe size of all
 *   these students... the shoe sizes should be passed as parameters
 *   to the methods
 * @param a
 * @param b
 * @param c
 * @param d
 * @param e
 * @param f
 * @return
 */
 public static double getAverageShoeSize(int a, int b, int c, int d, int e, int f)
 {
	 return (double)(a+b+c+d+e+f)/6;
 }

 /*
  * Arrays Introduction.
  * 
  * An array is a group of variables (called elements or components)
  * containing values that all have the same type.
  * 
  * Arrays are objects, so they're considered reference types.
  * 
  * The elements of an array can be either primitive types or reference
  * types (including other arrays)
  * 
  * To refer to a particular element in an array, we specify the name of
  * the reference to the array and the position number of the element in
  * the array.
  * 
  * The position number of the element is called the element's index or
  * subscript.
  * 
  */

 /*
  * Arrays Introduction - accessing
  * 
  * The logical representation of an integer array called c.
  * 
  * This array contains 12 elements
  * 
  * A program refers to any one of these elements with an array-access
  * expression that includes the name of the array followed by the index
  * of the particular element in square brackets ([])
  * 
  *   Name of array (c)    c[ 0  ]  -45
  *   					   c[ 1  ]    6
  *   					   c[ 2  ]    0
  *   					   c[ 3  ]   72
  *   					   c[ 4  ] 1543
  *   					   c[ 5  ]  -89
  *   					   c[ 6  ]    0
  *   					   c[ 7  ]   62
  *   					   c[ 8  ]   -3
  *  Index (or subscript)  c[ 9  ]    1
  *   of the element in    c[ 10 ] 6453
  *   array c    		   c[ 11 ]   78
  * 
  */
 
 /*
  * Arrays Introduction - index
  * 
  * An index must be a nonnegative integer.
  * 
  * A program can use an expression as an index.
  * 
  * For example, if we assume that variable a is 3 then the statement;
  * 
  * c[a] = 72;
  * 
  * assigns 72 to array element c[3].
  * 
  * An index array name is an array-access expression, which can be used
  *  on the left side of an assignment to place a new value into an array
  *  element.
  * 
  *   Name of array (c)    c[ 0  ]  -45
  *   					   c[ 1  ]    6
  *   					   c[ 2  ]    0
  *   					   c[ 3  ]   72
  *   					   c[ 4  ] 1543
  *   					   c[ 5  ]  -89
  *   					   c[ 6  ]    0
  *   					   c[ 7  ]   62
  *   					   c[ 8  ]   -3
  *  Index (or subscript)  c[ 9  ]    1
  *   of the element in    c[ 10 ] 6453
  *   array c    		   c[ 11 ]   78
  * 
  */
 
 /*
  * Arrays Introduction - length
  * 
  * The name of the array is c.
  * 
  * Event array object knows its own length and stores it in
  *  a length instance variable. The expression c.length accesses
  *  array c's length field to determine the length of the array.
  * 
  * This array's 12 elements are referred to as c[0], c[1], c[2], c[3],
  *  .... c[11]
  *  
  *  The value of c[0] is -45, the value of c[1] is 6, the value of
  *   c[2] is 0, the value of c[7] is 62, and the value of c[11] is 78.
  * 
  *   Name of array (c)    c[ 0  ]  -45
  *   					   c[ 1  ]    6
  *   					   c[ 2  ]    0
  *   					   c[ 3  ]   72
  *   					   c[ 4  ] 1543
  *   					   c[ 5  ]  -89
  *   					   c[ 6  ]    0
  *   					   c[ 7  ]   62
  *   					   c[ 8  ]   -3
  *  Index (or subscript)  c[ 9  ]    1
  *   of the element in    c[ 10 ] 6453
  *   array c    		   c[ 11 ]   78
  * 
  */
 
 /*
  * Arrays Introduction - first and last
  * 
  * The first element in every array has index zero and is sometimes
  *  called the zeroth element.
  * 
  * This, the elements of array c are c[0], c[1], c[2] and so on...
  * 
  * The highest index in array c is 11, which is 1 less than 12 - the
  *  number of elements in the array.
  * 
  * Array names follow the same conventions as other variable names.
  *  
  */
 
 /*
  * Arrays Introduction - expressions
  * 
  * To calculate the sum of the values contained in the first three
  *  elements of array c and store the result in variable sum:
  * 
  * sum = c[0] + c[1] + c[2];
  * 
  * To divide the value of c[6] by 2 and assign the result to the
  *  variable x:
  *  
  *  x = c[6]/2;
  *  
  */
 
 /*
  * Creating and Declaring an array
  * 
  * - Array objects occupy space in memory. Like other objects, arrays
  *   created with keyword new. To create an array object, you specify
  *   the type of the array elements and the number of elements as part
  *   of an array-creation expression that uses keyword new.
  *   
  * - Such an expression returns a reference that can be stored in an
  *   array variable.
  *   
  *   Declares an int array with 11 elements
  *   int[] myArray = new int[11];
  *   
  * - Creating an array cab also be performed in two steps
  * 
  *   int[] myArray; // Declare the array variable
  *   myArray = new int[11]; //create the array; assign to array variable
  *   
  * - In the declaration, the square brackets following the type indicate
  *   that myArray is a variable that will refer to an array (i.e. the variable
  *   will store an array reference). In the assignment statement, the array
  *   variable myArray recieves the reference to a new array of 11 int elements
  *  
  */
 
 /*
  * Creating and Declaring an array - default values
  * 
  * When an array is created, each element of the array receives a default
  * value - zero for the numeric primitive-type elements, false for boolean
  * elements and null for references.
  * 
  */
 
 /*
  * Array types
  * 
  * - A program can declare arrays of any type, Every element
  *   of a primitive-type array contains a value of the array's
  *   declared element type. Similarly, in an array of a reference
  *   type, every element is a reference to an object of the array's
  *   declared element type.
  *   
  * - For example, every element of an int array is an int value, and
  *   every element of a String array is a reference to a String object.
  */
 
 	/**
 	 * Iterating through an array
 	 * 
 	 *  - The for statement outputs the index number (represented by counter) and
 	 *    the value of each array element (represented by array[counter]).
 	 *    
 	 *  - The loop-control variable counter is initially 0-index values start at 0,
 	 *    so using zero-based counting allows the loop to access every element of
 	 *    the array.
 	 *    
 	 *  - The for's loop continuation condition uses the expression array.length
 	 *    to determine the length of the array.
 	 *    
 	 *  - The loop-control variable counter is initially 0 - index values start
 	 *    at 0, so using zero-based counting allows the loop to access every
 	 *    element of the array.
 	 *    
 	 *  - The length of the array is 11, so the loop continues executing as long
 	 *    as the value of control variable counter is less than 11.
 	 *    
 	 *  - But the highest index value of a 11-element array is 10, so using the
 	 *    less-than operator in the loop-continuation condition guarantees that
 	 *    the loop does not attempt to access an element beyond the end of the
 	 *    array (i.e., during the final iteration of the loop, counter is 10).
 	 *    
 	 */
	public static void iterateAnArray() {
		int[] myArray; // declare the array variable
		myArray = new int[11]; // create the array; assign to array variable

		System.out.printf("%s%8s\n", "Index", "Value"); // column headings

		for (int counter = 0; counter < myArray.length; counter++) {
			System.out.printf("%5d%8d\n", counter, myArray[counter]);
		}
	}
	
	/**
	 * Using an Array Initialiser
	 * 
	 * It is possible to create an array and initialise its elements with an
	 * array initialiser - a comma-separated list of expressions (called an
	 * initialiser list) enclosed in braces.
	 * 
	 * The array length is determined by the number of elements in the
	 * initialiser list.
	 */
	public static void arrayInitialiser() {
		int[] myArray = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
		
		// int[] myArray = new int[] { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 }; // Old redundant method in Java

		System.out.printf("%s%8s\n", "Index", "Value"); // column headings

		for (int counter = 0; counter < myArray.length; counter++) {
			System.out.printf("%5d%8d\n", counter, myArray[counter]);
		}
	}
	
	/**
	 * Dynamically populating an array
	 * 
	 * The modifier final is used to declare the constant variable ARRAY_LENGTH
	 * with the value 10. Constant variables must be initialised before they're
	 * used and cannot be modified thereafter.
	 */
	public static void dynamicallyPopulatingArrayI() {
		final int ARRAY_LENGTH = 10; // declare constant
		int[] myArray = new int[ARRAY_LENGTH]; // create array
		
		// calculate value for each array element
		for (int counter = 0; counter < myArray.length; counter++) {
			myArray[counter] = 2 + 2 * counter;
		}
		
		System.out.printf("%s%8s\n", "Index", "Value"); // column headings

		// output each array element's value
		for (int counter = 0; counter < myArray.length; counter++) {
			System.out.printf("%5d%8d\n", counter, myArray[counter]);
		}
	}
	
	public static void dynamicallyPopulatingArrayII() {
		int[] myArray = new int[10]; // create array of length 10
		
		// populate the array
		for (int loop = 0; loop < 10; loop++) {
			myArray[loop] = 2 + 2 * loop;
		}
		
		// output each array element's value
		for (int loop = 0; loop < 10; loop++) {
			System.out.print(myArray[loop] + " ");
		}
		System.out.println();
	}
	
	/*
	 * Java has well-defined rules for specifying the order in which the operators
	 * in an expression are evaluated when the expression has several operators. For
	 * example, multiplication and division have a higher precedence than addition
	 * and subtraction. Precedence rules can be overridden by explicit parentheses.
	 * 
	 * Precedence Order. When two operators share an operand the operator with the
	 * higher precedence goes first. For example, 1 + 2 * 3 is treated as 1 + (2 *
	 * 3), whereas 1 * 2 + 3 is treated as (1 2) + 3 since multiplication has a
	 * higher precedence than addition.
	 */
	
	public static void sumArrayElements() {
		
		// create the array with values
		int[] myArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int total = 0; // used to keep the total

		// loop through each element
		for (int counter = 0; counter < myArray.length; counter++) {
			// keep adding to the total
			total += myArray[counter];
		}
		
		// output total
		System.out.printf("Total of array elements: %d\n", total);
	}
	
	/**
	 * Create an array to hold the following shoe sizes: 6, 7, 5, 4
	 * Output each individual size and then the average size
	 */
	public static void arraysExerciseI() {
		int[] shoeSizes = { 6, 7, 5, 4 };
		int total = 0;
		
		System.out.println("Shoe sizes:");
		for (int i = 0; i < shoeSizes.length; i++) {
			System.out.printf("%5d%8d\n", i, shoeSizes[i]);
			total += shoeSizes[i];
		}
		
		System.out.printf("Average size: %.2f\n", (double)total / shoeSizes.length);
	}
	
	/*
	 * Passing an array to a method
	 * 
	 * - To pass an array argument to a method, specify the name
	 *   of the array without any brackets. For example, if array 
	 *   hourlyTemperatures is declared as:
	 *   
	 *   int[] hourlyTemperatures = { 3, 6, 1, 7, 2, 9 };
	 *   
	 *   then the method call
	 *   	
	 *   	modifyArray(hourlyTemperatures);
	 *   
	 *   passes the reference of array hourlyTemperatures to method
	 *   modifyArray.
	 */
	
	/**
	 * Array parameter declaration
	 * 
	 * For a method to receive an array reference through a method call,
	 * the method's parameter list must specify an array parameter. For
	 * example, the method header for method modifyArray might be written as
	 * @param temperatures
	 */
	public static void modifyArray(int[] temperatures) {
		// Do something with the array here
	}
	
	/*
	 * What about the length of the array?
	 * 
	 * Every array object "knows" its own length (via its length field). So
	 * when we pass an array object's reference into a method, we need not
	 * pass the array length as an additional argument.
	 * 
	 * Type is important, not the length.
	 */
	
	/**
	 * Prints the contents of an array
	 * @param anArray
	 */
	public static void showArray(int[] anArray) {
		for (int i = 0; i < anArray.length; i++) {
			if (i == anArray.length - 1) {
				System.out.println(anArray[i]);
			} else {
				System.out.print(anArray[i] + ", ");
			}
		}
	}
	
}
