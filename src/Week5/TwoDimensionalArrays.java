/**
 * 
 */
package Week5;

/**
 * @author neilr
 *
 */
public class TwoDimensionalArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		enhancedForLoop();
		
		System.out.println();
		System.out.println();
		
		nestedForLoop();
	
		System.out.println();
		System.out.println();
		
		// declare a 2d array of 3 x 4
		int[][] my2dArray = new int[3][4];
		
		// return values to it from the method
		my2dArray = creatingTwoDimensionalArrayWithExpressionsIII();
		
		// print the elements
		printAllElements(my2dArray);
		
		System.out.println();
		System.out.println();
		
		// or all in one statement
		printAllElements(creatingTwoDimensionalArrayWithExpressionsIII());
		
		System.out.println();
		System.out.println();
		
		printAllElements(creatingTwoDimensionalArrayExercise());

	}
	
	/*
	 * Enhanced for Statement (AKA the ForEach Loop)
	 * 
	 * - The enhanced for statement iterates through the elements
	 *   of an array without using a loop counter, thus avoiding the
	 *   possibility of "stepping outside" the array.
	 *   
	 * - The syntax is:
	 * 
	 *		for ( parameter : arrayName ) {
	 *				
	 *				statement(s);
	 *		
	 *		}
	 *
	 *   where parameter has a type and an identifier (e.g., int number),
	 *   and arrayName is the array through which to iterate.
	 */
	
	public static void enhancedForLoop() {
		
		// create the array with values
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int total = 0; // used to keep the total
		
		// this could be replaced with the enhanced for - (below)
		for (int counter = 0; counter < array.length; counter++) {
			total += array[counter];
		}
		
		// Enhanced FOR - add each elements value to total
		for (int number : array) {
			total += number;
		}
		
		// Print the chars from the string each on a new line
		String word = "Hello";
		for (char ch:word.toCharArray()) {
			System.out.println(ch);
		}
		
	}
	
	/*
	 * - The enhanced for statement simplifies the code for
	 *   iterating through an array.
	 *   
	 * - However, the enhanced for statement can be used only to
	 *   obtain array elements - it cannot be used to modify elements.
	 *   
	 * - If your program needs to modify elements, use the traditional
	 *   counter-controlled for statement.
	 */
	
	/*
	 * Nested for statement
	 * 
	 * - The nested for loop is a looping construct when a for loop
	 *   is inside another for loop.
	 *   
	 *   for (initialisation; termination; increment) {    <-- Outer Loop
	 *   	for (initialisation; termination; increment) {    <-- Inner Loop
	 *   		statement(s);
	 *   	}
	 *   }
	 */

	public static void nestedForLoop() {
		
		// prints out 3 rows of 5 starts
		// outer loop
		for (int outer = 1; outer <= 3; outer++) {
			// inner loop
			for (int inner = 1; inner <= 5; inner++) {
			    		System.out.print("*");
		    }
			System.out.println();
		}
		
		// prints the name incrementally
		String name = "Neil Rutherford";
		for (int outer = 0; outer < name.length(); outer++) {
			// inner loop
			for (int inner = 0; inner <= outer; inner++) {
				 System.out.print(name.charAt(inner));
			}
			System.out.println();
		}
	}
	
	/*
	 * Multidimensional Arrays
	 * 
	 *  - Multidimensional arrays with two dimensions are often used
	 *    to represent tables of values consisting of information
	 *    arranged in rows and columns.
	 *    
	 *  - To identify a particular table element, we must specify two
	 *    indices. By convention, the first identifies the element's
	 *    row and the second its column.
	 *    
	 *  - Arrays that require two indices to identify a particular
	 *    element are called two-dimensional arrays.
	 */
	
	/*
	 *  			Column 0	Column 1	Column 2	Column 3
	 *   Row 0 	  a[ 0 ][ 0 ] a[ 0 ][ 1 ] a[ 0 ][ 2 ] a[ 0 ][ 3 ]
	 *   Row 1 	  a[ 1 ][ 0 ] a[ 1 ][ 1 ] a[ 1 ][ 2 ] a[ 1 ][ 3 ]
	 *   Row 2 	  a[ 2 ][ 0 ] a[ 2 ][ 1 ] a[ 2 ][ 2 ] a[ 2 ][ 3 ]
	 *   
	 *   a[ x ] [ y ]; a = array name, x = row, y = column
	 *   
	 *   A two-dimensional array named a that contains three rows and
	 *   four columns (i.e., a three-by-four array). In general, an
	 *   array with m rows and n columns is called an m-by-n array
	 *   
	 *   Every element in array a is identified by an array-access
	 *   expression of the for a[row][column];
	 *   
	 *   a is the name of the array, and row and column are the
	 *   indices that uniquely identify each element in array a
	 *   by row and column number. The names of the elements in row
	 *   0 all have a first index of 0, and the names of the elements
	 *   in column 3 all have a second index of 3.
	 *   
	 */
	
	/*
	 * Creating Two-Dimensional Arrays with Array-Creation Expressions
	 * 
	 * To recreate a table like this...
	 * 
	 * 		--------------------------------------------------
	 * 	    |			1|			2|			4|			8|
	 * 		--------------------------------------------------
	 * 	    |		   16|		   32|		   64|		  128|
	 * 		--------------------------------------------------
	 * 	    |		  256|		  512|		 1024|		 2048|
	 * 		--------------------------------------------------
	 * 
	 * We first need to declare a two dimensional array, with 3 rows
	 * and 4 columns.
	 *  
	 */
	
	public static void declaringTwoDimensionalArray() {
		// create the 2d array
		int[][] a2dArray = new int[3][4];
		
		// Creates the structure with appropriate default values
		// To populate the array each element has its own unique index
		
		a2dArray[0][0] = 1;
		a2dArray[1][3] = 128;		
	}
	
	/**
	 * Using nested loops to populate all elements of the array
	 */
	public static void creatingTwoDimensionalArrayWithExpressionsI(){
		
	   /*  ---------------------------------------------------
		*  |		  999|  	  999|        999|        999|
		*  ---------------------------------------------------
		*  |		  999|  	  999|        999|        999|
		*  ---------------------------------------------------
		*  |		  999|  	  999|        999|        999|
		*  ---------------------------------------------------
		*/
		
		// declare the 2d array
		int[][] a2dArray = new int[3][4];
		
		// assigning the same value to ALL elements row elements
		for (int rowCounter = 0; rowCounter < 3; rowCounter++) {
			// now loop through each element in the row
			for (int colCounter = 0; colCounter < 4; colCounter++) {
				// assign the value
				a2dArray[rowCounter][colCounter] = 999;
			}
		}
	}
	
	/**
	 * Populate the array with some useful information
	 */
	public static void creatingTwoDimensionalArrayWithExpressionsII(){
		
	   /*
		*  --------------------------------------------------
		*  |			1|			2|			4|			8|
		*  --------------------------------------------------
		*  |		   16|		   32|		   64|		  128|
		*  --------------------------------------------------
		*  |		  256|		  512|		 1024|		 2048|
		*  --------------------------------------------------
		*/
		
		// initial value to be inserted into the array
		int number = 1;

		// declare the 2d array
		int[][] a2dArray = new int[3][4];

		// assigning the same value to ALL elements row elements
		for (int rowCounter = 0; rowCounter < 3; rowCounter++) {
			// now loop through each element in the row
			for (int colCounter = 0; colCounter < 4; colCounter++) {
				// assign the value
				a2dArray[rowCounter][colCounter] = number;
				// update the number to be inserted into the next element
				number *= 2;
			}
		}
	}
	
	/**
	 * This is better! You can't be sure that the array will always be
	 * 3*4 so best to use a more generic approach
	 */
	public static int[][] creatingTwoDimensionalArrayWithExpressionsIII() {

		// initial value to be inserted into the array
		int number = 1;

		// declare the 2d array
		int[][] a2dArray = new int[3][4];

		// assigning the same value to ALL elements row elements
		for (int rowCounter = 0; rowCounter < a2dArray.length; rowCounter++) { // <-- Refers to the number of rows
			// now loop through each element in the row
			for (int colCounter = 0; colCounter < a2dArray[rowCounter].length; colCounter++) { // <-- Refers to the number of elements of the row
				// assign the value
				a2dArray[rowCounter][colCounter] = number;
				// update the number to be inserted into the next element
				number *= 2;
			}
		}
		return a2dArray;
	}
	 /**
	  * Output the contents of any 2d array passed in
	  * @param a2dArray
	  */
	public static void printAllElements(int[][] a2dArray) {
		// go through each row
		for (int rowCounter = 0; rowCounter < a2dArray.length; rowCounter++) {
			// now loop through each element in the row
			for (int colCounter = 0; colCounter < a2dArray[rowCounter].length; colCounter++) {
				// printing the value
				System.out.printf("[%d][%d] : %d, ", rowCounter, colCounter, a2dArray[rowCounter][colCounter]);
			}
		}
	}
	
	/**
	 * Exercise. Create a 2D array with the below contents,
	 * output the contents to screen
	 */
	public static int[][] creatingTwoDimensionalArrayExercise(){
		
	   /*
		*  ---------------------------------------
		*  |			2|			4|			6|	
		*  ---------------------------------------
		*  |		    8|		   10|		   12|	
		*  ---------------------------------------
		*  |		   14|		   16|		   18|	
		*  ---------------------------------------
		*  |		   20|		   22|		   24|	
		*  ---------------------------------------
		*/
		
		// initial value to be inserted into the array
		int number = 2;

		// declare the 2d array
		int[][] a2dArray = new int[4][3];

		// assigning the same value to ALL elements row elements
		for (int rowCounter = 0; rowCounter < 4; rowCounter++) {
			// now loop through each element in the row
			for (int colCounter = 0; colCounter < 3; colCounter++) {
				// assign the value
				a2dArray[rowCounter][colCounter] = number;
				// update the number to be inserted into the next element
				number += 2;
			}
		}
		return a2dArray;
	}
	
	/*
	 * Sorting an array - bubble sort
	 * 
	 * - In the bubble sort, as the elements are sorted they gradually "bubble"
	 *   (or rise) to their proper location in the array, like bubbles rising
	 *   in a glass
	 *   
	 * - The bubble sort repeatedly compares adjacent elements of an array. The
	 *   first and second elements are compared and swapped if out of order. Then
	 *   the second and third elements are compared and swapped if out of order.
	 *   
	 * - This sorting process continues until the last two elements are compared
	 *   and swapped if out of order.
	 *   
	 *   			-------------------------------------------------
	 *   			|	84	|	69	|	76	|	86	|	94	|	91	|
	 *      		-------------------------------------------------
	 *      			  ---->   ---->   ---->   ---->   ---->
	 *      
	 * - When this first pass through the array is complete, the bubble sort returns
	 *   to elements one and two and starts the process all over again. So, when does
	 *   it stop? The bubble sort knows that it is finished when it examines the entire
	 *   array and no "swaps" are needed (thus the list is in proper order). The
	 *   bubble sort keeps track of the occurring swaps by the use of a flag.
	 *   
	 *   
	 */
}
